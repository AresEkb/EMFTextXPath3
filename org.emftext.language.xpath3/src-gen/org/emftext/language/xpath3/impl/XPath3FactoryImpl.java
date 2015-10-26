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
package org.emftext.language.xpath3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.xpath3.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPath3FactoryImpl extends EFactoryImpl implements XPath3Factory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XPath3Factory init() {
        try {
            XPath3Factory theXPath3Factory = (XPath3Factory)EPackage.Registry.INSTANCE.getEFactory(XPath3Package.eNS_URI);
            if (theXPath3Factory != null) {
                return theXPath3Factory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new XPath3FactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XPath3FactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case XPath3Package.EXPR: return createExpr();
            case XPath3Package.FOR_EXPR: return createForExpr();
            case XPath3Package.QUANTIFIED_EXPR: return createQuantifiedExpr();
            case XPath3Package.IF_EXPR: return createIfExpr();
            case XPath3Package.ITERATOR: return createIterator();
            case XPath3Package.OR_EXPR: return createOrExpr();
            case XPath3Package.AND_EXPR: return createAndExpr();
            case XPath3Package.COMPARISON_EXPR: return createComparisonExpr();
            case XPath3Package.RANGE_EXPR: return createRangeExpr();
            case XPath3Package.ADDITIVE_EXPR: return createAdditiveExpr();
            case XPath3Package.MULTIPLICATIVE_EXPR: return createMultiplicativeExpr();
            case XPath3Package.UNION_EXPR: return createUnionExpr();
            case XPath3Package.INTERSECT_EXCEPT_EXPR: return createIntersectExceptExpr();
            case XPath3Package.INSTANCEOF_EXPR: return createInstanceofExpr();
            case XPath3Package.TREAT_EXPR: return createTreatExpr();
            case XPath3Package.CASTABLE_EXPR: return createCastableExpr();
            case XPath3Package.CAST_EXPR: return createCastExpr();
            case XPath3Package.UNARY_EXPR: return createUnaryExpr();
            case XPath3Package.PATH_EXPR: return createPathExpr();
            case XPath3Package.ROOT_STEP_EXPR: return createRootStepExpr();
            case XPath3Package.CHILD_STEP_EXPR: return createChildStepExpr();
            case XPath3Package.DESC_OR_SELF_STEP_EXPR: return createDescOrSelfStepExpr();
            case XPath3Package.SELF_STEP_EXPR: return createSelfStepExpr();
            case XPath3Package.FILTER_EXPR: return createFilterExpr();
            case XPath3Package.GENERAL_FORWARD_STEP: return createGeneralForwardStep();
            case XPath3Package.ABBREV_FORWARD_STEP: return createAbbrevForwardStep();
            case XPath3Package.GENERAL_REVERSE_STEP: return createGeneralReverseStep();
            case XPath3Package.ABBREV_REVERSE_STEP: return createAbbrevReverseStep();
            case XPath3Package.NODE_KIND_TEST: return createNodeKindTest();
            case XPath3Package.QNAME_TEST: return createQNameTest();
            case XPath3Package.ANY_WILDCARD: return createAnyWildcard();
            case XPath3Package.LOCAL_NAME_WILDCARD: return createLocalNameWildcard();
            case XPath3Package.NAMESPACE_WILDCARD: return createNamespaceWildcard();
            case XPath3Package.PREDICATE: return createPredicate();
            case XPath3Package.VAR_REF: return createVarRef();
            case XPath3Package.PARENTHESIZED_EXPR: return createParenthesizedExpr();
            case XPath3Package.CONTEXT_ITEM_EXPR: return createContextItemExpr();
            case XPath3Package.FUNCTION_CALL: return createFunctionCall();
            case XPath3Package.STRING_LITERAL: return createStringLiteral();
            case XPath3Package.INTEGER_LITERAL: return createIntegerLiteral();
            case XPath3Package.DECIMAL_LITERAL: return createDecimalLiteral();
            case XPath3Package.DOUBLE_LITERAL: return createDoubleLiteral();
            case XPath3Package.GENERAL_COMP: return createGeneralComp();
            case XPath3Package.VALUE_COMP: return createValueComp();
            case XPath3Package.NODE_COMP: return createNodeComp();
            case XPath3Package.SINGLE_TYPE: return createSingleType();
            case XPath3Package.ATOMIC_TYPE: return createAtomicType();
            case XPath3Package.OPTIONAL_ATOMIC_TYPE: return createOptionalAtomicType();
            case XPath3Package.EMPTY_SEQUENCE_TYPE: return createEmptySequenceType();
            case XPath3Package.ITEM_SEQUENCE_TYPE: return createItemSequenceType();
            case XPath3Package.ITEM_KIND_TEST: return createItemKindTest();
            case XPath3Package.ANY_ITEM_TYPE: return createAnyItemType();
            case XPath3Package.ATOMIC_ITEM_TYPE: return createAtomicItemType();
            case XPath3Package.DOCUMENT_TEST: return createDocumentTest();
            case XPath3Package.ELEMENT_TEST: return createElementTest();
            case XPath3Package.NAME_ELEMENT_TEST: return createNameElementTest();
            case XPath3Package.WILDCARD_ELEMENT_TEST: return createWildcardElementTest();
            case XPath3Package.ATTRIBUTE_TEST: return createAttributeTest();
            case XPath3Package.NAME_ATTRIBUTE_TEST: return createNameAttributeTest();
            case XPath3Package.WILDCARD_ATTRIBUTE_TEST: return createWildcardAttributeTest();
            case XPath3Package.SCHEMA_ELEMENT_TEST: return createSchemaElementTest();
            case XPath3Package.SCHEMA_ATTRIBUTE_TEST: return createSchemaAttributeTest();
            case XPath3Package.PI_TEST: return createPITest();
            case XPath3Package.NC_NAME_PI_TEST: return createNCNamePITest();
            case XPath3Package.STRING_LITERAL_PI_TEST: return createStringLiteralPITest();
            case XPath3Package.COMMENT_TEST: return createCommentTest();
            case XPath3Package.TEXT_TEST: return createTextTest();
            case XPath3Package.ANY_KIND_TEST: return createAnyKindTest();
            case XPath3Package.COMMENT: return createComment();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case XPath3Package.FORWARD_AXIS_KIND:
                return createForwardAxisKindFromString(eDataType, initialValue);
            case XPath3Package.ABBREV_FORWARD_STEP_KIND:
                return createAbbrevForwardStepKindFromString(eDataType, initialValue);
            case XPath3Package.REVERSE_AXIS_KIND:
                return createReverseAxisKindFromString(eDataType, initialValue);
            case XPath3Package.ABBREV_REVERSE_STEP_KIND:
                return createAbbrevReverseStepKindFromString(eDataType, initialValue);
            case XPath3Package.UNION_OP:
                return createUnionOpFromString(eDataType, initialValue);
            case XPath3Package.ADDITIVE_OP_KIND:
                return createAdditiveOpKindFromString(eDataType, initialValue);
            case XPath3Package.MULTIPLICATIVE_OP_KIND:
                return createMultiplicativeOpKindFromString(eDataType, initialValue);
            case XPath3Package.QUANTIFIER_KIND:
                return createQuantifierKindFromString(eDataType, initialValue);
            case XPath3Package.INTERSECT_EXCEPT_OP_KIND:
                return createIntersectExceptOpKindFromString(eDataType, initialValue);
            case XPath3Package.UNARY_OP:
                return createUnaryOpFromString(eDataType, initialValue);
            case XPath3Package.GENERAL_COMP_KIND:
                return createGeneralCompKindFromString(eDataType, initialValue);
            case XPath3Package.NODE_COMP_KIND:
                return createNodeCompKindFromString(eDataType, initialValue);
            case XPath3Package.OCCURRENCE_INDICATOR_KIND:
                return createOccurrenceIndicatorKindFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case XPath3Package.FORWARD_AXIS_KIND:
                return convertForwardAxisKindToString(eDataType, instanceValue);
            case XPath3Package.ABBREV_FORWARD_STEP_KIND:
                return convertAbbrevForwardStepKindToString(eDataType, instanceValue);
            case XPath3Package.REVERSE_AXIS_KIND:
                return convertReverseAxisKindToString(eDataType, instanceValue);
            case XPath3Package.ABBREV_REVERSE_STEP_KIND:
                return convertAbbrevReverseStepKindToString(eDataType, instanceValue);
            case XPath3Package.UNION_OP:
                return convertUnionOpToString(eDataType, instanceValue);
            case XPath3Package.ADDITIVE_OP_KIND:
                return convertAdditiveOpKindToString(eDataType, instanceValue);
            case XPath3Package.MULTIPLICATIVE_OP_KIND:
                return convertMultiplicativeOpKindToString(eDataType, instanceValue);
            case XPath3Package.QUANTIFIER_KIND:
                return convertQuantifierKindToString(eDataType, instanceValue);
            case XPath3Package.INTERSECT_EXCEPT_OP_KIND:
                return convertIntersectExceptOpKindToString(eDataType, instanceValue);
            case XPath3Package.UNARY_OP:
                return convertUnaryOpToString(eDataType, instanceValue);
            case XPath3Package.GENERAL_COMP_KIND:
                return convertGeneralCompKindToString(eDataType, instanceValue);
            case XPath3Package.NODE_COMP_KIND:
                return convertNodeCompKindToString(eDataType, instanceValue);
            case XPath3Package.OCCURRENCE_INDICATOR_KIND:
                return convertOccurrenceIndicatorKindToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expr createExpr() {
        ExprImpl expr = new ExprImpl();
        return expr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ForExpr createForExpr() {
        ForExprImpl forExpr = new ForExprImpl();
        return forExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuantifiedExpr createQuantifiedExpr() {
        QuantifiedExprImpl quantifiedExpr = new QuantifiedExprImpl();
        return quantifiedExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IfExpr createIfExpr() {
        IfExprImpl ifExpr = new IfExprImpl();
        return ifExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Iterator createIterator() {
        IteratorImpl iterator = new IteratorImpl();
        return iterator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OrExpr createOrExpr() {
        OrExprImpl orExpr = new OrExprImpl();
        return orExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AndExpr createAndExpr() {
        AndExprImpl andExpr = new AndExprImpl();
        return andExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComparisonExpr createComparisonExpr() {
        ComparisonExprImpl comparisonExpr = new ComparisonExprImpl();
        return comparisonExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangeExpr createRangeExpr() {
        RangeExprImpl rangeExpr = new RangeExprImpl();
        return rangeExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdditiveExpr createAdditiveExpr() {
        AdditiveExprImpl additiveExpr = new AdditiveExprImpl();
        return additiveExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicativeExpr createMultiplicativeExpr() {
        MultiplicativeExprImpl multiplicativeExpr = new MultiplicativeExprImpl();
        return multiplicativeExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnionExpr createUnionExpr() {
        UnionExprImpl unionExpr = new UnionExprImpl();
        return unionExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntersectExceptExpr createIntersectExceptExpr() {
        IntersectExceptExprImpl intersectExceptExpr = new IntersectExceptExprImpl();
        return intersectExceptExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceofExpr createInstanceofExpr() {
        InstanceofExprImpl instanceofExpr = new InstanceofExprImpl();
        return instanceofExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TreatExpr createTreatExpr() {
        TreatExprImpl treatExpr = new TreatExprImpl();
        return treatExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CastableExpr createCastableExpr() {
        CastableExprImpl castableExpr = new CastableExprImpl();
        return castableExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CastExpr createCastExpr() {
        CastExprImpl castExpr = new CastExprImpl();
        return castExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnaryExpr createUnaryExpr() {
        UnaryExprImpl unaryExpr = new UnaryExprImpl();
        return unaryExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PathExpr createPathExpr() {
        PathExprImpl pathExpr = new PathExprImpl();
        return pathExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RootStepExpr createRootStepExpr() {
        RootStepExprImpl rootStepExpr = new RootStepExprImpl();
        return rootStepExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChildStepExpr createChildStepExpr() {
        ChildStepExprImpl childStepExpr = new ChildStepExprImpl();
        return childStepExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DescOrSelfStepExpr createDescOrSelfStepExpr() {
        DescOrSelfStepExprImpl descOrSelfStepExpr = new DescOrSelfStepExprImpl();
        return descOrSelfStepExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SelfStepExpr createSelfStepExpr() {
        SelfStepExprImpl selfStepExpr = new SelfStepExprImpl();
        return selfStepExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FilterExpr createFilterExpr() {
        FilterExprImpl filterExpr = new FilterExprImpl();
        return filterExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralForwardStep createGeneralForwardStep() {
        GeneralForwardStepImpl generalForwardStep = new GeneralForwardStepImpl();
        return generalForwardStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbbrevForwardStep createAbbrevForwardStep() {
        AbbrevForwardStepImpl abbrevForwardStep = new AbbrevForwardStepImpl();
        return abbrevForwardStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralReverseStep createGeneralReverseStep() {
        GeneralReverseStepImpl generalReverseStep = new GeneralReverseStepImpl();
        return generalReverseStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbbrevReverseStep createAbbrevReverseStep() {
        AbbrevReverseStepImpl abbrevReverseStep = new AbbrevReverseStepImpl();
        return abbrevReverseStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeKindTest createNodeKindTest() {
        NodeKindTestImpl nodeKindTest = new NodeKindTestImpl();
        return nodeKindTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QNameTest createQNameTest() {
        QNameTestImpl qNameTest = new QNameTestImpl();
        return qNameTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyWildcard createAnyWildcard() {
        AnyWildcardImpl anyWildcard = new AnyWildcardImpl();
        return anyWildcard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalNameWildcard createLocalNameWildcard() {
        LocalNameWildcardImpl localNameWildcard = new LocalNameWildcardImpl();
        return localNameWildcard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamespaceWildcard createNamespaceWildcard() {
        NamespaceWildcardImpl namespaceWildcard = new NamespaceWildcardImpl();
        return namespaceWildcard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Predicate createPredicate() {
        PredicateImpl predicate = new PredicateImpl();
        return predicate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VarRef createVarRef() {
        VarRefImpl varRef = new VarRefImpl();
        return varRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParenthesizedExpr createParenthesizedExpr() {
        ParenthesizedExprImpl parenthesizedExpr = new ParenthesizedExprImpl();
        return parenthesizedExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextItemExpr createContextItemExpr() {
        ContextItemExprImpl contextItemExpr = new ContextItemExprImpl();
        return contextItemExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FunctionCall createFunctionCall() {
        FunctionCallImpl functionCall = new FunctionCallImpl();
        return functionCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringLiteral createStringLiteral() {
        StringLiteralImpl stringLiteral = new StringLiteralImpl();
        return stringLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntegerLiteral createIntegerLiteral() {
        IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
        return integerLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DecimalLiteral createDecimalLiteral() {
        DecimalLiteralImpl decimalLiteral = new DecimalLiteralImpl();
        return decimalLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DoubleLiteral createDoubleLiteral() {
        DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
        return doubleLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralComp createGeneralComp() {
        GeneralCompImpl generalComp = new GeneralCompImpl();
        return generalComp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueComp createValueComp() {
        ValueCompImpl valueComp = new ValueCompImpl();
        return valueComp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeComp createNodeComp() {
        NodeCompImpl nodeComp = new NodeCompImpl();
        return nodeComp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SingleType createSingleType() {
        SingleTypeImpl singleType = new SingleTypeImpl();
        return singleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AtomicType createAtomicType() {
        AtomicTypeImpl atomicType = new AtomicTypeImpl();
        return atomicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OptionalAtomicType createOptionalAtomicType() {
        OptionalAtomicTypeImpl optionalAtomicType = new OptionalAtomicTypeImpl();
        return optionalAtomicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmptySequenceType createEmptySequenceType() {
        EmptySequenceTypeImpl emptySequenceType = new EmptySequenceTypeImpl();
        return emptySequenceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemSequenceType createItemSequenceType() {
        ItemSequenceTypeImpl itemSequenceType = new ItemSequenceTypeImpl();
        return itemSequenceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemKindTest createItemKindTest() {
        ItemKindTestImpl itemKindTest = new ItemKindTestImpl();
        return itemKindTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyItemType createAnyItemType() {
        AnyItemTypeImpl anyItemType = new AnyItemTypeImpl();
        return anyItemType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AtomicItemType createAtomicItemType() {
        AtomicItemTypeImpl atomicItemType = new AtomicItemTypeImpl();
        return atomicItemType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentTest createDocumentTest() {
        DocumentTestImpl documentTest = new DocumentTestImpl();
        return documentTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementTest createElementTest() {
        ElementTestImpl elementTest = new ElementTestImpl();
        return elementTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameElementTest createNameElementTest() {
        NameElementTestImpl nameElementTest = new NameElementTestImpl();
        return nameElementTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WildcardElementTest createWildcardElementTest() {
        WildcardElementTestImpl wildcardElementTest = new WildcardElementTestImpl();
        return wildcardElementTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeTest createAttributeTest() {
        AttributeTestImpl attributeTest = new AttributeTestImpl();
        return attributeTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameAttributeTest createNameAttributeTest() {
        NameAttributeTestImpl nameAttributeTest = new NameAttributeTestImpl();
        return nameAttributeTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WildcardAttributeTest createWildcardAttributeTest() {
        WildcardAttributeTestImpl wildcardAttributeTest = new WildcardAttributeTestImpl();
        return wildcardAttributeTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaElementTest createSchemaElementTest() {
        SchemaElementTestImpl schemaElementTest = new SchemaElementTestImpl();
        return schemaElementTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaAttributeTest createSchemaAttributeTest() {
        SchemaAttributeTestImpl schemaAttributeTest = new SchemaAttributeTestImpl();
        return schemaAttributeTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PITest createPITest() {
        PITestImpl piTest = new PITestImpl();
        return piTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NCNamePITest createNCNamePITest() {
        NCNamePITestImpl ncNamePITest = new NCNamePITestImpl();
        return ncNamePITest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringLiteralPITest createStringLiteralPITest() {
        StringLiteralPITestImpl stringLiteralPITest = new StringLiteralPITestImpl();
        return stringLiteralPITest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommentTest createCommentTest() {
        CommentTestImpl commentTest = new CommentTestImpl();
        return commentTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextTest createTextTest() {
        TextTestImpl textTest = new TextTestImpl();
        return textTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyKindTest createAnyKindTest() {
        AnyKindTestImpl anyKindTest = new AnyKindTestImpl();
        return anyKindTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Comment createComment() {
        CommentImpl comment = new CommentImpl();
        return comment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ForwardAxisKind createForwardAxisKindFromString(EDataType eDataType, String initialValue) {
        ForwardAxisKind result = ForwardAxisKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertForwardAxisKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbbrevForwardStepKind createAbbrevForwardStepKindFromString(EDataType eDataType, String initialValue) {
        AbbrevForwardStepKind result = AbbrevForwardStepKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAbbrevForwardStepKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReverseAxisKind createReverseAxisKindFromString(EDataType eDataType, String initialValue) {
        ReverseAxisKind result = ReverseAxisKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReverseAxisKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbbrevReverseStepKind createAbbrevReverseStepKindFromString(EDataType eDataType, String initialValue) {
        AbbrevReverseStepKind result = AbbrevReverseStepKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAbbrevReverseStepKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnionOp createUnionOpFromString(EDataType eDataType, String initialValue) {
        UnionOp result = UnionOp.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUnionOpToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdditiveOpKind createAdditiveOpKindFromString(EDataType eDataType, String initialValue) {
        AdditiveOpKind result = AdditiveOpKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAdditiveOpKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicativeOpKind createMultiplicativeOpKindFromString(EDataType eDataType, String initialValue) {
        MultiplicativeOpKind result = MultiplicativeOpKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiplicativeOpKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuantifierKind createQuantifierKindFromString(EDataType eDataType, String initialValue) {
        QuantifierKind result = QuantifierKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQuantifierKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntersectExceptOpKind createIntersectExceptOpKindFromString(EDataType eDataType, String initialValue) {
        IntersectExceptOpKind result = IntersectExceptOpKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIntersectExceptOpKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnaryOp createUnaryOpFromString(EDataType eDataType, String initialValue) {
        UnaryOp result = UnaryOp.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUnaryOpToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralCompKind createGeneralCompKindFromString(EDataType eDataType, String initialValue) {
        GeneralCompKind result = GeneralCompKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGeneralCompKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeCompKind createNodeCompKindFromString(EDataType eDataType, String initialValue) {
        NodeCompKind result = NodeCompKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNodeCompKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OccurrenceIndicatorKind createOccurrenceIndicatorKindFromString(EDataType eDataType, String initialValue) {
        OccurrenceIndicatorKind result = OccurrenceIndicatorKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOccurrenceIndicatorKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XPath3Package getXPath3Package() {
        return (XPath3Package)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static XPath3Package getPackage() {
        return XPath3Package.eINSTANCE;
    }

} //XPath3FactoryImpl
