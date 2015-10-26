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
package org.emftext.language.xpath3.resource.xpath3.mopp;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * This class provides an implementation of the
 * org.emftext.language.xpath3.resource.xpath3.IXpath3TextDiagnostic interface.
 * However, it is recommended to use the
 * org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Printer2 instead,
 * because it provides advanced printing features. There are even some features
 * (e.g., printing enumeration terminals) which are only supported by that class.
 */
public class Xpath3Printer implements org.emftext.language.xpath3.resource.xpath3.IXpath3TextPrinter {
	
	protected org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolverFactory tokenResolverFactory = new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenResolverFactory();
	
	protected OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource resource;
	
	private Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public Xpath3Printer(OutputStream outputStream, org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(Map<String, Integer> featureCounter, Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(EObject element, PrintWriter out, String globaltab) {
		if (element == null) {
			throw new IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.emftext.language.xpath3.Expr) {
			print_org_emftext_language_xpath3_Expr((org.emftext.language.xpath3.Expr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.ForExpr) {
			print_org_emftext_language_xpath3_ForExpr((org.emftext.language.xpath3.ForExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.QuantifiedExpr) {
			print_org_emftext_language_xpath3_QuantifiedExpr((org.emftext.language.xpath3.QuantifiedExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.Iterator) {
			print_org_emftext_language_xpath3_Iterator((org.emftext.language.xpath3.Iterator) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.IfExpr) {
			print_org_emftext_language_xpath3_IfExpr((org.emftext.language.xpath3.IfExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.OrExpr) {
			print_org_emftext_language_xpath3_OrExpr((org.emftext.language.xpath3.OrExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.AndExpr) {
			print_org_emftext_language_xpath3_AndExpr((org.emftext.language.xpath3.AndExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.ComparisonExpr) {
			print_org_emftext_language_xpath3_ComparisonExpr((org.emftext.language.xpath3.ComparisonExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.RangeExpr) {
			print_org_emftext_language_xpath3_RangeExpr((org.emftext.language.xpath3.RangeExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.GeneralComp) {
			print_org_emftext_language_xpath3_GeneralComp((org.emftext.language.xpath3.GeneralComp) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.ValueComp) {
			print_org_emftext_language_xpath3_ValueComp((org.emftext.language.xpath3.ValueComp) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.NodeComp) {
			print_org_emftext_language_xpath3_NodeComp((org.emftext.language.xpath3.NodeComp) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.AdditiveExpr) {
			print_org_emftext_language_xpath3_AdditiveExpr((org.emftext.language.xpath3.AdditiveExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.MultiplicativeExpr) {
			print_org_emftext_language_xpath3_MultiplicativeExpr((org.emftext.language.xpath3.MultiplicativeExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.UnionExpr) {
			print_org_emftext_language_xpath3_UnionExpr((org.emftext.language.xpath3.UnionExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.IntersectExceptExpr) {
			print_org_emftext_language_xpath3_IntersectExceptExpr((org.emftext.language.xpath3.IntersectExceptExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.InstanceofExpr) {
			print_org_emftext_language_xpath3_InstanceofExpr((org.emftext.language.xpath3.InstanceofExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.TreatExpr) {
			print_org_emftext_language_xpath3_TreatExpr((org.emftext.language.xpath3.TreatExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.CastableExpr) {
			print_org_emftext_language_xpath3_CastableExpr((org.emftext.language.xpath3.CastableExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.CastExpr) {
			print_org_emftext_language_xpath3_CastExpr((org.emftext.language.xpath3.CastExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.UnaryExpr) {
			print_org_emftext_language_xpath3_UnaryExpr((org.emftext.language.xpath3.UnaryExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.FilterExpr) {
			print_org_emftext_language_xpath3_FilterExpr((org.emftext.language.xpath3.FilterExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.FunctionCall) {
			print_org_emftext_language_xpath3_FunctionCall((org.emftext.language.xpath3.FunctionCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.PathExpr) {
			print_org_emftext_language_xpath3_PathExpr((org.emftext.language.xpath3.PathExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.ChildStepExpr) {
			print_org_emftext_language_xpath3_ChildStepExpr((org.emftext.language.xpath3.ChildStepExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.DescOrSelfStepExpr) {
			print_org_emftext_language_xpath3_DescOrSelfStepExpr((org.emftext.language.xpath3.DescOrSelfStepExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.RootStepExpr) {
			print_org_emftext_language_xpath3_RootStepExpr((org.emftext.language.xpath3.RootStepExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.SelfStepExpr) {
			print_org_emftext_language_xpath3_SelfStepExpr((org.emftext.language.xpath3.SelfStepExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.GeneralForwardStep) {
			print_org_emftext_language_xpath3_GeneralForwardStep((org.emftext.language.xpath3.GeneralForwardStep) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.AbbrevForwardStep) {
			print_org_emftext_language_xpath3_AbbrevForwardStep((org.emftext.language.xpath3.AbbrevForwardStep) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.GeneralReverseStep) {
			print_org_emftext_language_xpath3_GeneralReverseStep((org.emftext.language.xpath3.GeneralReverseStep) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.AbbrevReverseStep) {
			print_org_emftext_language_xpath3_AbbrevReverseStep((org.emftext.language.xpath3.AbbrevReverseStep) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.NodeKindTest) {
			print_org_emftext_language_xpath3_NodeKindTest((org.emftext.language.xpath3.NodeKindTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.QNameTest) {
			print_org_emftext_language_xpath3_QNameTest((org.emftext.language.xpath3.QNameTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.AnyWildcard) {
			print_org_emftext_language_xpath3_AnyWildcard((org.emftext.language.xpath3.AnyWildcard) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.LocalNameWildcard) {
			print_org_emftext_language_xpath3_LocalNameWildcard((org.emftext.language.xpath3.LocalNameWildcard) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.NamespaceWildcard) {
			print_org_emftext_language_xpath3_NamespaceWildcard((org.emftext.language.xpath3.NamespaceWildcard) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.Predicate) {
			print_org_emftext_language_xpath3_Predicate((org.emftext.language.xpath3.Predicate) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.VarRef) {
			print_org_emftext_language_xpath3_VarRef((org.emftext.language.xpath3.VarRef) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.ParenthesizedExpr) {
			print_org_emftext_language_xpath3_ParenthesizedExpr((org.emftext.language.xpath3.ParenthesizedExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.ContextItemExpr) {
			print_org_emftext_language_xpath3_ContextItemExpr((org.emftext.language.xpath3.ContextItemExpr) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.SingleType) {
			print_org_emftext_language_xpath3_SingleType((org.emftext.language.xpath3.SingleType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.EmptySequenceType) {
			print_org_emftext_language_xpath3_EmptySequenceType((org.emftext.language.xpath3.EmptySequenceType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.ItemSequenceType) {
			print_org_emftext_language_xpath3_ItemSequenceType((org.emftext.language.xpath3.ItemSequenceType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.ItemKindTest) {
			print_org_emftext_language_xpath3_ItemKindTest((org.emftext.language.xpath3.ItemKindTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.AnyItemType) {
			print_org_emftext_language_xpath3_AnyItemType((org.emftext.language.xpath3.AnyItemType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.AtomicItemType) {
			print_org_emftext_language_xpath3_AtomicItemType((org.emftext.language.xpath3.AtomicItemType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.AtomicType) {
			print_org_emftext_language_xpath3_AtomicType((org.emftext.language.xpath3.AtomicType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.OptionalAtomicType) {
			print_org_emftext_language_xpath3_OptionalAtomicType((org.emftext.language.xpath3.OptionalAtomicType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.AnyKindTest) {
			print_org_emftext_language_xpath3_AnyKindTest((org.emftext.language.xpath3.AnyKindTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.DocumentTest) {
			print_org_emftext_language_xpath3_DocumentTest((org.emftext.language.xpath3.DocumentTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.TextTest) {
			print_org_emftext_language_xpath3_TextTest((org.emftext.language.xpath3.TextTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.CommentTest) {
			print_org_emftext_language_xpath3_CommentTest((org.emftext.language.xpath3.CommentTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.NCNamePITest) {
			print_org_emftext_language_xpath3_NCNamePITest((org.emftext.language.xpath3.NCNamePITest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.StringLiteralPITest) {
			print_org_emftext_language_xpath3_StringLiteralPITest((org.emftext.language.xpath3.StringLiteralPITest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.WildcardAttributeTest) {
			print_org_emftext_language_xpath3_WildcardAttributeTest((org.emftext.language.xpath3.WildcardAttributeTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.NameAttributeTest) {
			print_org_emftext_language_xpath3_NameAttributeTest((org.emftext.language.xpath3.NameAttributeTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.SchemaAttributeTest) {
			print_org_emftext_language_xpath3_SchemaAttributeTest((org.emftext.language.xpath3.SchemaAttributeTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.WildcardElementTest) {
			print_org_emftext_language_xpath3_WildcardElementTest((org.emftext.language.xpath3.WildcardElementTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.NameElementTest) {
			print_org_emftext_language_xpath3_NameElementTest((org.emftext.language.xpath3.NameElementTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.SchemaElementTest) {
			print_org_emftext_language_xpath3_SchemaElementTest((org.emftext.language.xpath3.SchemaElementTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.IntegerLiteral) {
			print_org_emftext_language_xpath3_IntegerLiteral((org.emftext.language.xpath3.IntegerLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.DecimalLiteral) {
			print_org_emftext_language_xpath3_DecimalLiteral((org.emftext.language.xpath3.DecimalLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.DoubleLiteral) {
			print_org_emftext_language_xpath3_DoubleLiteral((org.emftext.language.xpath3.DoubleLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.StringLiteral) {
			print_org_emftext_language_xpath3_StringLiteral((org.emftext.language.xpath3.StringLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.PITest) {
			print_org_emftext_language_xpath3_PITest((org.emftext.language.xpath3.PITest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.AttributeTest) {
			print_org_emftext_language_xpath3_AttributeTest((org.emftext.language.xpath3.AttributeTest) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.xpath3.ElementTest) {
			print_org_emftext_language_xpath3_ElementTest((org.emftext.language.xpath3.ElementTest) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ReferenceResolverSwitch) new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3MetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, EObject cause) {
		org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Problem(errorMessage, org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemType.PRINT_PROBLEM, org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(Map<?,?> options) {
		this.options = options;
	}
	
	public Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(EObject element) throws java.io.IOException {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
	}
	
	public void print_org_emftext_language_xpath3_Expr(org.emftext.language.xpath3.Expr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.EXPR__EXPR));
		printCountingMap.put("expr", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expr");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.EXPR__EXPR));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("expr", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_xpath3_Expr_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_Expr_0(org.emftext.language.xpath3.Expr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expr");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.EXPR__EXPR));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("expr", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_ForExpr(org.emftext.language.xpath3.ForExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FOR_EXPR__ITERATOR));
		printCountingMap.put("iterator", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FOR_EXPR__RETURN));
		printCountingMap.put("return", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("for");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FOR_EXPR__ITERATOR));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("iterator", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_xpath3_ForExpr_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("return");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("return");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FOR_EXPR__RETURN));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("return", count - 1);
		}
	}
	
	public void print_org_emftext_language_xpath3_ForExpr_0(org.emftext.language.xpath3.ForExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FOR_EXPR__ITERATOR));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("iterator", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_QuantifiedExpr(org.emftext.language.xpath3.QuantifiedExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__QUANTIFIER));
		printCountingMap.put("quantifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__ITERATOR));
		printCountingMap.put("iterator", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__SATISFIES));
		printCountingMap.put("satisfies", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("quantifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__QUANTIFIER));
			if (o != null) {
			}
			printCountingMap.put("quantifier", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__ITERATOR));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("iterator", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_xpath3_QuantifiedExpr_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("satisfies");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("satisfies");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__SATISFIES));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("satisfies", count - 1);
		}
	}
	
	public void print_org_emftext_language_xpath3_QuantifiedExpr_0(org.emftext.language.xpath3.QuantifiedExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__ITERATOR));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("iterator", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_Iterator(org.emftext.language.xpath3.Iterator element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__LIST));
		printCountingMap.put("list", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("$");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_Iterator_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("list");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__LIST));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("list", count - 1);
		}
	}
	
	public void print_org_emftext_language_xpath3_Iterator_0(org.emftext.language.xpath3.Iterator element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"varName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"varName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("varName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("varName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("varName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("varName", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_xpath3_IfExpr(org.emftext.language.xpath3.IfExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__TEST));
		printCountingMap.put("test", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__THEN));
		printCountingMap.put("then", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__ELSE));
		printCountingMap.put("else", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("test");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__TEST));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("test", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("then");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("then");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__THEN));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("then", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("else");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("else");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__ELSE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("else", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_OrExpr(org.emftext.language.xpath3.OrExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OR_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OR_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_xpath3_OrExpr_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_OrExpr_0(org.emftext.language.xpath3.OrExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("or");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OR_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_AndExpr(org.emftext.language.xpath3.AndExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.AND_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.AND_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_xpath3_AndExpr_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_AndExpr_0(org.emftext.language.xpath3.AndExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("and");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.AND_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_ComparisonExpr(org.emftext.language.xpath3.ComparisonExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__LEFT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_ComparisonExpr_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_xpath3_ComparisonExpr_0(org.emftext.language.xpath3.ComparisonExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operator", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__RIGHT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_RangeExpr(org.emftext.language.xpath3.RangeExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.RANGE_EXPR__FROM));
		printCountingMap.put("from", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.RANGE_EXPR__TO));
		printCountingMap.put("to", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("from");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.RANGE_EXPR__FROM));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("from", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_RangeExpr_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_xpath3_RangeExpr_0(org.emftext.language.xpath3.RangeExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("to");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.RANGE_EXPR__TO));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("to", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_GeneralComp(org.emftext.language.xpath3.GeneralComp element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_COMP__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_COMP__OPERATOR));
			if (o != null) {
			}
			printCountingMap.put("operator", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_ValueComp(org.emftext.language.xpath3.ValueComp element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VALUE_COMP__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VALUE_COMP__OPERATOR));
			if (o != null) {
			}
			printCountingMap.put("operator", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_NodeComp(org.emftext.language.xpath3.NodeComp element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NODE_COMP__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NODE_COMP__OPERATOR));
			if (o != null) {
			}
			printCountingMap.put("operator", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_AdditiveExpr(org.emftext.language.xpath3.AdditiveExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_xpath3_AdditiveExpr_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_AdditiveExpr_0(org.emftext.language.xpath3.AdditiveExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERATOR));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
			}
			printCountingMap.put("operator", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_MultiplicativeExpr(org.emftext.language.xpath3.MultiplicativeExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_xpath3_MultiplicativeExpr_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_MultiplicativeExpr_0(org.emftext.language.xpath3.MultiplicativeExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
			}
			printCountingMap.put("operator", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_UnionExpr(org.emftext.language.xpath3.UnionExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_xpath3_UnionExpr_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_UnionExpr_0(org.emftext.language.xpath3.UnionExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERATION));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
			}
			printCountingMap.put("operation", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_IntersectExceptExpr(org.emftext.language.xpath3.IntersectExceptExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_xpath3_IntersectExceptExpr_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_IntersectExceptExpr_0(org.emftext.language.xpath3.IntersectExceptExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERATOR));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
			}
			printCountingMap.put("operator", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERAND));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_InstanceofExpr(org.emftext.language.xpath3.InstanceofExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INSTANCEOF_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INSTANCEOF_EXPR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INSTANCEOF_EXPR__OPERAND));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_InstanceofExpr_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_xpath3_InstanceofExpr_0(org.emftext.language.xpath3.InstanceofExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("instance");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("of");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INSTANCEOF_EXPR__TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_TreatExpr(org.emftext.language.xpath3.TreatExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.TREAT_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.TREAT_EXPR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.TREAT_EXPR__OPERAND));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_TreatExpr_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_xpath3_TreatExpr_0(org.emftext.language.xpath3.TreatExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("treat");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("as");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.TREAT_EXPR__TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_CastableExpr(org.emftext.language.xpath3.CastableExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CASTABLE_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CASTABLE_EXPR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CASTABLE_EXPR__OPERAND));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_CastableExpr_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_xpath3_CastableExpr_0(org.emftext.language.xpath3.CastableExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("castable");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("as");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CASTABLE_EXPR__TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_CastExpr(org.emftext.language.xpath3.CastExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CAST_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CAST_EXPR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CAST_EXPR__OPERAND));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_CastExpr_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_xpath3_CastExpr_0(org.emftext.language.xpath3.CastExpr element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("cast");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("as");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CAST_EXPR__TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_UnaryExpr(org.emftext.language.xpath3.UnaryExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNARY_EXPR__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNARY_EXPR__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operator");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNARY_EXPR__OPERATOR));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
			}
			printCountingMap.put("operator", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNARY_EXPR__OPERAND));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_FilterExpr(org.emftext.language.xpath3.FilterExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FILTER_EXPR__PRIMARY_EXPR));
		printCountingMap.put("primaryExpr", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FILTER_EXPR__PREDICATE));
		printCountingMap.put("predicate", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("primaryExpr");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FILTER_EXPR__PRIMARY_EXPR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("primaryExpr", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("predicate");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FILTER_EXPR__PREDICATE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("predicate", 0);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_FunctionCall(org.emftext.language.xpath3.FunctionCall element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG));
		printCountingMap.put("arg", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_FunctionCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_FunctionCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_xpath3_FunctionCall_0(org.emftext.language.xpath3.FunctionCall element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_FunctionCall_1(org.emftext.language.xpath3.FunctionCall element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arg");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("arg", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_xpath3_FunctionCall_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_FunctionCall_1_0(org.emftext.language.xpath3.FunctionCall element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arg");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("arg", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_PathExpr(org.emftext.language.xpath3.PathExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PATH_EXPR__STEP));
		printCountingMap.put("step", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("step");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PATH_EXPR__STEP));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("step", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("step");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PATH_EXPR__STEP));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("step", 0);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_ChildStepExpr(org.emftext.language.xpath3.ChildStepExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CHILD_STEP_EXPR__STEP));
		printCountingMap.put("step", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("step");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CHILD_STEP_EXPR__STEP));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("step", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_DescOrSelfStepExpr(org.emftext.language.xpath3.DescOrSelfStepExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DESC_OR_SELF_STEP_EXPR__STEP));
		printCountingMap.put("step", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("//");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("step");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DESC_OR_SELF_STEP_EXPR__STEP));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("step", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_RootStepExpr(org.emftext.language.xpath3.RootStepExpr element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_SelfStepExpr(org.emftext.language.xpath3.SelfStepExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SELF_STEP_EXPR__STEP));
		printCountingMap.put("step", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("step");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SELF_STEP_EXPR__STEP));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("step", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_GeneralForwardStep(org.emftext.language.xpath3.GeneralForwardStep element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__PREDICATE));
		printCountingMap.put("predicate", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS));
		printCountingMap.put("axis", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__NODE_TEST));
		printCountingMap.put("nodeTest", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("axis");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS));
			if (o != null) {
			}
			printCountingMap.put("axis", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nodeTest");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__NODE_TEST));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("nodeTest", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("predicate");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__PREDICATE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("predicate", 0);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_AbbrevForwardStep(org.emftext.language.xpath3.AbbrevForwardStep element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__PREDICATE));
		printCountingMap.put("predicate", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__KIND));
		printCountingMap.put("kind", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__NODE_TEST));
		printCountingMap.put("nodeTest", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("kind");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__KIND));
			if (o != null) {
			}
			printCountingMap.put("kind", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nodeTest");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__NODE_TEST));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("nodeTest", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("predicate");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__PREDICATE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("predicate", 0);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_GeneralReverseStep(org.emftext.language.xpath3.GeneralReverseStep element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__PREDICATE));
		printCountingMap.put("predicate", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__AXIS));
		printCountingMap.put("axis", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__NODE_TEST));
		printCountingMap.put("nodeTest", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("axis");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__AXIS));
			if (o != null) {
			}
			printCountingMap.put("axis", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nodeTest");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__NODE_TEST));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("nodeTest", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("predicate");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__PREDICATE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("predicate", 0);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_AbbrevReverseStep(org.emftext.language.xpath3.AbbrevReverseStep element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_REVERSE_STEP__PREDICATE));
		printCountingMap.put("predicate", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_REVERSE_STEP__KIND));
		printCountingMap.put("kind", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("kind");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_REVERSE_STEP__KIND));
			if (o != null) {
			}
			printCountingMap.put("kind", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("predicate");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_REVERSE_STEP__PREDICATE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("predicate", 0);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_NodeKindTest(org.emftext.language.xpath3.NodeKindTest element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NODE_KIND_TEST__TEST));
		printCountingMap.put("test", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("test");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NODE_KIND_TEST__TEST));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("test", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_QNameTest(org.emftext.language.xpath3.QNameTest element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_QNameTest_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_emftext_language_xpath3_QNameTest_0(org.emftext.language.xpath3.QNameTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_xpath3_AnyWildcard(org.emftext.language.xpath3.AnyWildcard element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("*");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_LocalNameWildcard(org.emftext.language.xpath3.LocalNameWildcard element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.LOCAL_NAME_WILDCARD__NAMESPACE));
		printCountingMap.put("namespace", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("namespace");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.LOCAL_NAME_WILDCARD__NAMESPACE));
			if (o != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.LOCAL_NAME_WILDCARD__NAMESPACE), element));
				out.print(" ");
			}
			printCountingMap.put("namespace", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("*");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_NamespaceWildcard(org.emftext.language.xpath3.NamespaceWildcard element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAMESPACE_WILDCARD__LOCAL_NAME));
		printCountingMap.put("localName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("*");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("localName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAMESPACE_WILDCARD__LOCAL_NAME));
			if (o != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAMESPACE_WILDCARD__LOCAL_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("localName", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_Predicate(org.emftext.language.xpath3.Predicate element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PREDICATE__EXPR));
		printCountingMap.put("expr", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expr");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PREDICATE__EXPR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("expr", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_VarRef(org.emftext.language.xpath3.VarRef element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("$");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_VarRef_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_emftext_language_xpath3_VarRef_0(org.emftext.language.xpath3.VarRef element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"varName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"varName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("varName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("varName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("varName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("varName", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_xpath3_ParenthesizedExpr(org.emftext.language.xpath3.ParenthesizedExpr element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PARENTHESIZED_EXPR__EXPR));
		printCountingMap.put("expr", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expr");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PARENTHESIZED_EXPR__EXPR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("expr", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_ContextItemExpr(org.emftext.language.xpath3.ContextItemExpr element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_SingleType(org.emftext.language.xpath3.SingleType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SINGLE_TYPE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SINGLE_TYPE__OPTIONAL));
		printCountingMap.put("optional", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SINGLE_TYPE__TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("optional");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SINGLE_TYPE__OPTIONAL));
			if (o != null) {
			}
			printCountingMap.put("optional", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_EmptySequenceType(org.emftext.language.xpath3.EmptySequenceType element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("empty-sequence");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_ItemSequenceType(org.emftext.language.xpath3.ItemSequenceType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__ITEM_TYPE));
		printCountingMap.put("itemType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__OCCURRENCE));
		printCountingMap.put("occurrence", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("itemType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__ITEM_TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("itemType", count - 1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("occurrence");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__OCCURRENCE));
			if (o != null) {
			}
			printCountingMap.put("occurrence", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_ItemKindTest(org.emftext.language.xpath3.ItemKindTest element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_KIND_TEST__TEST));
		printCountingMap.put("test", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("test");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_KIND_TEST__TEST));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("test", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_AnyItemType(org.emftext.language.xpath3.AnyItemType element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("item");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_AtomicItemType(org.emftext.language.xpath3.AtomicItemType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_ITEM_TYPE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_ITEM_TYPE__TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_AtomicType(org.emftext.language.xpath3.AtomicType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_AtomicType_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_emftext_language_xpath3_AtomicType_0(org.emftext.language.xpath3.AtomicType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_xpath3_OptionalAtomicType(org.emftext.language.xpath3.OptionalAtomicType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__OPTIONAL));
		printCountingMap.put("optional", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_OptionalAtomicType_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("optional");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__OPTIONAL));
			if (o != null) {
			}
			printCountingMap.put("optional", count - 1);
		}
	}
	
	public void print_org_emftext_language_xpath3_OptionalAtomicType_0(org.emftext.language.xpath3.OptionalAtomicType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_xpath3_AnyKindTest(org.emftext.language.xpath3.AnyKindTest element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("node");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_DocumentTest(org.emftext.language.xpath3.DocumentTest element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOCUMENT_TEST__TEST));
		printCountingMap.put("test", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("document-node");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("test");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOCUMENT_TEST__TEST));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("test", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_TextTest(org.emftext.language.xpath3.TextTest element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("text");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_CommentTest(org.emftext.language.xpath3.CommentTest element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("comment");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_PITest(org.emftext.language.xpath3.PITest element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("processing-instruction");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_NCNamePITest(org.emftext.language.xpath3.NCNamePITest element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NC_NAME_PI_TEST__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("processing-instruction");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NC_NAME_PI_TEST__NAME));
			if (o != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NC_NAME_PI_TEST__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_StringLiteralPITest(org.emftext.language.xpath3.StringLiteralPITest element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL_PI_TEST__LITERAL));
		printCountingMap.put("literal", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("processing-instruction");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("literal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL_PI_TEST__LITERAL));
			if (o != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getStringLiteralPITestLiteralReferenceResolver().deResolve((org.emftext.language.xpath3.StringLiteral) o, element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL_PI_TEST__LITERAL)), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL_PI_TEST__LITERAL), element));
				out.print(" ");
			}
			printCountingMap.put("literal", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_AttributeTest(org.emftext.language.xpath3.AttributeTest element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("attribute");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_WildcardAttributeTest(org.emftext.language.xpath3.WildcardAttributeTest element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("attribute");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("*");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_WildcardAttributeTest_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_xpath3_WildcardAttributeTest_0(org.emftext.language.xpath3.WildcardAttributeTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_WildcardAttributeTest_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_emftext_language_xpath3_WildcardAttributeTest_0_0(org.emftext.language.xpath3.WildcardAttributeTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"type"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("type");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE), element));
					out.print(" ");
				}
				printCountingMap.put("type", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_xpath3_NameAttributeTest(org.emftext.language.xpath3.NameAttributeTest element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("attribute");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_NameAttributeTest_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_NameAttributeTest_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_xpath3_NameAttributeTest_0(org.emftext.language.xpath3.NameAttributeTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_NameAttributeTest_1(org.emftext.language.xpath3.NameAttributeTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_NameAttributeTest_1_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_emftext_language_xpath3_NameAttributeTest_1_0(org.emftext.language.xpath3.NameAttributeTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"type"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE), element));
						out.print(" ");
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("type");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE), element));
					out.print(" ");
				}
				printCountingMap.put("type", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_xpath3_SchemaAttributeTest(org.emftext.language.xpath3.SchemaAttributeTest element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("schema-attribute");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_SchemaAttributeTest_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_xpath3_SchemaAttributeTest_0(org.emftext.language.xpath3.SchemaAttributeTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_xpath3_ElementTest(org.emftext.language.xpath3.ElementTest element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("element");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_xpath3_WildcardElementTest(org.emftext.language.xpath3.WildcardElementTest element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ELEMENT_TEST__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("element");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("*");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_WildcardElementTest_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_xpath3_WildcardElementTest_0(org.emftext.language.xpath3.WildcardElementTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ELEMENT_TEST__TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_NameElementTest(org.emftext.language.xpath3.NameElementTest element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("element");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_NameElementTest_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_xpath3_NameElementTest_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_xpath3_NameElementTest_0(org.emftext.language.xpath3.NameElementTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_org_emftext_language_xpath3_NameElementTest_1(org.emftext.language.xpath3.NameElementTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_SchemaElementTest(org.emftext.language.xpath3.SchemaElementTest element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("schema-element");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_xpath3_SchemaElementTest_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_xpath3_SchemaElementTest_0(org.emftext.language.xpath3.SchemaElementTest element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME));
					if (o != null) {
						org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("NCNAME");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME));
				if (o != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_xpath3_IntegerLiteral(org.emftext.language.xpath3.IntegerLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTEGER_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTEGER_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTEGER_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_DecimalLiteral(org.emftext.language.xpath3.DecimalLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DECIMAL_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DECIMAL_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DECIMAL_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_DoubleLiteral(org.emftext.language.xpath3.DoubleLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOUBLE_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOUBLE_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("DOUBLE_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOUBLE_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_xpath3_StringLiteral(org.emftext.language.xpath3.StringLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
}
