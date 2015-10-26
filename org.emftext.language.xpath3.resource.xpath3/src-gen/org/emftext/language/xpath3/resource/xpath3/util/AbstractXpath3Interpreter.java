/**
 * Copyright (c) 2013, 2015 Denis Nikiforov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Denis Nikiforov - initial API and implementation
 */
package org.emftext.language.xpath3.resource.xpath3.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.xpath3.AbbrevForwardStep;
import org.emftext.language.xpath3.AbbrevReverseStep;
import org.emftext.language.xpath3.AdditiveExpr;
import org.emftext.language.xpath3.AdditiveExprChild;
import org.emftext.language.xpath3.AndExpr;
import org.emftext.language.xpath3.AndExprChild;
import org.emftext.language.xpath3.AnyExpr;
import org.emftext.language.xpath3.AnyItemType;
import org.emftext.language.xpath3.AnyKindTest;
import org.emftext.language.xpath3.AnyWildcard;
import org.emftext.language.xpath3.AtomicItemType;
import org.emftext.language.xpath3.AtomicType;
import org.emftext.language.xpath3.AttributeTest;
import org.emftext.language.xpath3.AxisStep;
import org.emftext.language.xpath3.CastExpr;
import org.emftext.language.xpath3.CastExprChild;
import org.emftext.language.xpath3.CastableExpr;
import org.emftext.language.xpath3.CastableExprChild;
import org.emftext.language.xpath3.ChildStepExpr;
import org.emftext.language.xpath3.Comment;
import org.emftext.language.xpath3.CommentTest;
import org.emftext.language.xpath3.Comp;
import org.emftext.language.xpath3.ComparisonExpr;
import org.emftext.language.xpath3.ComparisonExprChild;
import org.emftext.language.xpath3.ContextItemExpr;
import org.emftext.language.xpath3.DecimalLiteral;
import org.emftext.language.xpath3.DescOrSelfStepExpr;
import org.emftext.language.xpath3.DocumentTest;
import org.emftext.language.xpath3.DoubleLiteral;
import org.emftext.language.xpath3.ElementTest;
import org.emftext.language.xpath3.EmptySequenceType;
import org.emftext.language.xpath3.Expr;
import org.emftext.language.xpath3.ExprSingle;
import org.emftext.language.xpath3.FilterExpr;
import org.emftext.language.xpath3.FilterExprChild;
import org.emftext.language.xpath3.ForExpr;
import org.emftext.language.xpath3.ForwardStep;
import org.emftext.language.xpath3.FunctionCall;
import org.emftext.language.xpath3.GeneralComp;
import org.emftext.language.xpath3.GeneralForwardStep;
import org.emftext.language.xpath3.GeneralReverseStep;
import org.emftext.language.xpath3.IfExpr;
import org.emftext.language.xpath3.InstanceofExpr;
import org.emftext.language.xpath3.InstanceofExprChild;
import org.emftext.language.xpath3.IntegerLiteral;
import org.emftext.language.xpath3.IntersectExceptExpr;
import org.emftext.language.xpath3.IntersectExceptExprChild;
import org.emftext.language.xpath3.ItemKindTest;
import org.emftext.language.xpath3.ItemSequenceType;
import org.emftext.language.xpath3.ItemType;
import org.emftext.language.xpath3.Iterator;
import org.emftext.language.xpath3.KindTest;
import org.emftext.language.xpath3.Literal;
import org.emftext.language.xpath3.LocalNameWildcard;
import org.emftext.language.xpath3.MultiplicativeExpr;
import org.emftext.language.xpath3.MultiplicativeExprChild;
import org.emftext.language.xpath3.NCNamePITest;
import org.emftext.language.xpath3.NameAttributeTest;
import org.emftext.language.xpath3.NameElementTest;
import org.emftext.language.xpath3.NameTest;
import org.emftext.language.xpath3.NamespaceWildcard;
import org.emftext.language.xpath3.NodeComp;
import org.emftext.language.xpath3.NodeKindTest;
import org.emftext.language.xpath3.NodeTest;
import org.emftext.language.xpath3.NumericLiteral;
import org.emftext.language.xpath3.OptionalAtomicType;
import org.emftext.language.xpath3.OrExpr;
import org.emftext.language.xpath3.OrExprChild;
import org.emftext.language.xpath3.PITest;
import org.emftext.language.xpath3.ParenthesizedExpr;
import org.emftext.language.xpath3.ParenthesizedExprChild;
import org.emftext.language.xpath3.PathExpr;
import org.emftext.language.xpath3.PathExprChild;
import org.emftext.language.xpath3.Predicate;
import org.emftext.language.xpath3.PrimaryExpr;
import org.emftext.language.xpath3.QNameTest;
import org.emftext.language.xpath3.QuantifiedExpr;
import org.emftext.language.xpath3.RangeExpr;
import org.emftext.language.xpath3.RangeExprChild;
import org.emftext.language.xpath3.ReverseStep;
import org.emftext.language.xpath3.RootStepExpr;
import org.emftext.language.xpath3.SchemaAttributeTest;
import org.emftext.language.xpath3.SchemaElementTest;
import org.emftext.language.xpath3.SelfStepExpr;
import org.emftext.language.xpath3.SelfStepExprChild;
import org.emftext.language.xpath3.SequenceType;
import org.emftext.language.xpath3.SingleType;
import org.emftext.language.xpath3.StepExpr;
import org.emftext.language.xpath3.StringLiteral;
import org.emftext.language.xpath3.StringLiteralPITest;
import org.emftext.language.xpath3.TextTest;
import org.emftext.language.xpath3.TreatExpr;
import org.emftext.language.xpath3.TreatExprChild;
import org.emftext.language.xpath3.UnaryExpr;
import org.emftext.language.xpath3.UnaryExprChild;
import org.emftext.language.xpath3.UnionExpr;
import org.emftext.language.xpath3.UnionExprChild;
import org.emftext.language.xpath3.ValueComp;
import org.emftext.language.xpath3.ValueExpr;
import org.emftext.language.xpath3.VarRef;
import org.emftext.language.xpath3.Wildcard;
import org.emftext.language.xpath3.WildcardAttributeTest;
import org.emftext.language.xpath3.WildcardElementTest;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractXpath3Interpreter<ResultType, ContextType> {
	
	private Stack<EObject> interpretationStack = new Stack<EObject>();
	private List<org.emftext.language.xpath3.resource.xpath3.IXpath3InterpreterListener> listeners = new ArrayList<org.emftext.language.xpath3.resource.xpath3.IXpath3InterpreterListener>();
	private EObject nextObjectToInterprete;
	private ContextType currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.emftext.language.xpath3.Expr) {
			result = interprete_org_emftext_language_xpath3_Expr((org.emftext.language.xpath3.Expr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ForExpr) {
			result = interprete_org_emftext_language_xpath3_ForExpr((org.emftext.language.xpath3.ForExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.QuantifiedExpr) {
			result = interprete_org_emftext_language_xpath3_QuantifiedExpr((org.emftext.language.xpath3.QuantifiedExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.IfExpr) {
			result = interprete_org_emftext_language_xpath3_IfExpr((org.emftext.language.xpath3.IfExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.OrExpr) {
			result = interprete_org_emftext_language_xpath3_OrExpr((org.emftext.language.xpath3.OrExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AndExpr) {
			result = interprete_org_emftext_language_xpath3_AndExpr((org.emftext.language.xpath3.AndExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ComparisonExpr) {
			result = interprete_org_emftext_language_xpath3_ComparisonExpr((org.emftext.language.xpath3.ComparisonExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.RangeExpr) {
			result = interprete_org_emftext_language_xpath3_RangeExpr((org.emftext.language.xpath3.RangeExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AdditiveExpr) {
			result = interprete_org_emftext_language_xpath3_AdditiveExpr((org.emftext.language.xpath3.AdditiveExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.MultiplicativeExpr) {
			result = interprete_org_emftext_language_xpath3_MultiplicativeExpr((org.emftext.language.xpath3.MultiplicativeExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.UnionExpr) {
			result = interprete_org_emftext_language_xpath3_UnionExpr((org.emftext.language.xpath3.UnionExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.IntersectExceptExpr) {
			result = interprete_org_emftext_language_xpath3_IntersectExceptExpr((org.emftext.language.xpath3.IntersectExceptExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.InstanceofExpr) {
			result = interprete_org_emftext_language_xpath3_InstanceofExpr((org.emftext.language.xpath3.InstanceofExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.TreatExpr) {
			result = interprete_org_emftext_language_xpath3_TreatExpr((org.emftext.language.xpath3.TreatExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.InstanceofExprChild) {
			result = interprete_org_emftext_language_xpath3_InstanceofExprChild((org.emftext.language.xpath3.InstanceofExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.IntersectExceptExprChild) {
			result = interprete_org_emftext_language_xpath3_IntersectExceptExprChild((org.emftext.language.xpath3.IntersectExceptExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.UnionExprChild) {
			result = interprete_org_emftext_language_xpath3_UnionExprChild((org.emftext.language.xpath3.UnionExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.MultiplicativeExprChild) {
			result = interprete_org_emftext_language_xpath3_MultiplicativeExprChild((org.emftext.language.xpath3.MultiplicativeExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AdditiveExprChild) {
			result = interprete_org_emftext_language_xpath3_AdditiveExprChild((org.emftext.language.xpath3.AdditiveExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.RangeExprChild) {
			result = interprete_org_emftext_language_xpath3_RangeExprChild((org.emftext.language.xpath3.RangeExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ComparisonExprChild) {
			result = interprete_org_emftext_language_xpath3_ComparisonExprChild((org.emftext.language.xpath3.ComparisonExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AndExprChild) {
			result = interprete_org_emftext_language_xpath3_AndExprChild((org.emftext.language.xpath3.AndExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.OrExprChild) {
			result = interprete_org_emftext_language_xpath3_OrExprChild((org.emftext.language.xpath3.OrExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ExprSingle) {
			result = interprete_org_emftext_language_xpath3_ExprSingle((org.emftext.language.xpath3.ExprSingle) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AnyExpr) {
			result = interprete_org_emftext_language_xpath3_AnyExpr((org.emftext.language.xpath3.AnyExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.Iterator) {
			result = interprete_org_emftext_language_xpath3_Iterator((org.emftext.language.xpath3.Iterator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.CastableExpr) {
			result = interprete_org_emftext_language_xpath3_CastableExpr((org.emftext.language.xpath3.CastableExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.CastExpr) {
			result = interprete_org_emftext_language_xpath3_CastExpr((org.emftext.language.xpath3.CastExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.UnaryExpr) {
			result = interprete_org_emftext_language_xpath3_UnaryExpr((org.emftext.language.xpath3.UnaryExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.PathExpr) {
			result = interprete_org_emftext_language_xpath3_PathExpr((org.emftext.language.xpath3.PathExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ValueExpr) {
			result = interprete_org_emftext_language_xpath3_ValueExpr((org.emftext.language.xpath3.ValueExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.RootStepExpr) {
			result = interprete_org_emftext_language_xpath3_RootStepExpr((org.emftext.language.xpath3.RootStepExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ChildStepExpr) {
			result = interprete_org_emftext_language_xpath3_ChildStepExpr((org.emftext.language.xpath3.ChildStepExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.DescOrSelfStepExpr) {
			result = interprete_org_emftext_language_xpath3_DescOrSelfStepExpr((org.emftext.language.xpath3.DescOrSelfStepExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.SelfStepExpr) {
			result = interprete_org_emftext_language_xpath3_SelfStepExpr((org.emftext.language.xpath3.SelfStepExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.FilterExpr) {
			result = interprete_org_emftext_language_xpath3_FilterExpr((org.emftext.language.xpath3.FilterExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ReverseStep) {
			result = interprete_org_emftext_language_xpath3_ReverseStep((org.emftext.language.xpath3.ReverseStep) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AbbrevForwardStep) {
			result = interprete_org_emftext_language_xpath3_AbbrevForwardStep((org.emftext.language.xpath3.AbbrevForwardStep) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AbbrevReverseStep) {
			result = interprete_org_emftext_language_xpath3_AbbrevReverseStep((org.emftext.language.xpath3.AbbrevReverseStep) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.StepExpr) {
			result = interprete_org_emftext_language_xpath3_StepExpr((org.emftext.language.xpath3.StepExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.FilterExprChild) {
			result = interprete_org_emftext_language_xpath3_FilterExprChild((org.emftext.language.xpath3.FilterExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.GeneralForwardStep) {
			result = interprete_org_emftext_language_xpath3_GeneralForwardStep((org.emftext.language.xpath3.GeneralForwardStep) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ForwardStep) {
			result = interprete_org_emftext_language_xpath3_ForwardStep((org.emftext.language.xpath3.ForwardStep) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.GeneralReverseStep) {
			result = interprete_org_emftext_language_xpath3_GeneralReverseStep((org.emftext.language.xpath3.GeneralReverseStep) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AxisStep) {
			result = interprete_org_emftext_language_xpath3_AxisStep((org.emftext.language.xpath3.AxisStep) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.SelfStepExprChild) {
			result = interprete_org_emftext_language_xpath3_SelfStepExprChild((org.emftext.language.xpath3.SelfStepExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.PathExprChild) {
			result = interprete_org_emftext_language_xpath3_PathExprChild((org.emftext.language.xpath3.PathExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.UnaryExprChild) {
			result = interprete_org_emftext_language_xpath3_UnaryExprChild((org.emftext.language.xpath3.UnaryExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.CastExprChild) {
			result = interprete_org_emftext_language_xpath3_CastExprChild((org.emftext.language.xpath3.CastExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.CastableExprChild) {
			result = interprete_org_emftext_language_xpath3_CastableExprChild((org.emftext.language.xpath3.CastableExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.TreatExprChild) {
			result = interprete_org_emftext_language_xpath3_TreatExprChild((org.emftext.language.xpath3.TreatExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.NodeKindTest) {
			result = interprete_org_emftext_language_xpath3_NodeKindTest((org.emftext.language.xpath3.NodeKindTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.QNameTest) {
			result = interprete_org_emftext_language_xpath3_QNameTest((org.emftext.language.xpath3.QNameTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AnyWildcard) {
			result = interprete_org_emftext_language_xpath3_AnyWildcard((org.emftext.language.xpath3.AnyWildcard) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.LocalNameWildcard) {
			result = interprete_org_emftext_language_xpath3_LocalNameWildcard((org.emftext.language.xpath3.LocalNameWildcard) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.NamespaceWildcard) {
			result = interprete_org_emftext_language_xpath3_NamespaceWildcard((org.emftext.language.xpath3.NamespaceWildcard) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.Wildcard) {
			result = interprete_org_emftext_language_xpath3_Wildcard((org.emftext.language.xpath3.Wildcard) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.NameTest) {
			result = interprete_org_emftext_language_xpath3_NameTest((org.emftext.language.xpath3.NameTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.NodeTest) {
			result = interprete_org_emftext_language_xpath3_NodeTest((org.emftext.language.xpath3.NodeTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.Predicate) {
			result = interprete_org_emftext_language_xpath3_Predicate((org.emftext.language.xpath3.Predicate) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.StringLiteral) {
			result = interprete_org_emftext_language_xpath3_StringLiteral((org.emftext.language.xpath3.StringLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.DecimalLiteral) {
			result = interprete_org_emftext_language_xpath3_DecimalLiteral((org.emftext.language.xpath3.DecimalLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.Literal) {
			result = interprete_org_emftext_language_xpath3_Literal((org.emftext.language.xpath3.Literal) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.VarRef) {
			result = interprete_org_emftext_language_xpath3_VarRef((org.emftext.language.xpath3.VarRef) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ParenthesizedExpr) {
			result = interprete_org_emftext_language_xpath3_ParenthesizedExpr((org.emftext.language.xpath3.ParenthesizedExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ContextItemExpr) {
			result = interprete_org_emftext_language_xpath3_ContextItemExpr((org.emftext.language.xpath3.ContextItemExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.FunctionCall) {
			result = interprete_org_emftext_language_xpath3_FunctionCall((org.emftext.language.xpath3.FunctionCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.IntegerLiteral) {
			result = interprete_org_emftext_language_xpath3_IntegerLiteral((org.emftext.language.xpath3.IntegerLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.DoubleLiteral) {
			result = interprete_org_emftext_language_xpath3_DoubleLiteral((org.emftext.language.xpath3.DoubleLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.NumericLiteral) {
			result = interprete_org_emftext_language_xpath3_NumericLiteral((org.emftext.language.xpath3.NumericLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.PrimaryExpr) {
			result = interprete_org_emftext_language_xpath3_PrimaryExpr((org.emftext.language.xpath3.PrimaryExpr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ParenthesizedExprChild) {
			result = interprete_org_emftext_language_xpath3_ParenthesizedExprChild((org.emftext.language.xpath3.ParenthesizedExprChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.GeneralComp) {
			result = interprete_org_emftext_language_xpath3_GeneralComp((org.emftext.language.xpath3.GeneralComp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ValueComp) {
			result = interprete_org_emftext_language_xpath3_ValueComp((org.emftext.language.xpath3.ValueComp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.NodeComp) {
			result = interprete_org_emftext_language_xpath3_NodeComp((org.emftext.language.xpath3.NodeComp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.Comp) {
			result = interprete_org_emftext_language_xpath3_Comp((org.emftext.language.xpath3.Comp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.SingleType) {
			result = interprete_org_emftext_language_xpath3_SingleType((org.emftext.language.xpath3.SingleType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AtomicType) {
			result = interprete_org_emftext_language_xpath3_AtomicType((org.emftext.language.xpath3.AtomicType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.OptionalAtomicType) {
			result = interprete_org_emftext_language_xpath3_OptionalAtomicType((org.emftext.language.xpath3.OptionalAtomicType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.EmptySequenceType) {
			result = interprete_org_emftext_language_xpath3_EmptySequenceType((org.emftext.language.xpath3.EmptySequenceType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ItemSequenceType) {
			result = interprete_org_emftext_language_xpath3_ItemSequenceType((org.emftext.language.xpath3.ItemSequenceType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.SequenceType) {
			result = interprete_org_emftext_language_xpath3_SequenceType((org.emftext.language.xpath3.SequenceType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ItemKindTest) {
			result = interprete_org_emftext_language_xpath3_ItemKindTest((org.emftext.language.xpath3.ItemKindTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AnyItemType) {
			result = interprete_org_emftext_language_xpath3_AnyItemType((org.emftext.language.xpath3.AnyItemType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AtomicItemType) {
			result = interprete_org_emftext_language_xpath3_AtomicItemType((org.emftext.language.xpath3.AtomicItemType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ItemType) {
			result = interprete_org_emftext_language_xpath3_ItemType((org.emftext.language.xpath3.ItemType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.DocumentTest) {
			result = interprete_org_emftext_language_xpath3_DocumentTest((org.emftext.language.xpath3.DocumentTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.NameElementTest) {
			result = interprete_org_emftext_language_xpath3_NameElementTest((org.emftext.language.xpath3.NameElementTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.WildcardElementTest) {
			result = interprete_org_emftext_language_xpath3_WildcardElementTest((org.emftext.language.xpath3.WildcardElementTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.ElementTest) {
			result = interprete_org_emftext_language_xpath3_ElementTest((org.emftext.language.xpath3.ElementTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.NameAttributeTest) {
			result = interprete_org_emftext_language_xpath3_NameAttributeTest((org.emftext.language.xpath3.NameAttributeTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.WildcardAttributeTest) {
			result = interprete_org_emftext_language_xpath3_WildcardAttributeTest((org.emftext.language.xpath3.WildcardAttributeTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AttributeTest) {
			result = interprete_org_emftext_language_xpath3_AttributeTest((org.emftext.language.xpath3.AttributeTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.SchemaElementTest) {
			result = interprete_org_emftext_language_xpath3_SchemaElementTest((org.emftext.language.xpath3.SchemaElementTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.SchemaAttributeTest) {
			result = interprete_org_emftext_language_xpath3_SchemaAttributeTest((org.emftext.language.xpath3.SchemaAttributeTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.NCNamePITest) {
			result = interprete_org_emftext_language_xpath3_NCNamePITest((org.emftext.language.xpath3.NCNamePITest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.StringLiteralPITest) {
			result = interprete_org_emftext_language_xpath3_StringLiteralPITest((org.emftext.language.xpath3.StringLiteralPITest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.PITest) {
			result = interprete_org_emftext_language_xpath3_PITest((org.emftext.language.xpath3.PITest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.CommentTest) {
			result = interprete_org_emftext_language_xpath3_CommentTest((org.emftext.language.xpath3.CommentTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.TextTest) {
			result = interprete_org_emftext_language_xpath3_TextTest((org.emftext.language.xpath3.TextTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.AnyKindTest) {
			result = interprete_org_emftext_language_xpath3_AnyKindTest((org.emftext.language.xpath3.AnyKindTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.KindTest) {
			result = interprete_org_emftext_language_xpath3_KindTest((org.emftext.language.xpath3.KindTest) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.xpath3.Comment) {
			result = interprete_org_emftext_language_xpath3_Comment((org.emftext.language.xpath3.Comment) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AnyExpr(AnyExpr anyExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_Expr(Expr expr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ExprSingle(ExprSingle exprSingle, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ForExpr(ForExpr forExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_QuantifiedExpr(QuantifiedExpr quantifiedExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_IfExpr(IfExpr ifExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_Iterator(Iterator iterator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_OrExpr(OrExpr orExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_OrExprChild(OrExprChild orExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AndExpr(AndExpr andExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AndExprChild(AndExprChild andExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ComparisonExpr(ComparisonExpr comparisonExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ComparisonExprChild(ComparisonExprChild comparisonExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_RangeExpr(RangeExpr rangeExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_RangeExprChild(RangeExprChild rangeExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AdditiveExpr(AdditiveExpr additiveExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AdditiveExprChild(AdditiveExprChild additiveExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_MultiplicativeExpr(MultiplicativeExpr multiplicativeExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_MultiplicativeExprChild(MultiplicativeExprChild multiplicativeExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_UnionExpr(UnionExpr unionExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_UnionExprChild(UnionExprChild unionExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_IntersectExceptExpr(IntersectExceptExpr intersectExceptExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_IntersectExceptExprChild(IntersectExceptExprChild intersectExceptExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_InstanceofExpr(InstanceofExpr instanceofExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_InstanceofExprChild(InstanceofExprChild instanceofExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_TreatExpr(TreatExpr treatExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_TreatExprChild(TreatExprChild treatExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_CastableExpr(CastableExpr castableExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_CastableExprChild(CastableExprChild castableExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_CastExpr(CastExpr castExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_CastExprChild(CastExprChild castExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_UnaryExpr(UnaryExpr unaryExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_UnaryExprChild(UnaryExprChild unaryExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ValueExpr(ValueExpr valueExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_PathExpr(PathExpr pathExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_PathExprChild(PathExprChild pathExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_RootStepExpr(RootStepExpr rootStepExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ChildStepExpr(ChildStepExpr childStepExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_DescOrSelfStepExpr(DescOrSelfStepExpr descOrSelfStepExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_SelfStepExpr(SelfStepExpr selfStepExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_SelfStepExprChild(SelfStepExprChild selfStepExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_StepExpr(StepExpr stepExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_FilterExpr(FilterExpr filterExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_FilterExprChild(FilterExprChild filterExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AxisStep(AxisStep axisStep, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ForwardStep(ForwardStep forwardStep, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ReverseStep(ReverseStep reverseStep, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_GeneralForwardStep(GeneralForwardStep generalForwardStep, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AbbrevForwardStep(AbbrevForwardStep abbrevForwardStep, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_GeneralReverseStep(GeneralReverseStep generalReverseStep, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AbbrevReverseStep(AbbrevReverseStep abbrevReverseStep, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_NodeTest(NodeTest nodeTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_NodeKindTest(NodeKindTest nodeKindTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_NameTest(NameTest nameTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_QNameTest(QNameTest qNameTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_Wildcard(Wildcard wildcard, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AnyWildcard(AnyWildcard anyWildcard, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_LocalNameWildcard(LocalNameWildcard localNameWildcard, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_NamespaceWildcard(NamespaceWildcard namespaceWildcard, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_Predicate(Predicate predicate, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_PrimaryExpr(PrimaryExpr primaryExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_Literal(Literal literal, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_VarRef(VarRef varRef, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ParenthesizedExpr(ParenthesizedExpr parenthesizedExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ParenthesizedExprChild(ParenthesizedExprChild parenthesizedExprChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ContextItemExpr(ContextItemExpr contextItemExpr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_FunctionCall(FunctionCall functionCall, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_NumericLiteral(NumericLiteral numericLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_StringLiteral(StringLiteral stringLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_IntegerLiteral(IntegerLiteral integerLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_DecimalLiteral(DecimalLiteral decimalLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_DoubleLiteral(DoubleLiteral doubleLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_Comp(Comp comp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_GeneralComp(GeneralComp generalComp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ValueComp(ValueComp valueComp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_NodeComp(NodeComp nodeComp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_SingleType(SingleType singleType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AtomicType(AtomicType atomicType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_OptionalAtomicType(OptionalAtomicType optionalAtomicType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_SequenceType(SequenceType sequenceType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_EmptySequenceType(EmptySequenceType emptySequenceType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ItemSequenceType(ItemSequenceType itemSequenceType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ItemType(ItemType itemType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ItemKindTest(ItemKindTest itemKindTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AnyItemType(AnyItemType anyItemType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AtomicItemType(AtomicItemType atomicItemType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_KindTest(KindTest kindTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_DocumentTest(DocumentTest documentTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_ElementTest(ElementTest elementTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_NameElementTest(NameElementTest nameElementTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_WildcardElementTest(WildcardElementTest wildcardElementTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AttributeTest(AttributeTest attributeTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_NameAttributeTest(NameAttributeTest nameAttributeTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_WildcardAttributeTest(WildcardAttributeTest wildcardAttributeTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_SchemaElementTest(SchemaElementTest schemaElementTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_SchemaAttributeTest(SchemaAttributeTest schemaAttributeTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_PITest(PITest pITest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_NCNamePITest(NCNamePITest nCNamePITest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_StringLiteralPITest(StringLiteralPITest stringLiteralPITest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_CommentTest(CommentTest commentTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_TextTest(TextTest textTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_AnyKindTest(AnyKindTest anyKindTest, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_xpath3_Comment(Comment comment, ContextType context) {
		return null;
	}
	
	private void notifyListeners(EObject element) {
		for (org.emftext.language.xpath3.resource.xpath3.IXpath3InterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(Collection<? extends EObject> objects) {
		for (EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(Collection<? extends EObject> objects) {
		List<EObject> reverse = new ArrayList<EObject>(objects.size());
		reverse.addAll(objects);
		Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(EObject root) {
		List<EObject> objects = new ArrayList<EObject>();
		objects.add(root);
		java.util.Iterator<EObject> it = root.eAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.emftext.language.xpath3.resource.xpath3.IXpath3InterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.emftext.language.xpath3.resource.xpath3.IXpath3InterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public Stack<EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public ContextType getCurrentContext() {
		return currentContext;
	}
	
}
