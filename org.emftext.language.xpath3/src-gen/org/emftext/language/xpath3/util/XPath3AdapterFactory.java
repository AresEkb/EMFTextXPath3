/**
 * Copyright (c) 2013, 2014 Denis Nikiforov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Denis Nikiforov - initial API and implementation
 */
package org.emftext.language.xpath3.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.xpath3.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.xpath3.XPath3Package
 * @generated
 */
public class XPath3AdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static XPath3Package modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XPath3AdapterFactory() {
        if (modelPackage == null) {
            modelPackage = XPath3Package.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XPath3Switch<Adapter> modelSwitch =
        new XPath3Switch<Adapter>() {
            @Override
            public Adapter caseAnyExpr(AnyExpr object) {
                return createAnyExprAdapter();
            }
            @Override
            public Adapter caseExpr(Expr object) {
                return createExprAdapter();
            }
            @Override
            public Adapter caseExprSingle(ExprSingle object) {
                return createExprSingleAdapter();
            }
            @Override
            public Adapter caseForExpr(ForExpr object) {
                return createForExprAdapter();
            }
            @Override
            public Adapter caseQuantifiedExpr(QuantifiedExpr object) {
                return createQuantifiedExprAdapter();
            }
            @Override
            public Adapter caseIfExpr(IfExpr object) {
                return createIfExprAdapter();
            }
            @Override
            public Adapter caseIterator(Iterator object) {
                return createIteratorAdapter();
            }
            @Override
            public Adapter caseOrExpr(OrExpr object) {
                return createOrExprAdapter();
            }
            @Override
            public Adapter caseOrExprChild(OrExprChild object) {
                return createOrExprChildAdapter();
            }
            @Override
            public Adapter caseAndExpr(AndExpr object) {
                return createAndExprAdapter();
            }
            @Override
            public Adapter caseAndExprChild(AndExprChild object) {
                return createAndExprChildAdapter();
            }
            @Override
            public Adapter caseComparisonExpr(ComparisonExpr object) {
                return createComparisonExprAdapter();
            }
            @Override
            public Adapter caseComparisonExprChild(ComparisonExprChild object) {
                return createComparisonExprChildAdapter();
            }
            @Override
            public Adapter caseRangeExpr(RangeExpr object) {
                return createRangeExprAdapter();
            }
            @Override
            public Adapter caseRangeExprChild(RangeExprChild object) {
                return createRangeExprChildAdapter();
            }
            @Override
            public Adapter caseAdditiveExpr(AdditiveExpr object) {
                return createAdditiveExprAdapter();
            }
            @Override
            public Adapter caseAdditiveExprChild(AdditiveExprChild object) {
                return createAdditiveExprChildAdapter();
            }
            @Override
            public Adapter caseMultiplicativeExpr(MultiplicativeExpr object) {
                return createMultiplicativeExprAdapter();
            }
            @Override
            public Adapter caseMultiplicativeExprChild(MultiplicativeExprChild object) {
                return createMultiplicativeExprChildAdapter();
            }
            @Override
            public Adapter caseUnionExpr(UnionExpr object) {
                return createUnionExprAdapter();
            }
            @Override
            public Adapter caseUnionExprChild(UnionExprChild object) {
                return createUnionExprChildAdapter();
            }
            @Override
            public Adapter caseIntersectExceptExpr(IntersectExceptExpr object) {
                return createIntersectExceptExprAdapter();
            }
            @Override
            public Adapter caseIntersectExceptExprChild(IntersectExceptExprChild object) {
                return createIntersectExceptExprChildAdapter();
            }
            @Override
            public Adapter caseInstanceofExpr(InstanceofExpr object) {
                return createInstanceofExprAdapter();
            }
            @Override
            public Adapter caseInstanceofExprChild(InstanceofExprChild object) {
                return createInstanceofExprChildAdapter();
            }
            @Override
            public Adapter caseTreatExpr(TreatExpr object) {
                return createTreatExprAdapter();
            }
            @Override
            public Adapter caseTreatExprChild(TreatExprChild object) {
                return createTreatExprChildAdapter();
            }
            @Override
            public Adapter caseCastableExpr(CastableExpr object) {
                return createCastableExprAdapter();
            }
            @Override
            public Adapter caseCastableExprChild(CastableExprChild object) {
                return createCastableExprChildAdapter();
            }
            @Override
            public Adapter caseCastExpr(CastExpr object) {
                return createCastExprAdapter();
            }
            @Override
            public Adapter caseCastExprChild(CastExprChild object) {
                return createCastExprChildAdapter();
            }
            @Override
            public Adapter caseUnaryExpr(UnaryExpr object) {
                return createUnaryExprAdapter();
            }
            @Override
            public Adapter caseUnaryExprChild(UnaryExprChild object) {
                return createUnaryExprChildAdapter();
            }
            @Override
            public Adapter caseValueExpr(ValueExpr object) {
                return createValueExprAdapter();
            }
            @Override
            public Adapter casePathExpr(PathExpr object) {
                return createPathExprAdapter();
            }
            @Override
            public Adapter casePathExprChild(PathExprChild object) {
                return createPathExprChildAdapter();
            }
            @Override
            public Adapter caseRootStepExpr(RootStepExpr object) {
                return createRootStepExprAdapter();
            }
            @Override
            public Adapter caseChildStepExpr(ChildStepExpr object) {
                return createChildStepExprAdapter();
            }
            @Override
            public Adapter caseDescOrSelfStepExpr(DescOrSelfStepExpr object) {
                return createDescOrSelfStepExprAdapter();
            }
            @Override
            public Adapter caseSelfStepExpr(SelfStepExpr object) {
                return createSelfStepExprAdapter();
            }
            @Override
            public Adapter caseSelfStepExprChild(SelfStepExprChild object) {
                return createSelfStepExprChildAdapter();
            }
            @Override
            public Adapter caseStepExpr(StepExpr object) {
                return createStepExprAdapter();
            }
            @Override
            public Adapter caseFilterExpr(FilterExpr object) {
                return createFilterExprAdapter();
            }
            @Override
            public Adapter caseFilterExprChild(FilterExprChild object) {
                return createFilterExprChildAdapter();
            }
            @Override
            public Adapter caseAxisStep(AxisStep object) {
                return createAxisStepAdapter();
            }
            @Override
            public Adapter caseForwardStep(ForwardStep object) {
                return createForwardStepAdapter();
            }
            @Override
            public Adapter caseReverseStep(ReverseStep object) {
                return createReverseStepAdapter();
            }
            @Override
            public Adapter caseGeneralForwardStep(GeneralForwardStep object) {
                return createGeneralForwardStepAdapter();
            }
            @Override
            public Adapter caseAbbrevForwardStep(AbbrevForwardStep object) {
                return createAbbrevForwardStepAdapter();
            }
            @Override
            public Adapter caseGeneralReverseStep(GeneralReverseStep object) {
                return createGeneralReverseStepAdapter();
            }
            @Override
            public Adapter caseAbbrevReverseStep(AbbrevReverseStep object) {
                return createAbbrevReverseStepAdapter();
            }
            @Override
            public Adapter caseNodeTest(NodeTest object) {
                return createNodeTestAdapter();
            }
            @Override
            public Adapter caseNodeKindTest(NodeKindTest object) {
                return createNodeKindTestAdapter();
            }
            @Override
            public Adapter caseNameTest(NameTest object) {
                return createNameTestAdapter();
            }
            @Override
            public Adapter caseQNameTest(QNameTest object) {
                return createQNameTestAdapter();
            }
            @Override
            public Adapter caseWildcard(Wildcard object) {
                return createWildcardAdapter();
            }
            @Override
            public Adapter caseAnyWildcard(AnyWildcard object) {
                return createAnyWildcardAdapter();
            }
            @Override
            public Adapter caseLocalNameWildcard(LocalNameWildcard object) {
                return createLocalNameWildcardAdapter();
            }
            @Override
            public Adapter caseNamespaceWildcard(NamespaceWildcard object) {
                return createNamespaceWildcardAdapter();
            }
            @Override
            public Adapter casePredicate(Predicate object) {
                return createPredicateAdapter();
            }
            @Override
            public Adapter casePrimaryExpr(PrimaryExpr object) {
                return createPrimaryExprAdapter();
            }
            @Override
            public Adapter caseLiteral(Literal object) {
                return createLiteralAdapter();
            }
            @Override
            public Adapter caseVarRef(VarRef object) {
                return createVarRefAdapter();
            }
            @Override
            public Adapter caseParenthesizedExpr(ParenthesizedExpr object) {
                return createParenthesizedExprAdapter();
            }
            @Override
            public Adapter caseParenthesizedExprChild(ParenthesizedExprChild object) {
                return createParenthesizedExprChildAdapter();
            }
            @Override
            public Adapter caseContextItemExpr(ContextItemExpr object) {
                return createContextItemExprAdapter();
            }
            @Override
            public Adapter caseFunctionCall(FunctionCall object) {
                return createFunctionCallAdapter();
            }
            @Override
            public Adapter caseNumericLiteral(NumericLiteral object) {
                return createNumericLiteralAdapter();
            }
            @Override
            public Adapter caseStringLiteral(StringLiteral object) {
                return createStringLiteralAdapter();
            }
            @Override
            public Adapter caseIntegerLiteral(IntegerLiteral object) {
                return createIntegerLiteralAdapter();
            }
            @Override
            public Adapter caseDecimalLiteral(DecimalLiteral object) {
                return createDecimalLiteralAdapter();
            }
            @Override
            public Adapter caseDoubleLiteral(DoubleLiteral object) {
                return createDoubleLiteralAdapter();
            }
            @Override
            public Adapter caseComp(Comp object) {
                return createCompAdapter();
            }
            @Override
            public Adapter caseGeneralComp(GeneralComp object) {
                return createGeneralCompAdapter();
            }
            @Override
            public Adapter caseValueComp(ValueComp object) {
                return createValueCompAdapter();
            }
            @Override
            public Adapter caseNodeComp(NodeComp object) {
                return createNodeCompAdapter();
            }
            @Override
            public Adapter caseSingleType(SingleType object) {
                return createSingleTypeAdapter();
            }
            @Override
            public Adapter caseAtomicType(AtomicType object) {
                return createAtomicTypeAdapter();
            }
            @Override
            public Adapter caseOptionalAtomicType(OptionalAtomicType object) {
                return createOptionalAtomicTypeAdapter();
            }
            @Override
            public Adapter caseSequenceType(SequenceType object) {
                return createSequenceTypeAdapter();
            }
            @Override
            public Adapter caseEmptySequenceType(EmptySequenceType object) {
                return createEmptySequenceTypeAdapter();
            }
            @Override
            public Adapter caseItemSequenceType(ItemSequenceType object) {
                return createItemSequenceTypeAdapter();
            }
            @Override
            public Adapter caseItemType(ItemType object) {
                return createItemTypeAdapter();
            }
            @Override
            public Adapter caseItemKindTest(ItemKindTest object) {
                return createItemKindTestAdapter();
            }
            @Override
            public Adapter caseAnyItemType(AnyItemType object) {
                return createAnyItemTypeAdapter();
            }
            @Override
            public Adapter caseAtomicItemType(AtomicItemType object) {
                return createAtomicItemTypeAdapter();
            }
            @Override
            public Adapter caseKindTest(KindTest object) {
                return createKindTestAdapter();
            }
            @Override
            public Adapter caseDocumentTest(DocumentTest object) {
                return createDocumentTestAdapter();
            }
            @Override
            public Adapter caseElementTest(ElementTest object) {
                return createElementTestAdapter();
            }
            @Override
            public Adapter caseNameElementTest(NameElementTest object) {
                return createNameElementTestAdapter();
            }
            @Override
            public Adapter caseWildcardElementTest(WildcardElementTest object) {
                return createWildcardElementTestAdapter();
            }
            @Override
            public Adapter caseAttributeTest(AttributeTest object) {
                return createAttributeTestAdapter();
            }
            @Override
            public Adapter caseNameAttributeTest(NameAttributeTest object) {
                return createNameAttributeTestAdapter();
            }
            @Override
            public Adapter caseWildcardAttributeTest(WildcardAttributeTest object) {
                return createWildcardAttributeTestAdapter();
            }
            @Override
            public Adapter caseSchemaElementTest(SchemaElementTest object) {
                return createSchemaElementTestAdapter();
            }
            @Override
            public Adapter caseSchemaAttributeTest(SchemaAttributeTest object) {
                return createSchemaAttributeTestAdapter();
            }
            @Override
            public Adapter casePITest(PITest object) {
                return createPITestAdapter();
            }
            @Override
            public Adapter caseNCNamePITest(NCNamePITest object) {
                return createNCNamePITestAdapter();
            }
            @Override
            public Adapter caseStringLiteralPITest(StringLiteralPITest object) {
                return createStringLiteralPITestAdapter();
            }
            @Override
            public Adapter caseCommentTest(CommentTest object) {
                return createCommentTestAdapter();
            }
            @Override
            public Adapter caseTextTest(TextTest object) {
                return createTextTestAdapter();
            }
            @Override
            public Adapter caseAnyKindTest(AnyKindTest object) {
                return createAnyKindTestAdapter();
            }
            @Override
            public Adapter caseComment(Comment object) {
                return createCommentAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AnyExpr <em>Any Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AnyExpr
     * @generated
     */
    public Adapter createAnyExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.Expr <em>Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.Expr
     * @generated
     */
    public Adapter createExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ExprSingle <em>Expr Single</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ExprSingle
     * @generated
     */
    public Adapter createExprSingleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ForExpr <em>For Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ForExpr
     * @generated
     */
    public Adapter createForExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.QuantifiedExpr <em>Quantified Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.QuantifiedExpr
     * @generated
     */
    public Adapter createQuantifiedExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.IfExpr <em>If Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.IfExpr
     * @generated
     */
    public Adapter createIfExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.Iterator <em>Iterator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.Iterator
     * @generated
     */
    public Adapter createIteratorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.OrExpr <em>Or Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.OrExpr
     * @generated
     */
    public Adapter createOrExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.OrExprChild <em>Or Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.OrExprChild
     * @generated
     */
    public Adapter createOrExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AndExpr <em>And Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AndExpr
     * @generated
     */
    public Adapter createAndExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AndExprChild <em>And Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AndExprChild
     * @generated
     */
    public Adapter createAndExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ComparisonExpr <em>Comparison Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ComparisonExpr
     * @generated
     */
    public Adapter createComparisonExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ComparisonExprChild <em>Comparison Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ComparisonExprChild
     * @generated
     */
    public Adapter createComparisonExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.RangeExpr <em>Range Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.RangeExpr
     * @generated
     */
    public Adapter createRangeExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.RangeExprChild <em>Range Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.RangeExprChild
     * @generated
     */
    public Adapter createRangeExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AdditiveExpr <em>Additive Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AdditiveExpr
     * @generated
     */
    public Adapter createAdditiveExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AdditiveExprChild <em>Additive Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AdditiveExprChild
     * @generated
     */
    public Adapter createAdditiveExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.MultiplicativeExpr <em>Multiplicative Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.MultiplicativeExpr
     * @generated
     */
    public Adapter createMultiplicativeExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.MultiplicativeExprChild <em>Multiplicative Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.MultiplicativeExprChild
     * @generated
     */
    public Adapter createMultiplicativeExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.UnionExpr <em>Union Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.UnionExpr
     * @generated
     */
    public Adapter createUnionExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.UnionExprChild <em>Union Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.UnionExprChild
     * @generated
     */
    public Adapter createUnionExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.IntersectExceptExpr <em>Intersect Except Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.IntersectExceptExpr
     * @generated
     */
    public Adapter createIntersectExceptExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.IntersectExceptExprChild <em>Intersect Except Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.IntersectExceptExprChild
     * @generated
     */
    public Adapter createIntersectExceptExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.InstanceofExpr <em>Instanceof Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.InstanceofExpr
     * @generated
     */
    public Adapter createInstanceofExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.InstanceofExprChild <em>Instanceof Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.InstanceofExprChild
     * @generated
     */
    public Adapter createInstanceofExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.TreatExpr <em>Treat Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.TreatExpr
     * @generated
     */
    public Adapter createTreatExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.TreatExprChild <em>Treat Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.TreatExprChild
     * @generated
     */
    public Adapter createTreatExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.CastableExpr <em>Castable Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.CastableExpr
     * @generated
     */
    public Adapter createCastableExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.CastableExprChild <em>Castable Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.CastableExprChild
     * @generated
     */
    public Adapter createCastableExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.CastExpr <em>Cast Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.CastExpr
     * @generated
     */
    public Adapter createCastExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.CastExprChild <em>Cast Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.CastExprChild
     * @generated
     */
    public Adapter createCastExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.UnaryExpr <em>Unary Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.UnaryExpr
     * @generated
     */
    public Adapter createUnaryExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.UnaryExprChild <em>Unary Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.UnaryExprChild
     * @generated
     */
    public Adapter createUnaryExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ValueExpr <em>Value Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ValueExpr
     * @generated
     */
    public Adapter createValueExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.PathExpr <em>Path Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.PathExpr
     * @generated
     */
    public Adapter createPathExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.PathExprChild <em>Path Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.PathExprChild
     * @generated
     */
    public Adapter createPathExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.RootStepExpr <em>Root Step Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.RootStepExpr
     * @generated
     */
    public Adapter createRootStepExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ChildStepExpr <em>Child Step Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ChildStepExpr
     * @generated
     */
    public Adapter createChildStepExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.DescOrSelfStepExpr <em>Desc Or Self Step Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.DescOrSelfStepExpr
     * @generated
     */
    public Adapter createDescOrSelfStepExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.SelfStepExpr <em>Self Step Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.SelfStepExpr
     * @generated
     */
    public Adapter createSelfStepExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.SelfStepExprChild <em>Self Step Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.SelfStepExprChild
     * @generated
     */
    public Adapter createSelfStepExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.StepExpr <em>Step Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.StepExpr
     * @generated
     */
    public Adapter createStepExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.FilterExpr <em>Filter Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.FilterExpr
     * @generated
     */
    public Adapter createFilterExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.FilterExprChild <em>Filter Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.FilterExprChild
     * @generated
     */
    public Adapter createFilterExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AxisStep <em>Axis Step</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AxisStep
     * @generated
     */
    public Adapter createAxisStepAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ForwardStep <em>Forward Step</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ForwardStep
     * @generated
     */
    public Adapter createForwardStepAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ReverseStep <em>Reverse Step</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ReverseStep
     * @generated
     */
    public Adapter createReverseStepAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.GeneralForwardStep <em>General Forward Step</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.GeneralForwardStep
     * @generated
     */
    public Adapter createGeneralForwardStepAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AbbrevForwardStep <em>Abbrev Forward Step</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AbbrevForwardStep
     * @generated
     */
    public Adapter createAbbrevForwardStepAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.GeneralReverseStep <em>General Reverse Step</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.GeneralReverseStep
     * @generated
     */
    public Adapter createGeneralReverseStepAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AbbrevReverseStep <em>Abbrev Reverse Step</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AbbrevReverseStep
     * @generated
     */
    public Adapter createAbbrevReverseStepAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.NodeTest <em>Node Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.NodeTest
     * @generated
     */
    public Adapter createNodeTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.NodeKindTest <em>Node Kind Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.NodeKindTest
     * @generated
     */
    public Adapter createNodeKindTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.NameTest <em>Name Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.NameTest
     * @generated
     */
    public Adapter createNameTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.QNameTest <em>QName Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.QNameTest
     * @generated
     */
    public Adapter createQNameTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.Wildcard <em>Wildcard</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.Wildcard
     * @generated
     */
    public Adapter createWildcardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AnyWildcard <em>Any Wildcard</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AnyWildcard
     * @generated
     */
    public Adapter createAnyWildcardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.LocalNameWildcard <em>Local Name Wildcard</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.LocalNameWildcard
     * @generated
     */
    public Adapter createLocalNameWildcardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.NamespaceWildcard <em>Namespace Wildcard</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.NamespaceWildcard
     * @generated
     */
    public Adapter createNamespaceWildcardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.Predicate <em>Predicate</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.Predicate
     * @generated
     */
    public Adapter createPredicateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.PrimaryExpr <em>Primary Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.PrimaryExpr
     * @generated
     */
    public Adapter createPrimaryExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.Literal <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.Literal
     * @generated
     */
    public Adapter createLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.VarRef <em>Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.VarRef
     * @generated
     */
    public Adapter createVarRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ParenthesizedExpr <em>Parenthesized Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ParenthesizedExpr
     * @generated
     */
    public Adapter createParenthesizedExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ParenthesizedExprChild <em>Parenthesized Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ParenthesizedExprChild
     * @generated
     */
    public Adapter createParenthesizedExprChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ContextItemExpr <em>Context Item Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ContextItemExpr
     * @generated
     */
    public Adapter createContextItemExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.FunctionCall <em>Function Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.FunctionCall
     * @generated
     */
    public Adapter createFunctionCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.NumericLiteral <em>Numeric Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.NumericLiteral
     * @generated
     */
    public Adapter createNumericLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.StringLiteral <em>String Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.StringLiteral
     * @generated
     */
    public Adapter createStringLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.IntegerLiteral <em>Integer Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.IntegerLiteral
     * @generated
     */
    public Adapter createIntegerLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.DecimalLiteral <em>Decimal Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.DecimalLiteral
     * @generated
     */
    public Adapter createDecimalLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.DoubleLiteral <em>Double Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.DoubleLiteral
     * @generated
     */
    public Adapter createDoubleLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.Comp <em>Comp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.Comp
     * @generated
     */
    public Adapter createCompAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.GeneralComp <em>General Comp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.GeneralComp
     * @generated
     */
    public Adapter createGeneralCompAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ValueComp <em>Value Comp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ValueComp
     * @generated
     */
    public Adapter createValueCompAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.NodeComp <em>Node Comp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.NodeComp
     * @generated
     */
    public Adapter createNodeCompAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.SingleType <em>Single Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.SingleType
     * @generated
     */
    public Adapter createSingleTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AtomicType <em>Atomic Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AtomicType
     * @generated
     */
    public Adapter createAtomicTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.OptionalAtomicType <em>Optional Atomic Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.OptionalAtomicType
     * @generated
     */
    public Adapter createOptionalAtomicTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.SequenceType <em>Sequence Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.SequenceType
     * @generated
     */
    public Adapter createSequenceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.EmptySequenceType <em>Empty Sequence Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.EmptySequenceType
     * @generated
     */
    public Adapter createEmptySequenceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ItemSequenceType <em>Item Sequence Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ItemSequenceType
     * @generated
     */
    public Adapter createItemSequenceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ItemType <em>Item Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ItemType
     * @generated
     */
    public Adapter createItemTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ItemKindTest <em>Item Kind Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ItemKindTest
     * @generated
     */
    public Adapter createItemKindTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AnyItemType <em>Any Item Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AnyItemType
     * @generated
     */
    public Adapter createAnyItemTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AtomicItemType <em>Atomic Item Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AtomicItemType
     * @generated
     */
    public Adapter createAtomicItemTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.KindTest <em>Kind Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.KindTest
     * @generated
     */
    public Adapter createKindTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.DocumentTest <em>Document Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.DocumentTest
     * @generated
     */
    public Adapter createDocumentTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.ElementTest <em>Element Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.ElementTest
     * @generated
     */
    public Adapter createElementTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.NameElementTest <em>Name Element Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.NameElementTest
     * @generated
     */
    public Adapter createNameElementTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.WildcardElementTest <em>Wildcard Element Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.WildcardElementTest
     * @generated
     */
    public Adapter createWildcardElementTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AttributeTest <em>Attribute Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AttributeTest
     * @generated
     */
    public Adapter createAttributeTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.NameAttributeTest <em>Name Attribute Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.NameAttributeTest
     * @generated
     */
    public Adapter createNameAttributeTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.WildcardAttributeTest <em>Wildcard Attribute Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.WildcardAttributeTest
     * @generated
     */
    public Adapter createWildcardAttributeTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.SchemaElementTest <em>Schema Element Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.SchemaElementTest
     * @generated
     */
    public Adapter createSchemaElementTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.SchemaAttributeTest <em>Schema Attribute Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.SchemaAttributeTest
     * @generated
     */
    public Adapter createSchemaAttributeTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.PITest <em>PI Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.PITest
     * @generated
     */
    public Adapter createPITestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.NCNamePITest <em>NC Name PI Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.NCNamePITest
     * @generated
     */
    public Adapter createNCNamePITestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.StringLiteralPITest <em>String Literal PI Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.StringLiteralPITest
     * @generated
     */
    public Adapter createStringLiteralPITestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.CommentTest <em>Comment Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.CommentTest
     * @generated
     */
    public Adapter createCommentTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.TextTest <em>Text Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.TextTest
     * @generated
     */
    public Adapter createTextTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.AnyKindTest <em>Any Kind Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.AnyKindTest
     * @generated
     */
    public Adapter createAnyKindTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.xpath3.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.xpath3.Comment
     * @generated
     */
    public Adapter createCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //XPath3AdapterFactory
