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
package org.emftext.language.xpath3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.xpath3.XPath3Package
 * @generated
 */
public interface XPath3Factory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    XPath3Factory eINSTANCE = org.emftext.language.xpath3.impl.XPath3FactoryImpl.init();

    /**
     * Returns a new object of class '<em>Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Expr</em>'.
     * @generated
     */
    Expr createExpr();

    /**
     * Returns a new object of class '<em>For Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>For Expr</em>'.
     * @generated
     */
    ForExpr createForExpr();

    /**
     * Returns a new object of class '<em>Quantified Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Quantified Expr</em>'.
     * @generated
     */
    QuantifiedExpr createQuantifiedExpr();

    /**
     * Returns a new object of class '<em>If Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>If Expr</em>'.
     * @generated
     */
    IfExpr createIfExpr();

    /**
     * Returns a new object of class '<em>Iterator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Iterator</em>'.
     * @generated
     */
    Iterator createIterator();

    /**
     * Returns a new object of class '<em>Or Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Or Expr</em>'.
     * @generated
     */
    OrExpr createOrExpr();

    /**
     * Returns a new object of class '<em>And Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>And Expr</em>'.
     * @generated
     */
    AndExpr createAndExpr();

    /**
     * Returns a new object of class '<em>Comparison Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Comparison Expr</em>'.
     * @generated
     */
    ComparisonExpr createComparisonExpr();

    /**
     * Returns a new object of class '<em>Range Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Range Expr</em>'.
     * @generated
     */
    RangeExpr createRangeExpr();

    /**
     * Returns a new object of class '<em>Additive Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Additive Expr</em>'.
     * @generated
     */
    AdditiveExpr createAdditiveExpr();

    /**
     * Returns a new object of class '<em>Multiplicative Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Multiplicative Expr</em>'.
     * @generated
     */
    MultiplicativeExpr createMultiplicativeExpr();

    /**
     * Returns a new object of class '<em>Union Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Union Expr</em>'.
     * @generated
     */
    UnionExpr createUnionExpr();

    /**
     * Returns a new object of class '<em>Intersect Except Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Intersect Except Expr</em>'.
     * @generated
     */
    IntersectExceptExpr createIntersectExceptExpr();

    /**
     * Returns a new object of class '<em>Instanceof Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instanceof Expr</em>'.
     * @generated
     */
    InstanceofExpr createInstanceofExpr();

    /**
     * Returns a new object of class '<em>Treat Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Treat Expr</em>'.
     * @generated
     */
    TreatExpr createTreatExpr();

    /**
     * Returns a new object of class '<em>Castable Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Castable Expr</em>'.
     * @generated
     */
    CastableExpr createCastableExpr();

    /**
     * Returns a new object of class '<em>Cast Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cast Expr</em>'.
     * @generated
     */
    CastExpr createCastExpr();

    /**
     * Returns a new object of class '<em>Unary Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unary Expr</em>'.
     * @generated
     */
    UnaryExpr createUnaryExpr();

    /**
     * Returns a new object of class '<em>Path Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Path Expr</em>'.
     * @generated
     */
    PathExpr createPathExpr();

    /**
     * Returns a new object of class '<em>Root Step Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Root Step Expr</em>'.
     * @generated
     */
    RootStepExpr createRootStepExpr();

    /**
     * Returns a new object of class '<em>Child Step Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Child Step Expr</em>'.
     * @generated
     */
    ChildStepExpr createChildStepExpr();

    /**
     * Returns a new object of class '<em>Desc Or Self Step Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Desc Or Self Step Expr</em>'.
     * @generated
     */
    DescOrSelfStepExpr createDescOrSelfStepExpr();

    /**
     * Returns a new object of class '<em>Self Step Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Self Step Expr</em>'.
     * @generated
     */
    SelfStepExpr createSelfStepExpr();

    /**
     * Returns a new object of class '<em>Filter Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Filter Expr</em>'.
     * @generated
     */
    FilterExpr createFilterExpr();

    /**
     * Returns a new object of class '<em>General Forward Step</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>General Forward Step</em>'.
     * @generated
     */
    GeneralForwardStep createGeneralForwardStep();

    /**
     * Returns a new object of class '<em>Abbrev Forward Step</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abbrev Forward Step</em>'.
     * @generated
     */
    AbbrevForwardStep createAbbrevForwardStep();

    /**
     * Returns a new object of class '<em>General Reverse Step</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>General Reverse Step</em>'.
     * @generated
     */
    GeneralReverseStep createGeneralReverseStep();

    /**
     * Returns a new object of class '<em>Abbrev Reverse Step</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abbrev Reverse Step</em>'.
     * @generated
     */
    AbbrevReverseStep createAbbrevReverseStep();

    /**
     * Returns a new object of class '<em>Node Kind Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Node Kind Test</em>'.
     * @generated
     */
    NodeKindTest createNodeKindTest();

    /**
     * Returns a new object of class '<em>QName Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>QName Test</em>'.
     * @generated
     */
    QNameTest createQNameTest();

    /**
     * Returns a new object of class '<em>Any Wildcard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Any Wildcard</em>'.
     * @generated
     */
    AnyWildcard createAnyWildcard();

    /**
     * Returns a new object of class '<em>Local Name Wildcard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Local Name Wildcard</em>'.
     * @generated
     */
    LocalNameWildcard createLocalNameWildcard();

    /**
     * Returns a new object of class '<em>Namespace Wildcard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Namespace Wildcard</em>'.
     * @generated
     */
    NamespaceWildcard createNamespaceWildcard();

    /**
     * Returns a new object of class '<em>Predicate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Predicate</em>'.
     * @generated
     */
    Predicate createPredicate();

    /**
     * Returns a new object of class '<em>Var Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Var Ref</em>'.
     * @generated
     */
    VarRef createVarRef();

    /**
     * Returns a new object of class '<em>Parenthesized Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parenthesized Expr</em>'.
     * @generated
     */
    ParenthesizedExpr createParenthesizedExpr();

    /**
     * Returns a new object of class '<em>Context Item Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Item Expr</em>'.
     * @generated
     */
    ContextItemExpr createContextItemExpr();

    /**
     * Returns a new object of class '<em>Function Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Call</em>'.
     * @generated
     */
    FunctionCall createFunctionCall();

    /**
     * Returns a new object of class '<em>String Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Literal</em>'.
     * @generated
     */
    StringLiteral createStringLiteral();

    /**
     * Returns a new object of class '<em>Integer Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Literal</em>'.
     * @generated
     */
    IntegerLiteral createIntegerLiteral();

    /**
     * Returns a new object of class '<em>Decimal Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal Literal</em>'.
     * @generated
     */
    DecimalLiteral createDecimalLiteral();

    /**
     * Returns a new object of class '<em>Double Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Double Literal</em>'.
     * @generated
     */
    DoubleLiteral createDoubleLiteral();

    /**
     * Returns a new object of class '<em>General Comp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>General Comp</em>'.
     * @generated
     */
    GeneralComp createGeneralComp();

    /**
     * Returns a new object of class '<em>Value Comp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Comp</em>'.
     * @generated
     */
    ValueComp createValueComp();

    /**
     * Returns a new object of class '<em>Node Comp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Node Comp</em>'.
     * @generated
     */
    NodeComp createNodeComp();

    /**
     * Returns a new object of class '<em>Single Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Single Type</em>'.
     * @generated
     */
    SingleType createSingleType();

    /**
     * Returns a new object of class '<em>Atomic Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Atomic Type</em>'.
     * @generated
     */
    AtomicType createAtomicType();

    /**
     * Returns a new object of class '<em>Optional Atomic Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Optional Atomic Type</em>'.
     * @generated
     */
    OptionalAtomicType createOptionalAtomicType();

    /**
     * Returns a new object of class '<em>Empty Sequence Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Empty Sequence Type</em>'.
     * @generated
     */
    EmptySequenceType createEmptySequenceType();

    /**
     * Returns a new object of class '<em>Item Sequence Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Item Sequence Type</em>'.
     * @generated
     */
    ItemSequenceType createItemSequenceType();

    /**
     * Returns a new object of class '<em>Item Kind Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Item Kind Test</em>'.
     * @generated
     */
    ItemKindTest createItemKindTest();

    /**
     * Returns a new object of class '<em>Any Item Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Any Item Type</em>'.
     * @generated
     */
    AnyItemType createAnyItemType();

    /**
     * Returns a new object of class '<em>Atomic Item Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Atomic Item Type</em>'.
     * @generated
     */
    AtomicItemType createAtomicItemType();

    /**
     * Returns a new object of class '<em>Document Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Test</em>'.
     * @generated
     */
    DocumentTest createDocumentTest();

    /**
     * Returns a new object of class '<em>Element Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Element Test</em>'.
     * @generated
     */
    ElementTest createElementTest();

    /**
     * Returns a new object of class '<em>Name Element Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Name Element Test</em>'.
     * @generated
     */
    NameElementTest createNameElementTest();

    /**
     * Returns a new object of class '<em>Wildcard Element Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wildcard Element Test</em>'.
     * @generated
     */
    WildcardElementTest createWildcardElementTest();

    /**
     * Returns a new object of class '<em>Attribute Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Test</em>'.
     * @generated
     */
    AttributeTest createAttributeTest();

    /**
     * Returns a new object of class '<em>Name Attribute Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Name Attribute Test</em>'.
     * @generated
     */
    NameAttributeTest createNameAttributeTest();

    /**
     * Returns a new object of class '<em>Wildcard Attribute Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wildcard Attribute Test</em>'.
     * @generated
     */
    WildcardAttributeTest createWildcardAttributeTest();

    /**
     * Returns a new object of class '<em>Schema Element Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Schema Element Test</em>'.
     * @generated
     */
    SchemaElementTest createSchemaElementTest();

    /**
     * Returns a new object of class '<em>Schema Attribute Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Schema Attribute Test</em>'.
     * @generated
     */
    SchemaAttributeTest createSchemaAttributeTest();

    /**
     * Returns a new object of class '<em>PI Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PI Test</em>'.
     * @generated
     */
    PITest createPITest();

    /**
     * Returns a new object of class '<em>NC Name PI Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>NC Name PI Test</em>'.
     * @generated
     */
    NCNamePITest createNCNamePITest();

    /**
     * Returns a new object of class '<em>String Literal PI Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Literal PI Test</em>'.
     * @generated
     */
    StringLiteralPITest createStringLiteralPITest();

    /**
     * Returns a new object of class '<em>Comment Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Comment Test</em>'.
     * @generated
     */
    CommentTest createCommentTest();

    /**
     * Returns a new object of class '<em>Text Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Text Test</em>'.
     * @generated
     */
    TextTest createTextTest();

    /**
     * Returns a new object of class '<em>Any Kind Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Any Kind Test</em>'.
     * @generated
     */
    AnyKindTest createAnyKindTest();

    /**
     * Returns a new object of class '<em>Comment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Comment</em>'.
     * @generated
     */
    Comment createComment();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    XPath3Package getXPath3Package();

} //XPath3Factory
