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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.xpath3.XPath3Factory
 * @model kind="package"
 * @generated
 */
public interface XPath3Package extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "xpath3";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.emftext.org/language/xpath3";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "xpath3";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    XPath3Package eINSTANCE = org.emftext.language.xpath3.impl.XPath3PackageImpl.init();

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ParenthesizedExprChildImpl <em>Parenthesized Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ParenthesizedExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getParenthesizedExprChild()
     * @generated
     */
    int PARENTHESIZED_EXPR_CHILD = 64;

    /**
     * The number of structural features of the '<em>Parenthesized Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARENTHESIZED_EXPR_CHILD_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AnyExprImpl <em>Any Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AnyExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAnyExpr()
     * @generated
     */
    int ANY_EXPR = 0;

    /**
     * The number of structural features of the '<em>Any Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_EXPR_FEATURE_COUNT = PARENTHESIZED_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getExpr()
     * @generated
     */
    int EXPR = 1;

    /**
     * The feature id for the '<em><b>Expr</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPR__EXPR = ANY_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPR_FEATURE_COUNT = ANY_EXPR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ExprSingleImpl <em>Expr Single</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ExprSingleImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getExprSingle()
     * @generated
     */
    int EXPR_SINGLE = 2;

    /**
     * The number of structural features of the '<em>Expr Single</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPR_SINGLE_FEATURE_COUNT = ANY_EXPR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ForExprImpl <em>For Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ForExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getForExpr()
     * @generated
     */
    int FOR_EXPR = 3;

    /**
     * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EXPR__ITERATOR = EXPR_SINGLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Return</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EXPR__RETURN = EXPR_SINGLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>For Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.QuantifiedExprImpl <em>Quantified Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.QuantifiedExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getQuantifiedExpr()
     * @generated
     */
    int QUANTIFIED_EXPR = 4;

    /**
     * The feature id for the '<em><b>Quantifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUANTIFIED_EXPR__QUANTIFIER = EXPR_SINGLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUANTIFIED_EXPR__ITERATOR = EXPR_SINGLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Satisfies</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUANTIFIED_EXPR__SATISFIES = EXPR_SINGLE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Quantified Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUANTIFIED_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.IfExprImpl <em>If Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.IfExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIfExpr()
     * @generated
     */
    int IF_EXPR = 5;

    /**
     * The feature id for the '<em><b>Test</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_EXPR__TEST = EXPR_SINGLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Then</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_EXPR__THEN = EXPR_SINGLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Else</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_EXPR__ELSE = EXPR_SINGLE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>If Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.IteratorImpl <em>Iterator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.IteratorImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIterator()
     * @generated
     */
    int ITERATOR = 6;

    /**
     * The feature id for the '<em><b>Var Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITERATOR__VAR_NAME = 0;

    /**
     * The feature id for the '<em><b>List</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITERATOR__LIST = 1;

    /**
     * The number of structural features of the '<em>Iterator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITERATOR_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.OrExprImpl <em>Or Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.OrExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getOrExpr()
     * @generated
     */
    int OR_EXPR = 7;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_EXPR__OPERAND = EXPR_SINGLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Or Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.OrExprChildImpl <em>Or Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.OrExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getOrExprChild()
     * @generated
     */
    int OR_EXPR_CHILD = 8;

    /**
     * The number of structural features of the '<em>Or Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_EXPR_CHILD_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AndExprImpl <em>And Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AndExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAndExpr()
     * @generated
     */
    int AND_EXPR = 9;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPR__OPERAND = OR_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>And Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPR_FEATURE_COUNT = OR_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AndExprChildImpl <em>And Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AndExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAndExprChild()
     * @generated
     */
    int AND_EXPR_CHILD = 10;

    /**
     * The number of structural features of the '<em>And Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPR_CHILD_FEATURE_COUNT = OR_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ComparisonExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getComparisonExpr()
     * @generated
     */
    int COMPARISON_EXPR = 11;

    /**
     * The feature id for the '<em><b>Left</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARISON_EXPR__LEFT = AND_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARISON_EXPR__OPERATOR = AND_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Right</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARISON_EXPR__RIGHT = AND_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Comparison Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARISON_EXPR_FEATURE_COUNT = AND_EXPR_CHILD_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ComparisonExprChildImpl <em>Comparison Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ComparisonExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getComparisonExprChild()
     * @generated
     */
    int COMPARISON_EXPR_CHILD = 12;

    /**
     * The number of structural features of the '<em>Comparison Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARISON_EXPR_CHILD_FEATURE_COUNT = AND_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.RangeExprImpl <em>Range Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.RangeExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getRangeExpr()
     * @generated
     */
    int RANGE_EXPR = 13;

    /**
     * The feature id for the '<em><b>From</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_EXPR__FROM = COMPARISON_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>To</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_EXPR__TO = COMPARISON_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Range Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_EXPR_FEATURE_COUNT = COMPARISON_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.RangeExprChildImpl <em>Range Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.RangeExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getRangeExprChild()
     * @generated
     */
    int RANGE_EXPR_CHILD = 14;

    /**
     * The number of structural features of the '<em>Range Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_EXPR_CHILD_FEATURE_COUNT = COMPARISON_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AdditiveExprImpl <em>Additive Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AdditiveExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAdditiveExpr()
     * @generated
     */
    int ADDITIVE_EXPR = 15;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPR__OPERAND = RANGE_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPR__OPERATOR = RANGE_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Additive Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPR_FEATURE_COUNT = RANGE_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AdditiveExprChildImpl <em>Additive Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AdditiveExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAdditiveExprChild()
     * @generated
     */
    int ADDITIVE_EXPR_CHILD = 16;

    /**
     * The number of structural features of the '<em>Additive Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPR_CHILD_FEATURE_COUNT = RANGE_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.MultiplicativeExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getMultiplicativeExpr()
     * @generated
     */
    int MULTIPLICATIVE_EXPR = 17;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPR__OPERAND = ADDITIVE_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPR__OPERATOR = ADDITIVE_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Multiplicative Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPR_FEATURE_COUNT = ADDITIVE_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.MultiplicativeExprChildImpl <em>Multiplicative Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.MultiplicativeExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getMultiplicativeExprChild()
     * @generated
     */
    int MULTIPLICATIVE_EXPR_CHILD = 18;

    /**
     * The number of structural features of the '<em>Multiplicative Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPR_CHILD_FEATURE_COUNT = ADDITIVE_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.UnionExprImpl <em>Union Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.UnionExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnionExpr()
     * @generated
     */
    int UNION_EXPR = 19;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_EXPR__OPERAND = MULTIPLICATIVE_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operation</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_EXPR__OPERATION = MULTIPLICATIVE_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Union Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_EXPR_FEATURE_COUNT = MULTIPLICATIVE_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.UnionExprChildImpl <em>Union Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.UnionExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnionExprChild()
     * @generated
     */
    int UNION_EXPR_CHILD = 20;

    /**
     * The number of structural features of the '<em>Union Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_EXPR_CHILD_FEATURE_COUNT = MULTIPLICATIVE_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.IntersectExceptExprImpl <em>Intersect Except Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.IntersectExceptExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIntersectExceptExpr()
     * @generated
     */
    int INTERSECT_EXCEPT_EXPR = 21;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERSECT_EXCEPT_EXPR__OPERAND = UNION_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERSECT_EXCEPT_EXPR__OPERATOR = UNION_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Intersect Except Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERSECT_EXCEPT_EXPR_FEATURE_COUNT = UNION_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.IntersectExceptExprChildImpl <em>Intersect Except Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.IntersectExceptExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIntersectExceptExprChild()
     * @generated
     */
    int INTERSECT_EXCEPT_EXPR_CHILD = 22;

    /**
     * The number of structural features of the '<em>Intersect Except Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERSECT_EXCEPT_EXPR_CHILD_FEATURE_COUNT = UNION_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.InstanceofExprImpl <em>Instanceof Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.InstanceofExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getInstanceofExpr()
     * @generated
     */
    int INSTANCEOF_EXPR = 23;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCEOF_EXPR__OPERAND = INTERSECT_EXCEPT_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCEOF_EXPR__TYPE = INTERSECT_EXCEPT_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Instanceof Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCEOF_EXPR_FEATURE_COUNT = INTERSECT_EXCEPT_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.InstanceofExprChildImpl <em>Instanceof Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.InstanceofExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getInstanceofExprChild()
     * @generated
     */
    int INSTANCEOF_EXPR_CHILD = 24;

    /**
     * The number of structural features of the '<em>Instanceof Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCEOF_EXPR_CHILD_FEATURE_COUNT = INTERSECT_EXCEPT_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.TreatExprImpl <em>Treat Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.TreatExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getTreatExpr()
     * @generated
     */
    int TREAT_EXPR = 25;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREAT_EXPR__OPERAND = INSTANCEOF_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREAT_EXPR__TYPE = INSTANCEOF_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Treat Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREAT_EXPR_FEATURE_COUNT = INSTANCEOF_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.TreatExprChildImpl <em>Treat Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.TreatExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getTreatExprChild()
     * @generated
     */
    int TREAT_EXPR_CHILD = 26;

    /**
     * The number of structural features of the '<em>Treat Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREAT_EXPR_CHILD_FEATURE_COUNT = INSTANCEOF_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.CastableExprImpl <em>Castable Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.CastableExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getCastableExpr()
     * @generated
     */
    int CASTABLE_EXPR = 27;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASTABLE_EXPR__OPERAND = TREAT_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASTABLE_EXPR__TYPE = TREAT_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Castable Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASTABLE_EXPR_FEATURE_COUNT = TREAT_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.CastableExprChildImpl <em>Castable Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.CastableExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getCastableExprChild()
     * @generated
     */
    int CASTABLE_EXPR_CHILD = 28;

    /**
     * The number of structural features of the '<em>Castable Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASTABLE_EXPR_CHILD_FEATURE_COUNT = TREAT_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.CastExprImpl <em>Cast Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.CastExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getCastExpr()
     * @generated
     */
    int CAST_EXPR = 29;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPR__OPERAND = CASTABLE_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPR__TYPE = CASTABLE_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Cast Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPR_FEATURE_COUNT = CASTABLE_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.CastExprChildImpl <em>Cast Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.CastExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getCastExprChild()
     * @generated
     */
    int CAST_EXPR_CHILD = 30;

    /**
     * The number of structural features of the '<em>Cast Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPR_CHILD_FEATURE_COUNT = CASTABLE_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.UnaryExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnaryExpr()
     * @generated
     */
    int UNARY_EXPR = 31;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPR__OPERAND = CAST_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPR__OPERATOR = CAST_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Unary Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPR_FEATURE_COUNT = CAST_EXPR_CHILD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.UnaryExprChildImpl <em>Unary Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.UnaryExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnaryExprChild()
     * @generated
     */
    int UNARY_EXPR_CHILD = 32;

    /**
     * The number of structural features of the '<em>Unary Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPR_CHILD_FEATURE_COUNT = CAST_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ValueExprImpl <em>Value Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ValueExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getValueExpr()
     * @generated
     */
    int VALUE_EXPR = 33;

    /**
     * The number of structural features of the '<em>Value Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_EXPR_FEATURE_COUNT = UNARY_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.PathExprImpl <em>Path Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.PathExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getPathExpr()
     * @generated
     */
    int PATH_EXPR = 34;

    /**
     * The feature id for the '<em><b>Step</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH_EXPR__STEP = VALUE_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Path Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH_EXPR_FEATURE_COUNT = VALUE_EXPR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.PathExprChildImpl <em>Path Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.PathExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getPathExprChild()
     * @generated
     */
    int PATH_EXPR_CHILD = 35;

    /**
     * The number of structural features of the '<em>Path Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH_EXPR_CHILD_FEATURE_COUNT = UNARY_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.RootStepExprImpl <em>Root Step Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.RootStepExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getRootStepExpr()
     * @generated
     */
    int ROOT_STEP_EXPR = 36;

    /**
     * The number of structural features of the '<em>Root Step Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_STEP_EXPR_FEATURE_COUNT = PATH_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ChildStepExprImpl <em>Child Step Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ChildStepExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getChildStepExpr()
     * @generated
     */
    int CHILD_STEP_EXPR = 37;

    /**
     * The feature id for the '<em><b>Step</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHILD_STEP_EXPR__STEP = PATH_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Child Step Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHILD_STEP_EXPR_FEATURE_COUNT = PATH_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.DescOrSelfStepExprImpl <em>Desc Or Self Step Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.DescOrSelfStepExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getDescOrSelfStepExpr()
     * @generated
     */
    int DESC_OR_SELF_STEP_EXPR = 38;

    /**
     * The feature id for the '<em><b>Step</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESC_OR_SELF_STEP_EXPR__STEP = PATH_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Desc Or Self Step Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESC_OR_SELF_STEP_EXPR_FEATURE_COUNT = PATH_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.SelfStepExprImpl <em>Self Step Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.SelfStepExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSelfStepExpr()
     * @generated
     */
    int SELF_STEP_EXPR = 39;

    /**
     * The feature id for the '<em><b>Step</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_STEP_EXPR__STEP = PATH_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Self Step Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_STEP_EXPR_FEATURE_COUNT = PATH_EXPR_CHILD_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.SelfStepExprChildImpl <em>Self Step Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.SelfStepExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSelfStepExprChild()
     * @generated
     */
    int SELF_STEP_EXPR_CHILD = 40;

    /**
     * The number of structural features of the '<em>Self Step Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_STEP_EXPR_CHILD_FEATURE_COUNT = PATH_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.StepExprImpl <em>Step Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.StepExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getStepExpr()
     * @generated
     */
    int STEP_EXPR = 41;

    /**
     * The number of structural features of the '<em>Step Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEP_EXPR_FEATURE_COUNT = SELF_STEP_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.FilterExprImpl <em>Filter Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.FilterExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getFilterExpr()
     * @generated
     */
    int FILTER_EXPR = 42;

    /**
     * The feature id for the '<em><b>Primary Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_EXPR__PRIMARY_EXPR = STEP_EXPR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_EXPR__PREDICATE = STEP_EXPR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Filter Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_EXPR_FEATURE_COUNT = STEP_EXPR_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.FilterExprChildImpl <em>Filter Expr Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.FilterExprChildImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getFilterExprChild()
     * @generated
     */
    int FILTER_EXPR_CHILD = 43;

    /**
     * The number of structural features of the '<em>Filter Expr Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_EXPR_CHILD_FEATURE_COUNT = SELF_STEP_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AxisStepImpl <em>Axis Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AxisStepImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAxisStep()
     * @generated
     */
    int AXIS_STEP = 44;

    /**
     * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AXIS_STEP__PREDICATE = STEP_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Axis Step</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AXIS_STEP_FEATURE_COUNT = STEP_EXPR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ForwardStepImpl <em>Forward Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ForwardStepImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getForwardStep()
     * @generated
     */
    int FORWARD_STEP = 45;

    /**
     * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORWARD_STEP__PREDICATE = AXIS_STEP__PREDICATE;

    /**
     * The number of structural features of the '<em>Forward Step</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORWARD_STEP_FEATURE_COUNT = AXIS_STEP_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ReverseStepImpl <em>Reverse Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ReverseStepImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getReverseStep()
     * @generated
     */
    int REVERSE_STEP = 46;

    /**
     * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REVERSE_STEP__PREDICATE = AXIS_STEP__PREDICATE;

    /**
     * The number of structural features of the '<em>Reverse Step</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REVERSE_STEP_FEATURE_COUNT = AXIS_STEP_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.GeneralForwardStepImpl <em>General Forward Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.GeneralForwardStepImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getGeneralForwardStep()
     * @generated
     */
    int GENERAL_FORWARD_STEP = 47;

    /**
     * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FORWARD_STEP__PREDICATE = FORWARD_STEP__PREDICATE;

    /**
     * The feature id for the '<em><b>Axis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FORWARD_STEP__AXIS = FORWARD_STEP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Node Test</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FORWARD_STEP__NODE_TEST = FORWARD_STEP_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>General Forward Step</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FORWARD_STEP_FEATURE_COUNT = FORWARD_STEP_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AbbrevForwardStepImpl <em>Abbrev Forward Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AbbrevForwardStepImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAbbrevForwardStep()
     * @generated
     */
    int ABBREV_FORWARD_STEP = 48;

    /**
     * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREV_FORWARD_STEP__PREDICATE = FORWARD_STEP__PREDICATE;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREV_FORWARD_STEP__KIND = FORWARD_STEP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Node Test</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREV_FORWARD_STEP__NODE_TEST = FORWARD_STEP_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Abbrev Forward Step</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREV_FORWARD_STEP_FEATURE_COUNT = FORWARD_STEP_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.GeneralReverseStepImpl <em>General Reverse Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.GeneralReverseStepImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getGeneralReverseStep()
     * @generated
     */
    int GENERAL_REVERSE_STEP = 49;

    /**
     * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_REVERSE_STEP__PREDICATE = REVERSE_STEP__PREDICATE;

    /**
     * The feature id for the '<em><b>Axis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_REVERSE_STEP__AXIS = REVERSE_STEP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Node Test</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_REVERSE_STEP__NODE_TEST = REVERSE_STEP_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>General Reverse Step</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_REVERSE_STEP_FEATURE_COUNT = REVERSE_STEP_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AbbrevReverseStepImpl <em>Abbrev Reverse Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AbbrevReverseStepImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAbbrevReverseStep()
     * @generated
     */
    int ABBREV_REVERSE_STEP = 50;

    /**
     * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREV_REVERSE_STEP__PREDICATE = REVERSE_STEP__PREDICATE;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREV_REVERSE_STEP__KIND = REVERSE_STEP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abbrev Reverse Step</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREV_REVERSE_STEP_FEATURE_COUNT = REVERSE_STEP_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.NodeTestImpl <em>Node Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.NodeTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNodeTest()
     * @generated
     */
    int NODE_TEST = 51;

    /**
     * The number of structural features of the '<em>Node Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEST_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.NodeKindTestImpl <em>Node Kind Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.NodeKindTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNodeKindTest()
     * @generated
     */
    int NODE_KIND_TEST = 52;

    /**
     * The feature id for the '<em><b>Test</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_KIND_TEST__TEST = NODE_TEST_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node Kind Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_KIND_TEST_FEATURE_COUNT = NODE_TEST_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.NameTestImpl <em>Name Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.NameTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNameTest()
     * @generated
     */
    int NAME_TEST = 53;

    /**
     * The number of structural features of the '<em>Name Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_TEST_FEATURE_COUNT = NODE_TEST_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.QNameTestImpl <em>QName Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.QNameTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getQNameTest()
     * @generated
     */
    int QNAME_TEST = 54;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QNAME_TEST__NAME = NAME_TEST_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>QName Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QNAME_TEST_FEATURE_COUNT = NAME_TEST_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.WildcardImpl <em>Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.WildcardImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getWildcard()
     * @generated
     */
    int WILDCARD = 55;

    /**
     * The number of structural features of the '<em>Wildcard</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_FEATURE_COUNT = NAME_TEST_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AnyWildcardImpl <em>Any Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AnyWildcardImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAnyWildcard()
     * @generated
     */
    int ANY_WILDCARD = 56;

    /**
     * The number of structural features of the '<em>Any Wildcard</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_WILDCARD_FEATURE_COUNT = WILDCARD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.LocalNameWildcardImpl <em>Local Name Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.LocalNameWildcardImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getLocalNameWildcard()
     * @generated
     */
    int LOCAL_NAME_WILDCARD = 57;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_NAME_WILDCARD__NAMESPACE = WILDCARD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Local Name Wildcard</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_NAME_WILDCARD_FEATURE_COUNT = WILDCARD_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.NamespaceWildcardImpl <em>Namespace Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.NamespaceWildcardImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNamespaceWildcard()
     * @generated
     */
    int NAMESPACE_WILDCARD = 58;

    /**
     * The feature id for the '<em><b>Local Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_WILDCARD__LOCAL_NAME = WILDCARD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Namespace Wildcard</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_WILDCARD_FEATURE_COUNT = WILDCARD_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.PredicateImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getPredicate()
     * @generated
     */
    int PREDICATE = 59;

    /**
     * The feature id for the '<em><b>Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREDICATE__EXPR = 0;

    /**
     * The number of structural features of the '<em>Predicate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREDICATE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.PrimaryExprImpl <em>Primary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.PrimaryExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getPrimaryExpr()
     * @generated
     */
    int PRIMARY_EXPR = 60;

    /**
     * The number of structural features of the '<em>Primary Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPR_FEATURE_COUNT = FILTER_EXPR_CHILD_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.LiteralImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getLiteral()
     * @generated
     */
    int LITERAL = 61;

    /**
     * The number of structural features of the '<em>Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_FEATURE_COUNT = PRIMARY_EXPR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.VarRefImpl <em>Var Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.VarRefImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getVarRef()
     * @generated
     */
    int VAR_REF = 62;

    /**
     * The feature id for the '<em><b>Var Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_REF__VAR_NAME = PRIMARY_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Var Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_REF_FEATURE_COUNT = PRIMARY_EXPR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ParenthesizedExprImpl <em>Parenthesized Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ParenthesizedExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getParenthesizedExpr()
     * @generated
     */
    int PARENTHESIZED_EXPR = 63;

    /**
     * The feature id for the '<em><b>Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARENTHESIZED_EXPR__EXPR = PRIMARY_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Parenthesized Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARENTHESIZED_EXPR_FEATURE_COUNT = PRIMARY_EXPR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ContextItemExprImpl <em>Context Item Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ContextItemExprImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getContextItemExpr()
     * @generated
     */
    int CONTEXT_ITEM_EXPR = 65;

    /**
     * The number of structural features of the '<em>Context Item Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_ITEM_EXPR_FEATURE_COUNT = PRIMARY_EXPR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.FunctionCallImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getFunctionCall()
     * @generated
     */
    int FUNCTION_CALL = 66;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL__NAME = PRIMARY_EXPR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Arg</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL__ARG = PRIMARY_EXPR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Function Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_FEATURE_COUNT = PRIMARY_EXPR_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.NumericLiteralImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNumericLiteral()
     * @generated
     */
    int NUMERIC_LITERAL = 67;

    /**
     * The number of structural features of the '<em>Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.StringLiteralImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getStringLiteral()
     * @generated
     */
    int STRING_LITERAL = 68;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.IntegerLiteralImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIntegerLiteral()
     * @generated
     */
    int INTEGER_LITERAL = 69;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Integer Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.DecimalLiteralImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getDecimalLiteral()
     * @generated
     */
    int DECIMAL_LITERAL = 70;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Decimal Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.DoubleLiteralImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getDoubleLiteral()
     * @generated
     */
    int DOUBLE_LITERAL = 71;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Double Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.CompImpl <em>Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.CompImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getComp()
     * @generated
     */
    int COMP = 72;

    /**
     * The number of structural features of the '<em>Comp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMP_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.GeneralCompImpl <em>General Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.GeneralCompImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getGeneralComp()
     * @generated
     */
    int GENERAL_COMP = 73;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_COMP__OPERATOR = COMP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>General Comp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_COMP_FEATURE_COUNT = COMP_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ValueCompImpl <em>Value Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ValueCompImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getValueComp()
     * @generated
     */
    int VALUE_COMP = 74;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_COMP__OPERATOR = COMP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Value Comp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_COMP_FEATURE_COUNT = COMP_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.NodeCompImpl <em>Node Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.NodeCompImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNodeComp()
     * @generated
     */
    int NODE_COMP = 75;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_COMP__OPERATOR = COMP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node Comp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_COMP_FEATURE_COUNT = COMP_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.SingleTypeImpl <em>Single Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.SingleTypeImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSingleType()
     * @generated
     */
    int SINGLE_TYPE = 76;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_TYPE__TYPE = 0;

    /**
     * The feature id for the '<em><b>Optional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_TYPE__OPTIONAL = 1;

    /**
     * The number of structural features of the '<em>Single Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AtomicTypeImpl <em>Atomic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AtomicTypeImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAtomicType()
     * @generated
     */
    int ATOMIC_TYPE = 77;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOMIC_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>Atomic Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOMIC_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.OptionalAtomicTypeImpl <em>Optional Atomic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.OptionalAtomicTypeImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getOptionalAtomicType()
     * @generated
     */
    int OPTIONAL_ATOMIC_TYPE = 78;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPTIONAL_ATOMIC_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>Optional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPTIONAL_ATOMIC_TYPE__OPTIONAL = 1;

    /**
     * The number of structural features of the '<em>Optional Atomic Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPTIONAL_ATOMIC_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.SequenceTypeImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSequenceType()
     * @generated
     */
    int SEQUENCE_TYPE = 79;

    /**
     * The number of structural features of the '<em>Sequence Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.EmptySequenceTypeImpl <em>Empty Sequence Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.EmptySequenceTypeImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getEmptySequenceType()
     * @generated
     */
    int EMPTY_SEQUENCE_TYPE = 80;

    /**
     * The number of structural features of the '<em>Empty Sequence Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_SEQUENCE_TYPE_FEATURE_COUNT = SEQUENCE_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ItemSequenceTypeImpl <em>Item Sequence Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ItemSequenceTypeImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getItemSequenceType()
     * @generated
     */
    int ITEM_SEQUENCE_TYPE = 81;

    /**
     * The feature id for the '<em><b>Item Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_SEQUENCE_TYPE__ITEM_TYPE = SEQUENCE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Occurrence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_SEQUENCE_TYPE__OCCURRENCE = SEQUENCE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Item Sequence Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_SEQUENCE_TYPE_FEATURE_COUNT = SEQUENCE_TYPE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ItemTypeImpl <em>Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ItemTypeImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getItemType()
     * @generated
     */
    int ITEM_TYPE = 82;

    /**
     * The number of structural features of the '<em>Item Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_TYPE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ItemKindTestImpl <em>Item Kind Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ItemKindTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getItemKindTest()
     * @generated
     */
    int ITEM_KIND_TEST = 83;

    /**
     * The feature id for the '<em><b>Test</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_KIND_TEST__TEST = ITEM_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Item Kind Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_KIND_TEST_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AnyItemTypeImpl <em>Any Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AnyItemTypeImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAnyItemType()
     * @generated
     */
    int ANY_ITEM_TYPE = 84;

    /**
     * The number of structural features of the '<em>Any Item Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ITEM_TYPE_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AtomicItemTypeImpl <em>Atomic Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AtomicItemTypeImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAtomicItemType()
     * @generated
     */
    int ATOMIC_ITEM_TYPE = 85;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOMIC_ITEM_TYPE__TYPE = ITEM_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Atomic Item Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOMIC_ITEM_TYPE_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.KindTestImpl <em>Kind Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.KindTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getKindTest()
     * @generated
     */
    int KIND_TEST = 86;

    /**
     * The number of structural features of the '<em>Kind Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KIND_TEST_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.DocumentTestImpl <em>Document Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.DocumentTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getDocumentTest()
     * @generated
     */
    int DOCUMENT_TEST = 87;

    /**
     * The feature id for the '<em><b>Test</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TEST__TEST = KIND_TEST_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Document Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.ElementTestImpl <em>Element Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.ElementTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getElementTest()
     * @generated
     */
    int ELEMENT_TEST = 88;

    /**
     * The number of structural features of the '<em>Element Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.NameElementTestImpl <em>Name Element Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.NameElementTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNameElementTest()
     * @generated
     */
    int NAME_ELEMENT_TEST = 89;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_ELEMENT_TEST__NAME = ELEMENT_TEST_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_ELEMENT_TEST__TYPE = ELEMENT_TEST_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Name Element Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_ELEMENT_TEST_FEATURE_COUNT = ELEMENT_TEST_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.WildcardElementTestImpl <em>Wildcard Element Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.WildcardElementTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getWildcardElementTest()
     * @generated
     */
    int WILDCARD_ELEMENT_TEST = 90;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_ELEMENT_TEST__TYPE = ELEMENT_TEST_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Wildcard Element Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_ELEMENT_TEST_FEATURE_COUNT = ELEMENT_TEST_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AttributeTestImpl <em>Attribute Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AttributeTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAttributeTest()
     * @generated
     */
    int ATTRIBUTE_TEST = 91;

    /**
     * The number of structural features of the '<em>Attribute Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.NameAttributeTestImpl <em>Name Attribute Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.NameAttributeTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNameAttributeTest()
     * @generated
     */
    int NAME_ATTRIBUTE_TEST = 92;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_ATTRIBUTE_TEST__NAME = ATTRIBUTE_TEST_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_ATTRIBUTE_TEST__TYPE = ATTRIBUTE_TEST_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Name Attribute Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_ATTRIBUTE_TEST_FEATURE_COUNT = ATTRIBUTE_TEST_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.WildcardAttributeTestImpl <em>Wildcard Attribute Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.WildcardAttributeTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getWildcardAttributeTest()
     * @generated
     */
    int WILDCARD_ATTRIBUTE_TEST = 93;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_ATTRIBUTE_TEST__TYPE = ATTRIBUTE_TEST_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Wildcard Attribute Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_ATTRIBUTE_TEST_FEATURE_COUNT = ATTRIBUTE_TEST_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.SchemaElementTestImpl <em>Schema Element Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.SchemaElementTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSchemaElementTest()
     * @generated
     */
    int SCHEMA_ELEMENT_TEST = 94;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_ELEMENT_TEST__NAME = KIND_TEST_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Schema Element Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_ELEMENT_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.SchemaAttributeTestImpl <em>Schema Attribute Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.SchemaAttributeTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSchemaAttributeTest()
     * @generated
     */
    int SCHEMA_ATTRIBUTE_TEST = 95;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_ATTRIBUTE_TEST__NAME = KIND_TEST_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Schema Attribute Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_ATTRIBUTE_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.PITestImpl <em>PI Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.PITestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getPITest()
     * @generated
     */
    int PI_TEST = 96;

    /**
     * The number of structural features of the '<em>PI Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PI_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.NCNamePITestImpl <em>NC Name PI Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.NCNamePITestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNCNamePITest()
     * @generated
     */
    int NC_NAME_PI_TEST = 97;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NC_NAME_PI_TEST__NAME = PI_TEST_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>NC Name PI Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NC_NAME_PI_TEST_FEATURE_COUNT = PI_TEST_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.StringLiteralPITestImpl <em>String Literal PI Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.StringLiteralPITestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getStringLiteralPITest()
     * @generated
     */
    int STRING_LITERAL_PI_TEST = 98;

    /**
     * The feature id for the '<em><b>Literal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_LITERAL_PI_TEST__LITERAL = PI_TEST_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String Literal PI Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_LITERAL_PI_TEST_FEATURE_COUNT = PI_TEST_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.CommentTestImpl <em>Comment Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.CommentTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getCommentTest()
     * @generated
     */
    int COMMENT_TEST = 99;

    /**
     * The number of structural features of the '<em>Comment Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.TextTestImpl <em>Text Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.TextTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getTextTest()
     * @generated
     */
    int TEXT_TEST = 100;

    /**
     * The number of structural features of the '<em>Text Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.AnyKindTestImpl <em>Any Kind Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.AnyKindTestImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAnyKindTest()
     * @generated
     */
    int ANY_KIND_TEST = 101;

    /**
     * The number of structural features of the '<em>Any Kind Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_KIND_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.impl.CommentImpl
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getComment()
     * @generated
     */
    int COMMENT = 102;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__TEXT = 0;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__COMMENT = 1;

    /**
     * The number of structural features of the '<em>Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.ForwardAxisKind <em>Forward Axis Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.ForwardAxisKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getForwardAxisKind()
     * @generated
     */
    int FORWARD_AXIS_KIND = 103;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.AbbrevForwardStepKind <em>Abbrev Forward Step Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.AbbrevForwardStepKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAbbrevForwardStepKind()
     * @generated
     */
    int ABBREV_FORWARD_STEP_KIND = 104;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.ReverseAxisKind <em>Reverse Axis Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.ReverseAxisKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getReverseAxisKind()
     * @generated
     */
    int REVERSE_AXIS_KIND = 105;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.AbbrevReverseStepKind <em>Abbrev Reverse Step Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.AbbrevReverseStepKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAbbrevReverseStepKind()
     * @generated
     */
    int ABBREV_REVERSE_STEP_KIND = 106;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.UnionOp <em>Union Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.UnionOp
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnionOp()
     * @generated
     */
    int UNION_OP = 107;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.AdditiveOpKind <em>Additive Op Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.AdditiveOpKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAdditiveOpKind()
     * @generated
     */
    int ADDITIVE_OP_KIND = 108;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.MultiplicativeOpKind <em>Multiplicative Op Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.MultiplicativeOpKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getMultiplicativeOpKind()
     * @generated
     */
    int MULTIPLICATIVE_OP_KIND = 109;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.QuantifierKind <em>Quantifier Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.QuantifierKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getQuantifierKind()
     * @generated
     */
    int QUANTIFIER_KIND = 110;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.IntersectExceptOpKind <em>Intersect Except Op Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.IntersectExceptOpKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIntersectExceptOpKind()
     * @generated
     */
    int INTERSECT_EXCEPT_OP_KIND = 111;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.UnaryOp <em>Unary Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.UnaryOp
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnaryOp()
     * @generated
     */
    int UNARY_OP = 112;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.GeneralCompKind <em>General Comp Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.GeneralCompKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getGeneralCompKind()
     * @generated
     */
    int GENERAL_COMP_KIND = 113;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.NodeCompKind <em>Node Comp Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.NodeCompKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNodeCompKind()
     * @generated
     */
    int NODE_COMP_KIND = 114;

    /**
     * The meta object id for the '{@link org.emftext.language.xpath3.OccurrenceIndicatorKind <em>Occurrence Indicator Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.xpath3.OccurrenceIndicatorKind
     * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getOccurrenceIndicatorKind()
     * @generated
     */
    int OCCURRENCE_INDICATOR_KIND = 115;


    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AnyExpr <em>Any Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any Expr</em>'.
     * @see org.emftext.language.xpath3.AnyExpr
     * @generated
     */
    EClass getAnyExpr();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.Expr <em>Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expr</em>'.
     * @see org.emftext.language.xpath3.Expr
     * @generated
     */
    EClass getExpr();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.Expr#getExpr <em>Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Expr</em>'.
     * @see org.emftext.language.xpath3.Expr#getExpr()
     * @see #getExpr()
     * @generated
     */
    EReference getExpr_Expr();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ExprSingle <em>Expr Single</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expr Single</em>'.
     * @see org.emftext.language.xpath3.ExprSingle
     * @generated
     */
    EClass getExprSingle();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ForExpr <em>For Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>For Expr</em>'.
     * @see org.emftext.language.xpath3.ForExpr
     * @generated
     */
    EClass getForExpr();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.ForExpr#getIterator <em>Iterator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Iterator</em>'.
     * @see org.emftext.language.xpath3.ForExpr#getIterator()
     * @see #getForExpr()
     * @generated
     */
    EReference getForExpr_Iterator();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.ForExpr#getReturn <em>Return</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Return</em>'.
     * @see org.emftext.language.xpath3.ForExpr#getReturn()
     * @see #getForExpr()
     * @generated
     */
    EReference getForExpr_Return();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.QuantifiedExpr <em>Quantified Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quantified Expr</em>'.
     * @see org.emftext.language.xpath3.QuantifiedExpr
     * @generated
     */
    EClass getQuantifiedExpr();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.QuantifiedExpr#getQuantifier <em>Quantifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Quantifier</em>'.
     * @see org.emftext.language.xpath3.QuantifiedExpr#getQuantifier()
     * @see #getQuantifiedExpr()
     * @generated
     */
    EAttribute getQuantifiedExpr_Quantifier();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.QuantifiedExpr#getIterator <em>Iterator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Iterator</em>'.
     * @see org.emftext.language.xpath3.QuantifiedExpr#getIterator()
     * @see #getQuantifiedExpr()
     * @generated
     */
    EReference getQuantifiedExpr_Iterator();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.QuantifiedExpr#getSatisfies <em>Satisfies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Satisfies</em>'.
     * @see org.emftext.language.xpath3.QuantifiedExpr#getSatisfies()
     * @see #getQuantifiedExpr()
     * @generated
     */
    EReference getQuantifiedExpr_Satisfies();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.IfExpr <em>If Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>If Expr</em>'.
     * @see org.emftext.language.xpath3.IfExpr
     * @generated
     */
    EClass getIfExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.IfExpr#getTest <em>Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Test</em>'.
     * @see org.emftext.language.xpath3.IfExpr#getTest()
     * @see #getIfExpr()
     * @generated
     */
    EReference getIfExpr_Test();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.IfExpr#getThen <em>Then</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Then</em>'.
     * @see org.emftext.language.xpath3.IfExpr#getThen()
     * @see #getIfExpr()
     * @generated
     */
    EReference getIfExpr_Then();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.IfExpr#getElse <em>Else</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Else</em>'.
     * @see org.emftext.language.xpath3.IfExpr#getElse()
     * @see #getIfExpr()
     * @generated
     */
    EReference getIfExpr_Else();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.Iterator <em>Iterator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Iterator</em>'.
     * @see org.emftext.language.xpath3.Iterator
     * @generated
     */
    EClass getIterator();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.Iterator#getVarName <em>Var Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Var Name</em>'.
     * @see org.emftext.language.xpath3.Iterator#getVarName()
     * @see #getIterator()
     * @generated
     */
    EAttribute getIterator_VarName();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.Iterator#getList <em>List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>List</em>'.
     * @see org.emftext.language.xpath3.Iterator#getList()
     * @see #getIterator()
     * @generated
     */
    EReference getIterator_List();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.OrExpr <em>Or Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Or Expr</em>'.
     * @see org.emftext.language.xpath3.OrExpr
     * @generated
     */
    EClass getOrExpr();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.OrExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.OrExpr#getOperand()
     * @see #getOrExpr()
     * @generated
     */
    EReference getOrExpr_Operand();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.OrExprChild <em>Or Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Or Expr Child</em>'.
     * @see org.emftext.language.xpath3.OrExprChild
     * @generated
     */
    EClass getOrExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AndExpr <em>And Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>And Expr</em>'.
     * @see org.emftext.language.xpath3.AndExpr
     * @generated
     */
    EClass getAndExpr();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.AndExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.AndExpr#getOperand()
     * @see #getAndExpr()
     * @generated
     */
    EReference getAndExpr_Operand();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AndExprChild <em>And Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>And Expr Child</em>'.
     * @see org.emftext.language.xpath3.AndExprChild
     * @generated
     */
    EClass getAndExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ComparisonExpr <em>Comparison Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comparison Expr</em>'.
     * @see org.emftext.language.xpath3.ComparisonExpr
     * @generated
     */
    EClass getComparisonExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.ComparisonExpr#getLeft <em>Left</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Left</em>'.
     * @see org.emftext.language.xpath3.ComparisonExpr#getLeft()
     * @see #getComparisonExpr()
     * @generated
     */
    EReference getComparisonExpr_Left();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.ComparisonExpr#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operator</em>'.
     * @see org.emftext.language.xpath3.ComparisonExpr#getOperator()
     * @see #getComparisonExpr()
     * @generated
     */
    EReference getComparisonExpr_Operator();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.ComparisonExpr#getRight <em>Right</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Right</em>'.
     * @see org.emftext.language.xpath3.ComparisonExpr#getRight()
     * @see #getComparisonExpr()
     * @generated
     */
    EReference getComparisonExpr_Right();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ComparisonExprChild <em>Comparison Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comparison Expr Child</em>'.
     * @see org.emftext.language.xpath3.ComparisonExprChild
     * @generated
     */
    EClass getComparisonExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.RangeExpr <em>Range Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Range Expr</em>'.
     * @see org.emftext.language.xpath3.RangeExpr
     * @generated
     */
    EClass getRangeExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.RangeExpr#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>From</em>'.
     * @see org.emftext.language.xpath3.RangeExpr#getFrom()
     * @see #getRangeExpr()
     * @generated
     */
    EReference getRangeExpr_From();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.RangeExpr#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>To</em>'.
     * @see org.emftext.language.xpath3.RangeExpr#getTo()
     * @see #getRangeExpr()
     * @generated
     */
    EReference getRangeExpr_To();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.RangeExprChild <em>Range Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Range Expr Child</em>'.
     * @see org.emftext.language.xpath3.RangeExprChild
     * @generated
     */
    EClass getRangeExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AdditiveExpr <em>Additive Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Additive Expr</em>'.
     * @see org.emftext.language.xpath3.AdditiveExpr
     * @generated
     */
    EClass getAdditiveExpr();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.AdditiveExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.AdditiveExpr#getOperand()
     * @see #getAdditiveExpr()
     * @generated
     */
    EReference getAdditiveExpr_Operand();

    /**
     * Returns the meta object for the attribute list '{@link org.emftext.language.xpath3.AdditiveExpr#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Operator</em>'.
     * @see org.emftext.language.xpath3.AdditiveExpr#getOperator()
     * @see #getAdditiveExpr()
     * @generated
     */
    EAttribute getAdditiveExpr_Operator();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AdditiveExprChild <em>Additive Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Additive Expr Child</em>'.
     * @see org.emftext.language.xpath3.AdditiveExprChild
     * @generated
     */
    EClass getAdditiveExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.MultiplicativeExpr <em>Multiplicative Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiplicative Expr</em>'.
     * @see org.emftext.language.xpath3.MultiplicativeExpr
     * @generated
     */
    EClass getMultiplicativeExpr();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.MultiplicativeExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.MultiplicativeExpr#getOperand()
     * @see #getMultiplicativeExpr()
     * @generated
     */
    EReference getMultiplicativeExpr_Operand();

    /**
     * Returns the meta object for the attribute list '{@link org.emftext.language.xpath3.MultiplicativeExpr#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Operator</em>'.
     * @see org.emftext.language.xpath3.MultiplicativeExpr#getOperator()
     * @see #getMultiplicativeExpr()
     * @generated
     */
    EAttribute getMultiplicativeExpr_Operator();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.MultiplicativeExprChild <em>Multiplicative Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiplicative Expr Child</em>'.
     * @see org.emftext.language.xpath3.MultiplicativeExprChild
     * @generated
     */
    EClass getMultiplicativeExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.UnionExpr <em>Union Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Union Expr</em>'.
     * @see org.emftext.language.xpath3.UnionExpr
     * @generated
     */
    EClass getUnionExpr();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.UnionExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.UnionExpr#getOperand()
     * @see #getUnionExpr()
     * @generated
     */
    EReference getUnionExpr_Operand();

    /**
     * Returns the meta object for the attribute list '{@link org.emftext.language.xpath3.UnionExpr#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Operation</em>'.
     * @see org.emftext.language.xpath3.UnionExpr#getOperation()
     * @see #getUnionExpr()
     * @generated
     */
    EAttribute getUnionExpr_Operation();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.UnionExprChild <em>Union Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Union Expr Child</em>'.
     * @see org.emftext.language.xpath3.UnionExprChild
     * @generated
     */
    EClass getUnionExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.IntersectExceptExpr <em>Intersect Except Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intersect Except Expr</em>'.
     * @see org.emftext.language.xpath3.IntersectExceptExpr
     * @generated
     */
    EClass getIntersectExceptExpr();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.IntersectExceptExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.IntersectExceptExpr#getOperand()
     * @see #getIntersectExceptExpr()
     * @generated
     */
    EReference getIntersectExceptExpr_Operand();

    /**
     * Returns the meta object for the attribute list '{@link org.emftext.language.xpath3.IntersectExceptExpr#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Operator</em>'.
     * @see org.emftext.language.xpath3.IntersectExceptExpr#getOperator()
     * @see #getIntersectExceptExpr()
     * @generated
     */
    EAttribute getIntersectExceptExpr_Operator();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.IntersectExceptExprChild <em>Intersect Except Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intersect Except Expr Child</em>'.
     * @see org.emftext.language.xpath3.IntersectExceptExprChild
     * @generated
     */
    EClass getIntersectExceptExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.InstanceofExpr <em>Instanceof Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instanceof Expr</em>'.
     * @see org.emftext.language.xpath3.InstanceofExpr
     * @generated
     */
    EClass getInstanceofExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.InstanceofExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.InstanceofExpr#getOperand()
     * @see #getInstanceofExpr()
     * @generated
     */
    EReference getInstanceofExpr_Operand();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.InstanceofExpr#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.emftext.language.xpath3.InstanceofExpr#getType()
     * @see #getInstanceofExpr()
     * @generated
     */
    EReference getInstanceofExpr_Type();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.InstanceofExprChild <em>Instanceof Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instanceof Expr Child</em>'.
     * @see org.emftext.language.xpath3.InstanceofExprChild
     * @generated
     */
    EClass getInstanceofExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.TreatExpr <em>Treat Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Treat Expr</em>'.
     * @see org.emftext.language.xpath3.TreatExpr
     * @generated
     */
    EClass getTreatExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.TreatExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.TreatExpr#getOperand()
     * @see #getTreatExpr()
     * @generated
     */
    EReference getTreatExpr_Operand();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.TreatExpr#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.emftext.language.xpath3.TreatExpr#getType()
     * @see #getTreatExpr()
     * @generated
     */
    EReference getTreatExpr_Type();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.TreatExprChild <em>Treat Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Treat Expr Child</em>'.
     * @see org.emftext.language.xpath3.TreatExprChild
     * @generated
     */
    EClass getTreatExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.CastableExpr <em>Castable Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Castable Expr</em>'.
     * @see org.emftext.language.xpath3.CastableExpr
     * @generated
     */
    EClass getCastableExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.CastableExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.CastableExpr#getOperand()
     * @see #getCastableExpr()
     * @generated
     */
    EReference getCastableExpr_Operand();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.CastableExpr#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.emftext.language.xpath3.CastableExpr#getType()
     * @see #getCastableExpr()
     * @generated
     */
    EReference getCastableExpr_Type();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.CastableExprChild <em>Castable Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Castable Expr Child</em>'.
     * @see org.emftext.language.xpath3.CastableExprChild
     * @generated
     */
    EClass getCastableExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.CastExpr <em>Cast Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cast Expr</em>'.
     * @see org.emftext.language.xpath3.CastExpr
     * @generated
     */
    EClass getCastExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.CastExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.CastExpr#getOperand()
     * @see #getCastExpr()
     * @generated
     */
    EReference getCastExpr_Operand();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.CastExpr#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.emftext.language.xpath3.CastExpr#getType()
     * @see #getCastExpr()
     * @generated
     */
    EReference getCastExpr_Type();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.CastExprChild <em>Cast Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cast Expr Child</em>'.
     * @see org.emftext.language.xpath3.CastExprChild
     * @generated
     */
    EClass getCastExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.UnaryExpr <em>Unary Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unary Expr</em>'.
     * @see org.emftext.language.xpath3.UnaryExpr
     * @generated
     */
    EClass getUnaryExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.UnaryExpr#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operand</em>'.
     * @see org.emftext.language.xpath3.UnaryExpr#getOperand()
     * @see #getUnaryExpr()
     * @generated
     */
    EReference getUnaryExpr_Operand();

    /**
     * Returns the meta object for the attribute list '{@link org.emftext.language.xpath3.UnaryExpr#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Operator</em>'.
     * @see org.emftext.language.xpath3.UnaryExpr#getOperator()
     * @see #getUnaryExpr()
     * @generated
     */
    EAttribute getUnaryExpr_Operator();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.UnaryExprChild <em>Unary Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unary Expr Child</em>'.
     * @see org.emftext.language.xpath3.UnaryExprChild
     * @generated
     */
    EClass getUnaryExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ValueExpr <em>Value Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Expr</em>'.
     * @see org.emftext.language.xpath3.ValueExpr
     * @generated
     */
    EClass getValueExpr();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.PathExpr <em>Path Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Path Expr</em>'.
     * @see org.emftext.language.xpath3.PathExpr
     * @generated
     */
    EClass getPathExpr();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.PathExpr#getStep <em>Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Step</em>'.
     * @see org.emftext.language.xpath3.PathExpr#getStep()
     * @see #getPathExpr()
     * @generated
     */
    EReference getPathExpr_Step();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.PathExprChild <em>Path Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Path Expr Child</em>'.
     * @see org.emftext.language.xpath3.PathExprChild
     * @generated
     */
    EClass getPathExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.RootStepExpr <em>Root Step Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Root Step Expr</em>'.
     * @see org.emftext.language.xpath3.RootStepExpr
     * @generated
     */
    EClass getRootStepExpr();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ChildStepExpr <em>Child Step Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Child Step Expr</em>'.
     * @see org.emftext.language.xpath3.ChildStepExpr
     * @generated
     */
    EClass getChildStepExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.ChildStepExpr#getStep <em>Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Step</em>'.
     * @see org.emftext.language.xpath3.ChildStepExpr#getStep()
     * @see #getChildStepExpr()
     * @generated
     */
    EReference getChildStepExpr_Step();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.DescOrSelfStepExpr <em>Desc Or Self Step Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Desc Or Self Step Expr</em>'.
     * @see org.emftext.language.xpath3.DescOrSelfStepExpr
     * @generated
     */
    EClass getDescOrSelfStepExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.DescOrSelfStepExpr#getStep <em>Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Step</em>'.
     * @see org.emftext.language.xpath3.DescOrSelfStepExpr#getStep()
     * @see #getDescOrSelfStepExpr()
     * @generated
     */
    EReference getDescOrSelfStepExpr_Step();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.SelfStepExpr <em>Self Step Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Self Step Expr</em>'.
     * @see org.emftext.language.xpath3.SelfStepExpr
     * @generated
     */
    EClass getSelfStepExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.SelfStepExpr#getStep <em>Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Step</em>'.
     * @see org.emftext.language.xpath3.SelfStepExpr#getStep()
     * @see #getSelfStepExpr()
     * @generated
     */
    EReference getSelfStepExpr_Step();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.SelfStepExprChild <em>Self Step Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Self Step Expr Child</em>'.
     * @see org.emftext.language.xpath3.SelfStepExprChild
     * @generated
     */
    EClass getSelfStepExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.StepExpr <em>Step Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Step Expr</em>'.
     * @see org.emftext.language.xpath3.StepExpr
     * @generated
     */
    EClass getStepExpr();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.FilterExpr <em>Filter Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Filter Expr</em>'.
     * @see org.emftext.language.xpath3.FilterExpr
     * @generated
     */
    EClass getFilterExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.FilterExpr#getPrimaryExpr <em>Primary Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Primary Expr</em>'.
     * @see org.emftext.language.xpath3.FilterExpr#getPrimaryExpr()
     * @see #getFilterExpr()
     * @generated
     */
    EReference getFilterExpr_PrimaryExpr();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.FilterExpr#getPredicate <em>Predicate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Predicate</em>'.
     * @see org.emftext.language.xpath3.FilterExpr#getPredicate()
     * @see #getFilterExpr()
     * @generated
     */
    EReference getFilterExpr_Predicate();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.FilterExprChild <em>Filter Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Filter Expr Child</em>'.
     * @see org.emftext.language.xpath3.FilterExprChild
     * @generated
     */
    EClass getFilterExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AxisStep <em>Axis Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Axis Step</em>'.
     * @see org.emftext.language.xpath3.AxisStep
     * @generated
     */
    EClass getAxisStep();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.AxisStep#getPredicate <em>Predicate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Predicate</em>'.
     * @see org.emftext.language.xpath3.AxisStep#getPredicate()
     * @see #getAxisStep()
     * @generated
     */
    EReference getAxisStep_Predicate();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ForwardStep <em>Forward Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Forward Step</em>'.
     * @see org.emftext.language.xpath3.ForwardStep
     * @generated
     */
    EClass getForwardStep();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ReverseStep <em>Reverse Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reverse Step</em>'.
     * @see org.emftext.language.xpath3.ReverseStep
     * @generated
     */
    EClass getReverseStep();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.GeneralForwardStep <em>General Forward Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>General Forward Step</em>'.
     * @see org.emftext.language.xpath3.GeneralForwardStep
     * @generated
     */
    EClass getGeneralForwardStep();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.GeneralForwardStep#getAxis <em>Axis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Axis</em>'.
     * @see org.emftext.language.xpath3.GeneralForwardStep#getAxis()
     * @see #getGeneralForwardStep()
     * @generated
     */
    EAttribute getGeneralForwardStep_Axis();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.GeneralForwardStep#getNodeTest <em>Node Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Node Test</em>'.
     * @see org.emftext.language.xpath3.GeneralForwardStep#getNodeTest()
     * @see #getGeneralForwardStep()
     * @generated
     */
    EReference getGeneralForwardStep_NodeTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AbbrevForwardStep <em>Abbrev Forward Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abbrev Forward Step</em>'.
     * @see org.emftext.language.xpath3.AbbrevForwardStep
     * @generated
     */
    EClass getAbbrevForwardStep();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.AbbrevForwardStep#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.emftext.language.xpath3.AbbrevForwardStep#getKind()
     * @see #getAbbrevForwardStep()
     * @generated
     */
    EAttribute getAbbrevForwardStep_Kind();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.AbbrevForwardStep#getNodeTest <em>Node Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Node Test</em>'.
     * @see org.emftext.language.xpath3.AbbrevForwardStep#getNodeTest()
     * @see #getAbbrevForwardStep()
     * @generated
     */
    EReference getAbbrevForwardStep_NodeTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.GeneralReverseStep <em>General Reverse Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>General Reverse Step</em>'.
     * @see org.emftext.language.xpath3.GeneralReverseStep
     * @generated
     */
    EClass getGeneralReverseStep();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.GeneralReverseStep#getAxis <em>Axis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Axis</em>'.
     * @see org.emftext.language.xpath3.GeneralReverseStep#getAxis()
     * @see #getGeneralReverseStep()
     * @generated
     */
    EAttribute getGeneralReverseStep_Axis();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.GeneralReverseStep#getNodeTest <em>Node Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Node Test</em>'.
     * @see org.emftext.language.xpath3.GeneralReverseStep#getNodeTest()
     * @see #getGeneralReverseStep()
     * @generated
     */
    EReference getGeneralReverseStep_NodeTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AbbrevReverseStep <em>Abbrev Reverse Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abbrev Reverse Step</em>'.
     * @see org.emftext.language.xpath3.AbbrevReverseStep
     * @generated
     */
    EClass getAbbrevReverseStep();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.AbbrevReverseStep#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.emftext.language.xpath3.AbbrevReverseStep#getKind()
     * @see #getAbbrevReverseStep()
     * @generated
     */
    EAttribute getAbbrevReverseStep_Kind();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.NodeTest <em>Node Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node Test</em>'.
     * @see org.emftext.language.xpath3.NodeTest
     * @generated
     */
    EClass getNodeTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.NodeKindTest <em>Node Kind Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node Kind Test</em>'.
     * @see org.emftext.language.xpath3.NodeKindTest
     * @generated
     */
    EClass getNodeKindTest();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.NodeKindTest#getTest <em>Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Test</em>'.
     * @see org.emftext.language.xpath3.NodeKindTest#getTest()
     * @see #getNodeKindTest()
     * @generated
     */
    EReference getNodeKindTest_Test();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.NameTest <em>Name Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Name Test</em>'.
     * @see org.emftext.language.xpath3.NameTest
     * @generated
     */
    EClass getNameTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.QNameTest <em>QName Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>QName Test</em>'.
     * @see org.emftext.language.xpath3.QNameTest
     * @generated
     */
    EClass getQNameTest();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.QNameTest#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.xpath3.QNameTest#getName()
     * @see #getQNameTest()
     * @generated
     */
    EAttribute getQNameTest_Name();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.Wildcard <em>Wildcard</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wildcard</em>'.
     * @see org.emftext.language.xpath3.Wildcard
     * @generated
     */
    EClass getWildcard();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AnyWildcard <em>Any Wildcard</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any Wildcard</em>'.
     * @see org.emftext.language.xpath3.AnyWildcard
     * @generated
     */
    EClass getAnyWildcard();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.LocalNameWildcard <em>Local Name Wildcard</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Name Wildcard</em>'.
     * @see org.emftext.language.xpath3.LocalNameWildcard
     * @generated
     */
    EClass getLocalNameWildcard();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.LocalNameWildcard#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.emftext.language.xpath3.LocalNameWildcard#getNamespace()
     * @see #getLocalNameWildcard()
     * @generated
     */
    EAttribute getLocalNameWildcard_Namespace();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.NamespaceWildcard <em>Namespace Wildcard</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Namespace Wildcard</em>'.
     * @see org.emftext.language.xpath3.NamespaceWildcard
     * @generated
     */
    EClass getNamespaceWildcard();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.NamespaceWildcard#getLocalName <em>Local Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Name</em>'.
     * @see org.emftext.language.xpath3.NamespaceWildcard#getLocalName()
     * @see #getNamespaceWildcard()
     * @generated
     */
    EAttribute getNamespaceWildcard_LocalName();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.Predicate <em>Predicate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Predicate</em>'.
     * @see org.emftext.language.xpath3.Predicate
     * @generated
     */
    EClass getPredicate();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.Predicate#getExpr <em>Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expr</em>'.
     * @see org.emftext.language.xpath3.Predicate#getExpr()
     * @see #getPredicate()
     * @generated
     */
    EReference getPredicate_Expr();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.PrimaryExpr <em>Primary Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primary Expr</em>'.
     * @see org.emftext.language.xpath3.PrimaryExpr
     * @generated
     */
    EClass getPrimaryExpr();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.Literal <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal</em>'.
     * @see org.emftext.language.xpath3.Literal
     * @generated
     */
    EClass getLiteral();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.VarRef <em>Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Var Ref</em>'.
     * @see org.emftext.language.xpath3.VarRef
     * @generated
     */
    EClass getVarRef();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.VarRef#getVarName <em>Var Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Var Name</em>'.
     * @see org.emftext.language.xpath3.VarRef#getVarName()
     * @see #getVarRef()
     * @generated
     */
    EAttribute getVarRef_VarName();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ParenthesizedExpr <em>Parenthesized Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parenthesized Expr</em>'.
     * @see org.emftext.language.xpath3.ParenthesizedExpr
     * @generated
     */
    EClass getParenthesizedExpr();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.ParenthesizedExpr#getExpr <em>Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expr</em>'.
     * @see org.emftext.language.xpath3.ParenthesizedExpr#getExpr()
     * @see #getParenthesizedExpr()
     * @generated
     */
    EReference getParenthesizedExpr_Expr();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ParenthesizedExprChild <em>Parenthesized Expr Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parenthesized Expr Child</em>'.
     * @see org.emftext.language.xpath3.ParenthesizedExprChild
     * @generated
     */
    EClass getParenthesizedExprChild();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ContextItemExpr <em>Context Item Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Item Expr</em>'.
     * @see org.emftext.language.xpath3.ContextItemExpr
     * @generated
     */
    EClass getContextItemExpr();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.FunctionCall <em>Function Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Call</em>'.
     * @see org.emftext.language.xpath3.FunctionCall
     * @generated
     */
    EClass getFunctionCall();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.FunctionCall#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.xpath3.FunctionCall#getName()
     * @see #getFunctionCall()
     * @generated
     */
    EAttribute getFunctionCall_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.FunctionCall#getArg <em>Arg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Arg</em>'.
     * @see org.emftext.language.xpath3.FunctionCall#getArg()
     * @see #getFunctionCall()
     * @generated
     */
    EReference getFunctionCall_Arg();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.NumericLiteral <em>Numeric Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Numeric Literal</em>'.
     * @see org.emftext.language.xpath3.NumericLiteral
     * @generated
     */
    EClass getNumericLiteral();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.StringLiteral <em>String Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Literal</em>'.
     * @see org.emftext.language.xpath3.StringLiteral
     * @generated
     */
    EClass getStringLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.StringLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.xpath3.StringLiteral#getValue()
     * @see #getStringLiteral()
     * @generated
     */
    EAttribute getStringLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.IntegerLiteral <em>Integer Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Integer Literal</em>'.
     * @see org.emftext.language.xpath3.IntegerLiteral
     * @generated
     */
    EClass getIntegerLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.IntegerLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.xpath3.IntegerLiteral#getValue()
     * @see #getIntegerLiteral()
     * @generated
     */
    EAttribute getIntegerLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.DecimalLiteral <em>Decimal Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Decimal Literal</em>'.
     * @see org.emftext.language.xpath3.DecimalLiteral
     * @generated
     */
    EClass getDecimalLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.DecimalLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.xpath3.DecimalLiteral#getValue()
     * @see #getDecimalLiteral()
     * @generated
     */
    EAttribute getDecimalLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.DoubleLiteral <em>Double Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Double Literal</em>'.
     * @see org.emftext.language.xpath3.DoubleLiteral
     * @generated
     */
    EClass getDoubleLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.DoubleLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.xpath3.DoubleLiteral#getValue()
     * @see #getDoubleLiteral()
     * @generated
     */
    EAttribute getDoubleLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.Comp <em>Comp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comp</em>'.
     * @see org.emftext.language.xpath3.Comp
     * @generated
     */
    EClass getComp();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.GeneralComp <em>General Comp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>General Comp</em>'.
     * @see org.emftext.language.xpath3.GeneralComp
     * @generated
     */
    EClass getGeneralComp();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.GeneralComp#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see org.emftext.language.xpath3.GeneralComp#getOperator()
     * @see #getGeneralComp()
     * @generated
     */
    EAttribute getGeneralComp_Operator();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ValueComp <em>Value Comp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Comp</em>'.
     * @see org.emftext.language.xpath3.ValueComp
     * @generated
     */
    EClass getValueComp();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.ValueComp#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see org.emftext.language.xpath3.ValueComp#getOperator()
     * @see #getValueComp()
     * @generated
     */
    EAttribute getValueComp_Operator();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.NodeComp <em>Node Comp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node Comp</em>'.
     * @see org.emftext.language.xpath3.NodeComp
     * @generated
     */
    EClass getNodeComp();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.NodeComp#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see org.emftext.language.xpath3.NodeComp#getOperator()
     * @see #getNodeComp()
     * @generated
     */
    EAttribute getNodeComp_Operator();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.SingleType <em>Single Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Single Type</em>'.
     * @see org.emftext.language.xpath3.SingleType
     * @generated
     */
    EClass getSingleType();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.SingleType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.emftext.language.xpath3.SingleType#getType()
     * @see #getSingleType()
     * @generated
     */
    EReference getSingleType_Type();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.SingleType#isOptional <em>Optional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Optional</em>'.
     * @see org.emftext.language.xpath3.SingleType#isOptional()
     * @see #getSingleType()
     * @generated
     */
    EAttribute getSingleType_Optional();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AtomicType <em>Atomic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Atomic Type</em>'.
     * @see org.emftext.language.xpath3.AtomicType
     * @generated
     */
    EClass getAtomicType();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.AtomicType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.xpath3.AtomicType#getName()
     * @see #getAtomicType()
     * @generated
     */
    EAttribute getAtomicType_Name();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.OptionalAtomicType <em>Optional Atomic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Optional Atomic Type</em>'.
     * @see org.emftext.language.xpath3.OptionalAtomicType
     * @generated
     */
    EClass getOptionalAtomicType();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.OptionalAtomicType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.xpath3.OptionalAtomicType#getName()
     * @see #getOptionalAtomicType()
     * @generated
     */
    EAttribute getOptionalAtomicType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.OptionalAtomicType#isOptional <em>Optional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Optional</em>'.
     * @see org.emftext.language.xpath3.OptionalAtomicType#isOptional()
     * @see #getOptionalAtomicType()
     * @generated
     */
    EAttribute getOptionalAtomicType_Optional();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.SequenceType <em>Sequence Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sequence Type</em>'.
     * @see org.emftext.language.xpath3.SequenceType
     * @generated
     */
    EClass getSequenceType();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.EmptySequenceType <em>Empty Sequence Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Empty Sequence Type</em>'.
     * @see org.emftext.language.xpath3.EmptySequenceType
     * @generated
     */
    EClass getEmptySequenceType();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ItemSequenceType <em>Item Sequence Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Sequence Type</em>'.
     * @see org.emftext.language.xpath3.ItemSequenceType
     * @generated
     */
    EClass getItemSequenceType();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.ItemSequenceType#getItemType <em>Item Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Item Type</em>'.
     * @see org.emftext.language.xpath3.ItemSequenceType#getItemType()
     * @see #getItemSequenceType()
     * @generated
     */
    EReference getItemSequenceType_ItemType();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.ItemSequenceType#getOccurrence <em>Occurrence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Occurrence</em>'.
     * @see org.emftext.language.xpath3.ItemSequenceType#getOccurrence()
     * @see #getItemSequenceType()
     * @generated
     */
    EAttribute getItemSequenceType_Occurrence();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ItemType <em>Item Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Type</em>'.
     * @see org.emftext.language.xpath3.ItemType
     * @generated
     */
    EClass getItemType();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ItemKindTest <em>Item Kind Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Kind Test</em>'.
     * @see org.emftext.language.xpath3.ItemKindTest
     * @generated
     */
    EClass getItemKindTest();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.ItemKindTest#getTest <em>Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Test</em>'.
     * @see org.emftext.language.xpath3.ItemKindTest#getTest()
     * @see #getItemKindTest()
     * @generated
     */
    EReference getItemKindTest_Test();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AnyItemType <em>Any Item Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any Item Type</em>'.
     * @see org.emftext.language.xpath3.AnyItemType
     * @generated
     */
    EClass getAnyItemType();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AtomicItemType <em>Atomic Item Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Atomic Item Type</em>'.
     * @see org.emftext.language.xpath3.AtomicItemType
     * @generated
     */
    EClass getAtomicItemType();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.AtomicItemType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.emftext.language.xpath3.AtomicItemType#getType()
     * @see #getAtomicItemType()
     * @generated
     */
    EReference getAtomicItemType_Type();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.KindTest <em>Kind Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Kind Test</em>'.
     * @see org.emftext.language.xpath3.KindTest
     * @generated
     */
    EClass getKindTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.DocumentTest <em>Document Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Test</em>'.
     * @see org.emftext.language.xpath3.DocumentTest
     * @generated
     */
    EClass getDocumentTest();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.DocumentTest#getTest <em>Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Test</em>'.
     * @see org.emftext.language.xpath3.DocumentTest#getTest()
     * @see #getDocumentTest()
     * @generated
     */
    EReference getDocumentTest_Test();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.ElementTest <em>Element Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Test</em>'.
     * @see org.emftext.language.xpath3.ElementTest
     * @generated
     */
    EClass getElementTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.NameElementTest <em>Name Element Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Name Element Test</em>'.
     * @see org.emftext.language.xpath3.NameElementTest
     * @generated
     */
    EClass getNameElementTest();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.NameElementTest#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.xpath3.NameElementTest#getName()
     * @see #getNameElementTest()
     * @generated
     */
    EAttribute getNameElementTest_Name();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.NameElementTest#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.emftext.language.xpath3.NameElementTest#getType()
     * @see #getNameElementTest()
     * @generated
     */
    EReference getNameElementTest_Type();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.WildcardElementTest <em>Wildcard Element Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wildcard Element Test</em>'.
     * @see org.emftext.language.xpath3.WildcardElementTest
     * @generated
     */
    EClass getWildcardElementTest();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.xpath3.WildcardElementTest#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.emftext.language.xpath3.WildcardElementTest#getType()
     * @see #getWildcardElementTest()
     * @generated
     */
    EReference getWildcardElementTest_Type();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AttributeTest <em>Attribute Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Test</em>'.
     * @see org.emftext.language.xpath3.AttributeTest
     * @generated
     */
    EClass getAttributeTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.NameAttributeTest <em>Name Attribute Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Name Attribute Test</em>'.
     * @see org.emftext.language.xpath3.NameAttributeTest
     * @generated
     */
    EClass getNameAttributeTest();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.NameAttributeTest#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.xpath3.NameAttributeTest#getName()
     * @see #getNameAttributeTest()
     * @generated
     */
    EAttribute getNameAttributeTest_Name();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.NameAttributeTest#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.emftext.language.xpath3.NameAttributeTest#getType()
     * @see #getNameAttributeTest()
     * @generated
     */
    EAttribute getNameAttributeTest_Type();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.WildcardAttributeTest <em>Wildcard Attribute Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wildcard Attribute Test</em>'.
     * @see org.emftext.language.xpath3.WildcardAttributeTest
     * @generated
     */
    EClass getWildcardAttributeTest();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.WildcardAttributeTest#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.emftext.language.xpath3.WildcardAttributeTest#getType()
     * @see #getWildcardAttributeTest()
     * @generated
     */
    EAttribute getWildcardAttributeTest_Type();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.SchemaElementTest <em>Schema Element Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schema Element Test</em>'.
     * @see org.emftext.language.xpath3.SchemaElementTest
     * @generated
     */
    EClass getSchemaElementTest();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.SchemaElementTest#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.xpath3.SchemaElementTest#getName()
     * @see #getSchemaElementTest()
     * @generated
     */
    EAttribute getSchemaElementTest_Name();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.SchemaAttributeTest <em>Schema Attribute Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schema Attribute Test</em>'.
     * @see org.emftext.language.xpath3.SchemaAttributeTest
     * @generated
     */
    EClass getSchemaAttributeTest();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.SchemaAttributeTest#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.xpath3.SchemaAttributeTest#getName()
     * @see #getSchemaAttributeTest()
     * @generated
     */
    EAttribute getSchemaAttributeTest_Name();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.PITest <em>PI Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>PI Test</em>'.
     * @see org.emftext.language.xpath3.PITest
     * @generated
     */
    EClass getPITest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.NCNamePITest <em>NC Name PI Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>NC Name PI Test</em>'.
     * @see org.emftext.language.xpath3.NCNamePITest
     * @generated
     */
    EClass getNCNamePITest();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.xpath3.NCNamePITest#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.xpath3.NCNamePITest#getName()
     * @see #getNCNamePITest()
     * @generated
     */
    EAttribute getNCNamePITest_Name();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.StringLiteralPITest <em>String Literal PI Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Literal PI Test</em>'.
     * @see org.emftext.language.xpath3.StringLiteralPITest
     * @generated
     */
    EClass getStringLiteralPITest();

    /**
     * Returns the meta object for the reference '{@link org.emftext.language.xpath3.StringLiteralPITest#getLiteral <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Literal</em>'.
     * @see org.emftext.language.xpath3.StringLiteralPITest#getLiteral()
     * @see #getStringLiteralPITest()
     * @generated
     */
    EReference getStringLiteralPITest_Literal();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.CommentTest <em>Comment Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comment Test</em>'.
     * @see org.emftext.language.xpath3.CommentTest
     * @generated
     */
    EClass getCommentTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.TextTest <em>Text Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Test</em>'.
     * @see org.emftext.language.xpath3.TextTest
     * @generated
     */
    EClass getTextTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.AnyKindTest <em>Any Kind Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any Kind Test</em>'.
     * @see org.emftext.language.xpath3.AnyKindTest
     * @generated
     */
    EClass getAnyKindTest();

    /**
     * Returns the meta object for class '{@link org.emftext.language.xpath3.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comment</em>'.
     * @see org.emftext.language.xpath3.Comment
     * @generated
     */
    EClass getComment();

    /**
     * Returns the meta object for the attribute list '{@link org.emftext.language.xpath3.Comment#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Text</em>'.
     * @see org.emftext.language.xpath3.Comment#getText()
     * @see #getComment()
     * @generated
     */
    EAttribute getComment_Text();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.xpath3.Comment#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Comment</em>'.
     * @see org.emftext.language.xpath3.Comment#getComment()
     * @see #getComment()
     * @generated
     */
    EReference getComment_Comment();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.ForwardAxisKind <em>Forward Axis Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Forward Axis Kind</em>'.
     * @see org.emftext.language.xpath3.ForwardAxisKind
     * @generated
     */
    EEnum getForwardAxisKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.AbbrevForwardStepKind <em>Abbrev Forward Step Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Abbrev Forward Step Kind</em>'.
     * @see org.emftext.language.xpath3.AbbrevForwardStepKind
     * @generated
     */
    EEnum getAbbrevForwardStepKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.ReverseAxisKind <em>Reverse Axis Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Reverse Axis Kind</em>'.
     * @see org.emftext.language.xpath3.ReverseAxisKind
     * @generated
     */
    EEnum getReverseAxisKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.AbbrevReverseStepKind <em>Abbrev Reverse Step Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Abbrev Reverse Step Kind</em>'.
     * @see org.emftext.language.xpath3.AbbrevReverseStepKind
     * @generated
     */
    EEnum getAbbrevReverseStepKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.UnionOp <em>Union Op</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Union Op</em>'.
     * @see org.emftext.language.xpath3.UnionOp
     * @generated
     */
    EEnum getUnionOp();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.AdditiveOpKind <em>Additive Op Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Additive Op Kind</em>'.
     * @see org.emftext.language.xpath3.AdditiveOpKind
     * @generated
     */
    EEnum getAdditiveOpKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.MultiplicativeOpKind <em>Multiplicative Op Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Multiplicative Op Kind</em>'.
     * @see org.emftext.language.xpath3.MultiplicativeOpKind
     * @generated
     */
    EEnum getMultiplicativeOpKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.QuantifierKind <em>Quantifier Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Quantifier Kind</em>'.
     * @see org.emftext.language.xpath3.QuantifierKind
     * @generated
     */
    EEnum getQuantifierKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.IntersectExceptOpKind <em>Intersect Except Op Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Intersect Except Op Kind</em>'.
     * @see org.emftext.language.xpath3.IntersectExceptOpKind
     * @generated
     */
    EEnum getIntersectExceptOpKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.UnaryOp <em>Unary Op</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Unary Op</em>'.
     * @see org.emftext.language.xpath3.UnaryOp
     * @generated
     */
    EEnum getUnaryOp();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.GeneralCompKind <em>General Comp Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>General Comp Kind</em>'.
     * @see org.emftext.language.xpath3.GeneralCompKind
     * @generated
     */
    EEnum getGeneralCompKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.NodeCompKind <em>Node Comp Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Node Comp Kind</em>'.
     * @see org.emftext.language.xpath3.NodeCompKind
     * @generated
     */
    EEnum getNodeCompKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.xpath3.OccurrenceIndicatorKind <em>Occurrence Indicator Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Occurrence Indicator Kind</em>'.
     * @see org.emftext.language.xpath3.OccurrenceIndicatorKind
     * @generated
     */
    EEnum getOccurrenceIndicatorKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    XPath3Factory getXPath3Factory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AnyExprImpl <em>Any Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AnyExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAnyExpr()
         * @generated
         */
        EClass ANY_EXPR = eINSTANCE.getAnyExpr();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ExprImpl <em>Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getExpr()
         * @generated
         */
        EClass EXPR = eINSTANCE.getExpr();

        /**
         * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPR__EXPR = eINSTANCE.getExpr_Expr();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ExprSingleImpl <em>Expr Single</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ExprSingleImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getExprSingle()
         * @generated
         */
        EClass EXPR_SINGLE = eINSTANCE.getExprSingle();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ForExprImpl <em>For Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ForExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getForExpr()
         * @generated
         */
        EClass FOR_EXPR = eINSTANCE.getForExpr();

        /**
         * The meta object literal for the '<em><b>Iterator</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EXPR__ITERATOR = eINSTANCE.getForExpr_Iterator();

        /**
         * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EXPR__RETURN = eINSTANCE.getForExpr_Return();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.QuantifiedExprImpl <em>Quantified Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.QuantifiedExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getQuantifiedExpr()
         * @generated
         */
        EClass QUANTIFIED_EXPR = eINSTANCE.getQuantifiedExpr();

        /**
         * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUANTIFIED_EXPR__QUANTIFIER = eINSTANCE.getQuantifiedExpr_Quantifier();

        /**
         * The meta object literal for the '<em><b>Iterator</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUANTIFIED_EXPR__ITERATOR = eINSTANCE.getQuantifiedExpr_Iterator();

        /**
         * The meta object literal for the '<em><b>Satisfies</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUANTIFIED_EXPR__SATISFIES = eINSTANCE.getQuantifiedExpr_Satisfies();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.IfExprImpl <em>If Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.IfExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIfExpr()
         * @generated
         */
        EClass IF_EXPR = eINSTANCE.getIfExpr();

        /**
         * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IF_EXPR__TEST = eINSTANCE.getIfExpr_Test();

        /**
         * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IF_EXPR__THEN = eINSTANCE.getIfExpr_Then();

        /**
         * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IF_EXPR__ELSE = eINSTANCE.getIfExpr_Else();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.IteratorImpl <em>Iterator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.IteratorImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIterator()
         * @generated
         */
        EClass ITERATOR = eINSTANCE.getIterator();

        /**
         * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITERATOR__VAR_NAME = eINSTANCE.getIterator_VarName();

        /**
         * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITERATOR__LIST = eINSTANCE.getIterator_List();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.OrExprImpl <em>Or Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.OrExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getOrExpr()
         * @generated
         */
        EClass OR_EXPR = eINSTANCE.getOrExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OR_EXPR__OPERAND = eINSTANCE.getOrExpr_Operand();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.OrExprChildImpl <em>Or Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.OrExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getOrExprChild()
         * @generated
         */
        EClass OR_EXPR_CHILD = eINSTANCE.getOrExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AndExprImpl <em>And Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AndExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAndExpr()
         * @generated
         */
        EClass AND_EXPR = eINSTANCE.getAndExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AND_EXPR__OPERAND = eINSTANCE.getAndExpr_Operand();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AndExprChildImpl <em>And Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AndExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAndExprChild()
         * @generated
         */
        EClass AND_EXPR_CHILD = eINSTANCE.getAndExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ComparisonExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getComparisonExpr()
         * @generated
         */
        EClass COMPARISON_EXPR = eINSTANCE.getComparisonExpr();

        /**
         * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPARISON_EXPR__LEFT = eINSTANCE.getComparisonExpr_Left();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPARISON_EXPR__OPERATOR = eINSTANCE.getComparisonExpr_Operator();

        /**
         * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPARISON_EXPR__RIGHT = eINSTANCE.getComparisonExpr_Right();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ComparisonExprChildImpl <em>Comparison Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ComparisonExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getComparisonExprChild()
         * @generated
         */
        EClass COMPARISON_EXPR_CHILD = eINSTANCE.getComparisonExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.RangeExprImpl <em>Range Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.RangeExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getRangeExpr()
         * @generated
         */
        EClass RANGE_EXPR = eINSTANCE.getRangeExpr();

        /**
         * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RANGE_EXPR__FROM = eINSTANCE.getRangeExpr_From();

        /**
         * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RANGE_EXPR__TO = eINSTANCE.getRangeExpr_To();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.RangeExprChildImpl <em>Range Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.RangeExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getRangeExprChild()
         * @generated
         */
        EClass RANGE_EXPR_CHILD = eINSTANCE.getRangeExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AdditiveExprImpl <em>Additive Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AdditiveExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAdditiveExpr()
         * @generated
         */
        EClass ADDITIVE_EXPR = eINSTANCE.getAdditiveExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDITIVE_EXPR__OPERAND = eINSTANCE.getAdditiveExpr_Operand();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ADDITIVE_EXPR__OPERATOR = eINSTANCE.getAdditiveExpr_Operator();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AdditiveExprChildImpl <em>Additive Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AdditiveExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAdditiveExprChild()
         * @generated
         */
        EClass ADDITIVE_EXPR_CHILD = eINSTANCE.getAdditiveExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.MultiplicativeExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getMultiplicativeExpr()
         * @generated
         */
        EClass MULTIPLICATIVE_EXPR = eINSTANCE.getMultiplicativeExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MULTIPLICATIVE_EXPR__OPERAND = eINSTANCE.getMultiplicativeExpr_Operand();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTIPLICATIVE_EXPR__OPERATOR = eINSTANCE.getMultiplicativeExpr_Operator();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.MultiplicativeExprChildImpl <em>Multiplicative Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.MultiplicativeExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getMultiplicativeExprChild()
         * @generated
         */
        EClass MULTIPLICATIVE_EXPR_CHILD = eINSTANCE.getMultiplicativeExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.UnionExprImpl <em>Union Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.UnionExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnionExpr()
         * @generated
         */
        EClass UNION_EXPR = eINSTANCE.getUnionExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNION_EXPR__OPERAND = eINSTANCE.getUnionExpr_Operand();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNION_EXPR__OPERATION = eINSTANCE.getUnionExpr_Operation();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.UnionExprChildImpl <em>Union Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.UnionExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnionExprChild()
         * @generated
         */
        EClass UNION_EXPR_CHILD = eINSTANCE.getUnionExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.IntersectExceptExprImpl <em>Intersect Except Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.IntersectExceptExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIntersectExceptExpr()
         * @generated
         */
        EClass INTERSECT_EXCEPT_EXPR = eINSTANCE.getIntersectExceptExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERSECT_EXCEPT_EXPR__OPERAND = eINSTANCE.getIntersectExceptExpr_Operand();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERSECT_EXCEPT_EXPR__OPERATOR = eINSTANCE.getIntersectExceptExpr_Operator();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.IntersectExceptExprChildImpl <em>Intersect Except Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.IntersectExceptExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIntersectExceptExprChild()
         * @generated
         */
        EClass INTERSECT_EXCEPT_EXPR_CHILD = eINSTANCE.getIntersectExceptExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.InstanceofExprImpl <em>Instanceof Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.InstanceofExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getInstanceofExpr()
         * @generated
         */
        EClass INSTANCEOF_EXPR = eINSTANCE.getInstanceofExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INSTANCEOF_EXPR__OPERAND = eINSTANCE.getInstanceofExpr_Operand();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INSTANCEOF_EXPR__TYPE = eINSTANCE.getInstanceofExpr_Type();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.InstanceofExprChildImpl <em>Instanceof Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.InstanceofExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getInstanceofExprChild()
         * @generated
         */
        EClass INSTANCEOF_EXPR_CHILD = eINSTANCE.getInstanceofExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.TreatExprImpl <em>Treat Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.TreatExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getTreatExpr()
         * @generated
         */
        EClass TREAT_EXPR = eINSTANCE.getTreatExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TREAT_EXPR__OPERAND = eINSTANCE.getTreatExpr_Operand();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TREAT_EXPR__TYPE = eINSTANCE.getTreatExpr_Type();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.TreatExprChildImpl <em>Treat Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.TreatExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getTreatExprChild()
         * @generated
         */
        EClass TREAT_EXPR_CHILD = eINSTANCE.getTreatExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.CastableExprImpl <em>Castable Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.CastableExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getCastableExpr()
         * @generated
         */
        EClass CASTABLE_EXPR = eINSTANCE.getCastableExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CASTABLE_EXPR__OPERAND = eINSTANCE.getCastableExpr_Operand();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CASTABLE_EXPR__TYPE = eINSTANCE.getCastableExpr_Type();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.CastableExprChildImpl <em>Castable Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.CastableExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getCastableExprChild()
         * @generated
         */
        EClass CASTABLE_EXPR_CHILD = eINSTANCE.getCastableExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.CastExprImpl <em>Cast Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.CastExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getCastExpr()
         * @generated
         */
        EClass CAST_EXPR = eINSTANCE.getCastExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAST_EXPR__OPERAND = eINSTANCE.getCastExpr_Operand();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAST_EXPR__TYPE = eINSTANCE.getCastExpr_Type();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.CastExprChildImpl <em>Cast Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.CastExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getCastExprChild()
         * @generated
         */
        EClass CAST_EXPR_CHILD = eINSTANCE.getCastExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.UnaryExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnaryExpr()
         * @generated
         */
        EClass UNARY_EXPR = eINSTANCE.getUnaryExpr();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNARY_EXPR__OPERAND = eINSTANCE.getUnaryExpr_Operand();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNARY_EXPR__OPERATOR = eINSTANCE.getUnaryExpr_Operator();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.UnaryExprChildImpl <em>Unary Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.UnaryExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnaryExprChild()
         * @generated
         */
        EClass UNARY_EXPR_CHILD = eINSTANCE.getUnaryExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ValueExprImpl <em>Value Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ValueExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getValueExpr()
         * @generated
         */
        EClass VALUE_EXPR = eINSTANCE.getValueExpr();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.PathExprImpl <em>Path Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.PathExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getPathExpr()
         * @generated
         */
        EClass PATH_EXPR = eINSTANCE.getPathExpr();

        /**
         * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PATH_EXPR__STEP = eINSTANCE.getPathExpr_Step();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.PathExprChildImpl <em>Path Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.PathExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getPathExprChild()
         * @generated
         */
        EClass PATH_EXPR_CHILD = eINSTANCE.getPathExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.RootStepExprImpl <em>Root Step Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.RootStepExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getRootStepExpr()
         * @generated
         */
        EClass ROOT_STEP_EXPR = eINSTANCE.getRootStepExpr();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ChildStepExprImpl <em>Child Step Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ChildStepExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getChildStepExpr()
         * @generated
         */
        EClass CHILD_STEP_EXPR = eINSTANCE.getChildStepExpr();

        /**
         * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHILD_STEP_EXPR__STEP = eINSTANCE.getChildStepExpr_Step();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.DescOrSelfStepExprImpl <em>Desc Or Self Step Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.DescOrSelfStepExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getDescOrSelfStepExpr()
         * @generated
         */
        EClass DESC_OR_SELF_STEP_EXPR = eINSTANCE.getDescOrSelfStepExpr();

        /**
         * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DESC_OR_SELF_STEP_EXPR__STEP = eINSTANCE.getDescOrSelfStepExpr_Step();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.SelfStepExprImpl <em>Self Step Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.SelfStepExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSelfStepExpr()
         * @generated
         */
        EClass SELF_STEP_EXPR = eINSTANCE.getSelfStepExpr();

        /**
         * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SELF_STEP_EXPR__STEP = eINSTANCE.getSelfStepExpr_Step();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.SelfStepExprChildImpl <em>Self Step Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.SelfStepExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSelfStepExprChild()
         * @generated
         */
        EClass SELF_STEP_EXPR_CHILD = eINSTANCE.getSelfStepExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.StepExprImpl <em>Step Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.StepExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getStepExpr()
         * @generated
         */
        EClass STEP_EXPR = eINSTANCE.getStepExpr();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.FilterExprImpl <em>Filter Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.FilterExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getFilterExpr()
         * @generated
         */
        EClass FILTER_EXPR = eINSTANCE.getFilterExpr();

        /**
         * The meta object literal for the '<em><b>Primary Expr</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FILTER_EXPR__PRIMARY_EXPR = eINSTANCE.getFilterExpr_PrimaryExpr();

        /**
         * The meta object literal for the '<em><b>Predicate</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FILTER_EXPR__PREDICATE = eINSTANCE.getFilterExpr_Predicate();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.FilterExprChildImpl <em>Filter Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.FilterExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getFilterExprChild()
         * @generated
         */
        EClass FILTER_EXPR_CHILD = eINSTANCE.getFilterExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AxisStepImpl <em>Axis Step</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AxisStepImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAxisStep()
         * @generated
         */
        EClass AXIS_STEP = eINSTANCE.getAxisStep();

        /**
         * The meta object literal for the '<em><b>Predicate</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AXIS_STEP__PREDICATE = eINSTANCE.getAxisStep_Predicate();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ForwardStepImpl <em>Forward Step</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ForwardStepImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getForwardStep()
         * @generated
         */
        EClass FORWARD_STEP = eINSTANCE.getForwardStep();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ReverseStepImpl <em>Reverse Step</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ReverseStepImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getReverseStep()
         * @generated
         */
        EClass REVERSE_STEP = eINSTANCE.getReverseStep();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.GeneralForwardStepImpl <em>General Forward Step</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.GeneralForwardStepImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getGeneralForwardStep()
         * @generated
         */
        EClass GENERAL_FORWARD_STEP = eINSTANCE.getGeneralForwardStep();

        /**
         * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERAL_FORWARD_STEP__AXIS = eINSTANCE.getGeneralForwardStep_Axis();

        /**
         * The meta object literal for the '<em><b>Node Test</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GENERAL_FORWARD_STEP__NODE_TEST = eINSTANCE.getGeneralForwardStep_NodeTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AbbrevForwardStepImpl <em>Abbrev Forward Step</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AbbrevForwardStepImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAbbrevForwardStep()
         * @generated
         */
        EClass ABBREV_FORWARD_STEP = eINSTANCE.getAbbrevForwardStep();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABBREV_FORWARD_STEP__KIND = eINSTANCE.getAbbrevForwardStep_Kind();

        /**
         * The meta object literal for the '<em><b>Node Test</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABBREV_FORWARD_STEP__NODE_TEST = eINSTANCE.getAbbrevForwardStep_NodeTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.GeneralReverseStepImpl <em>General Reverse Step</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.GeneralReverseStepImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getGeneralReverseStep()
         * @generated
         */
        EClass GENERAL_REVERSE_STEP = eINSTANCE.getGeneralReverseStep();

        /**
         * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERAL_REVERSE_STEP__AXIS = eINSTANCE.getGeneralReverseStep_Axis();

        /**
         * The meta object literal for the '<em><b>Node Test</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GENERAL_REVERSE_STEP__NODE_TEST = eINSTANCE.getGeneralReverseStep_NodeTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AbbrevReverseStepImpl <em>Abbrev Reverse Step</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AbbrevReverseStepImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAbbrevReverseStep()
         * @generated
         */
        EClass ABBREV_REVERSE_STEP = eINSTANCE.getAbbrevReverseStep();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABBREV_REVERSE_STEP__KIND = eINSTANCE.getAbbrevReverseStep_Kind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.NodeTestImpl <em>Node Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.NodeTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNodeTest()
         * @generated
         */
        EClass NODE_TEST = eINSTANCE.getNodeTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.NodeKindTestImpl <em>Node Kind Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.NodeKindTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNodeKindTest()
         * @generated
         */
        EClass NODE_KIND_TEST = eINSTANCE.getNodeKindTest();

        /**
         * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_KIND_TEST__TEST = eINSTANCE.getNodeKindTest_Test();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.NameTestImpl <em>Name Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.NameTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNameTest()
         * @generated
         */
        EClass NAME_TEST = eINSTANCE.getNameTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.QNameTestImpl <em>QName Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.QNameTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getQNameTest()
         * @generated
         */
        EClass QNAME_TEST = eINSTANCE.getQNameTest();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QNAME_TEST__NAME = eINSTANCE.getQNameTest_Name();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.WildcardImpl <em>Wildcard</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.WildcardImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getWildcard()
         * @generated
         */
        EClass WILDCARD = eINSTANCE.getWildcard();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AnyWildcardImpl <em>Any Wildcard</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AnyWildcardImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAnyWildcard()
         * @generated
         */
        EClass ANY_WILDCARD = eINSTANCE.getAnyWildcard();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.LocalNameWildcardImpl <em>Local Name Wildcard</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.LocalNameWildcardImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getLocalNameWildcard()
         * @generated
         */
        EClass LOCAL_NAME_WILDCARD = eINSTANCE.getLocalNameWildcard();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOCAL_NAME_WILDCARD__NAMESPACE = eINSTANCE.getLocalNameWildcard_Namespace();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.NamespaceWildcardImpl <em>Namespace Wildcard</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.NamespaceWildcardImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNamespaceWildcard()
         * @generated
         */
        EClass NAMESPACE_WILDCARD = eINSTANCE.getNamespaceWildcard();

        /**
         * The meta object literal for the '<em><b>Local Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMESPACE_WILDCARD__LOCAL_NAME = eINSTANCE.getNamespaceWildcard_LocalName();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.PredicateImpl <em>Predicate</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.PredicateImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getPredicate()
         * @generated
         */
        EClass PREDICATE = eINSTANCE.getPredicate();

        /**
         * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PREDICATE__EXPR = eINSTANCE.getPredicate_Expr();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.PrimaryExprImpl <em>Primary Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.PrimaryExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getPrimaryExpr()
         * @generated
         */
        EClass PRIMARY_EXPR = eINSTANCE.getPrimaryExpr();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.LiteralImpl <em>Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.LiteralImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getLiteral()
         * @generated
         */
        EClass LITERAL = eINSTANCE.getLiteral();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.VarRefImpl <em>Var Ref</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.VarRefImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getVarRef()
         * @generated
         */
        EClass VAR_REF = eINSTANCE.getVarRef();

        /**
         * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VAR_REF__VAR_NAME = eINSTANCE.getVarRef_VarName();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ParenthesizedExprImpl <em>Parenthesized Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ParenthesizedExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getParenthesizedExpr()
         * @generated
         */
        EClass PARENTHESIZED_EXPR = eINSTANCE.getParenthesizedExpr();

        /**
         * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARENTHESIZED_EXPR__EXPR = eINSTANCE.getParenthesizedExpr_Expr();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ParenthesizedExprChildImpl <em>Parenthesized Expr Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ParenthesizedExprChildImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getParenthesizedExprChild()
         * @generated
         */
        EClass PARENTHESIZED_EXPR_CHILD = eINSTANCE.getParenthesizedExprChild();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ContextItemExprImpl <em>Context Item Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ContextItemExprImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getContextItemExpr()
         * @generated
         */
        EClass CONTEXT_ITEM_EXPR = eINSTANCE.getContextItemExpr();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.FunctionCallImpl <em>Function Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.FunctionCallImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getFunctionCall()
         * @generated
         */
        EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_CALL__NAME = eINSTANCE.getFunctionCall_Name();

        /**
         * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION_CALL__ARG = eINSTANCE.getFunctionCall_Arg();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.NumericLiteralImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNumericLiteral()
         * @generated
         */
        EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.StringLiteralImpl <em>String Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.StringLiteralImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getStringLiteral()
         * @generated
         */
        EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.IntegerLiteralImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIntegerLiteral()
         * @generated
         */
        EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.DecimalLiteralImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getDecimalLiteral()
         * @generated
         */
        EClass DECIMAL_LITERAL = eINSTANCE.getDecimalLiteral();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_LITERAL__VALUE = eINSTANCE.getDecimalLiteral_Value();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.DoubleLiteralImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getDoubleLiteral()
         * @generated
         */
        EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOUBLE_LITERAL__VALUE = eINSTANCE.getDoubleLiteral_Value();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.CompImpl <em>Comp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.CompImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getComp()
         * @generated
         */
        EClass COMP = eINSTANCE.getComp();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.GeneralCompImpl <em>General Comp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.GeneralCompImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getGeneralComp()
         * @generated
         */
        EClass GENERAL_COMP = eINSTANCE.getGeneralComp();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERAL_COMP__OPERATOR = eINSTANCE.getGeneralComp_Operator();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ValueCompImpl <em>Value Comp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ValueCompImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getValueComp()
         * @generated
         */
        EClass VALUE_COMP = eINSTANCE.getValueComp();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_COMP__OPERATOR = eINSTANCE.getValueComp_Operator();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.NodeCompImpl <em>Node Comp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.NodeCompImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNodeComp()
         * @generated
         */
        EClass NODE_COMP = eINSTANCE.getNodeComp();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_COMP__OPERATOR = eINSTANCE.getNodeComp_Operator();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.SingleTypeImpl <em>Single Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.SingleTypeImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSingleType()
         * @generated
         */
        EClass SINGLE_TYPE = eINSTANCE.getSingleType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_TYPE__TYPE = eINSTANCE.getSingleType_Type();

        /**
         * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SINGLE_TYPE__OPTIONAL = eINSTANCE.getSingleType_Optional();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AtomicTypeImpl <em>Atomic Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AtomicTypeImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAtomicType()
         * @generated
         */
        EClass ATOMIC_TYPE = eINSTANCE.getAtomicType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATOMIC_TYPE__NAME = eINSTANCE.getAtomicType_Name();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.OptionalAtomicTypeImpl <em>Optional Atomic Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.OptionalAtomicTypeImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getOptionalAtomicType()
         * @generated
         */
        EClass OPTIONAL_ATOMIC_TYPE = eINSTANCE.getOptionalAtomicType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPTIONAL_ATOMIC_TYPE__NAME = eINSTANCE.getOptionalAtomicType_Name();

        /**
         * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPTIONAL_ATOMIC_TYPE__OPTIONAL = eINSTANCE.getOptionalAtomicType_Optional();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.SequenceTypeImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSequenceType()
         * @generated
         */
        EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.EmptySequenceTypeImpl <em>Empty Sequence Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.EmptySequenceTypeImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getEmptySequenceType()
         * @generated
         */
        EClass EMPTY_SEQUENCE_TYPE = eINSTANCE.getEmptySequenceType();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ItemSequenceTypeImpl <em>Item Sequence Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ItemSequenceTypeImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getItemSequenceType()
         * @generated
         */
        EClass ITEM_SEQUENCE_TYPE = eINSTANCE.getItemSequenceType();

        /**
         * The meta object literal for the '<em><b>Item Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM_SEQUENCE_TYPE__ITEM_TYPE = eINSTANCE.getItemSequenceType_ItemType();

        /**
         * The meta object literal for the '<em><b>Occurrence</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_SEQUENCE_TYPE__OCCURRENCE = eINSTANCE.getItemSequenceType_Occurrence();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ItemTypeImpl <em>Item Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ItemTypeImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getItemType()
         * @generated
         */
        EClass ITEM_TYPE = eINSTANCE.getItemType();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ItemKindTestImpl <em>Item Kind Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ItemKindTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getItemKindTest()
         * @generated
         */
        EClass ITEM_KIND_TEST = eINSTANCE.getItemKindTest();

        /**
         * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM_KIND_TEST__TEST = eINSTANCE.getItemKindTest_Test();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AnyItemTypeImpl <em>Any Item Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AnyItemTypeImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAnyItemType()
         * @generated
         */
        EClass ANY_ITEM_TYPE = eINSTANCE.getAnyItemType();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AtomicItemTypeImpl <em>Atomic Item Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AtomicItemTypeImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAtomicItemType()
         * @generated
         */
        EClass ATOMIC_ITEM_TYPE = eINSTANCE.getAtomicItemType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATOMIC_ITEM_TYPE__TYPE = eINSTANCE.getAtomicItemType_Type();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.KindTestImpl <em>Kind Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.KindTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getKindTest()
         * @generated
         */
        EClass KIND_TEST = eINSTANCE.getKindTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.DocumentTestImpl <em>Document Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.DocumentTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getDocumentTest()
         * @generated
         */
        EClass DOCUMENT_TEST = eINSTANCE.getDocumentTest();

        /**
         * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_TEST__TEST = eINSTANCE.getDocumentTest_Test();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.ElementTestImpl <em>Element Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.ElementTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getElementTest()
         * @generated
         */
        EClass ELEMENT_TEST = eINSTANCE.getElementTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.NameElementTestImpl <em>Name Element Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.NameElementTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNameElementTest()
         * @generated
         */
        EClass NAME_ELEMENT_TEST = eINSTANCE.getNameElementTest();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAME_ELEMENT_TEST__NAME = eINSTANCE.getNameElementTest_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAME_ELEMENT_TEST__TYPE = eINSTANCE.getNameElementTest_Type();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.WildcardElementTestImpl <em>Wildcard Element Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.WildcardElementTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getWildcardElementTest()
         * @generated
         */
        EClass WILDCARD_ELEMENT_TEST = eINSTANCE.getWildcardElementTest();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WILDCARD_ELEMENT_TEST__TYPE = eINSTANCE.getWildcardElementTest_Type();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AttributeTestImpl <em>Attribute Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AttributeTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAttributeTest()
         * @generated
         */
        EClass ATTRIBUTE_TEST = eINSTANCE.getAttributeTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.NameAttributeTestImpl <em>Name Attribute Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.NameAttributeTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNameAttributeTest()
         * @generated
         */
        EClass NAME_ATTRIBUTE_TEST = eINSTANCE.getNameAttributeTest();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAME_ATTRIBUTE_TEST__NAME = eINSTANCE.getNameAttributeTest_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAME_ATTRIBUTE_TEST__TYPE = eINSTANCE.getNameAttributeTest_Type();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.WildcardAttributeTestImpl <em>Wildcard Attribute Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.WildcardAttributeTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getWildcardAttributeTest()
         * @generated
         */
        EClass WILDCARD_ATTRIBUTE_TEST = eINSTANCE.getWildcardAttributeTest();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WILDCARD_ATTRIBUTE_TEST__TYPE = eINSTANCE.getWildcardAttributeTest_Type();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.SchemaElementTestImpl <em>Schema Element Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.SchemaElementTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSchemaElementTest()
         * @generated
         */
        EClass SCHEMA_ELEMENT_TEST = eINSTANCE.getSchemaElementTest();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_ELEMENT_TEST__NAME = eINSTANCE.getSchemaElementTest_Name();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.SchemaAttributeTestImpl <em>Schema Attribute Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.SchemaAttributeTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getSchemaAttributeTest()
         * @generated
         */
        EClass SCHEMA_ATTRIBUTE_TEST = eINSTANCE.getSchemaAttributeTest();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_ATTRIBUTE_TEST__NAME = eINSTANCE.getSchemaAttributeTest_Name();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.PITestImpl <em>PI Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.PITestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getPITest()
         * @generated
         */
        EClass PI_TEST = eINSTANCE.getPITest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.NCNamePITestImpl <em>NC Name PI Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.NCNamePITestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNCNamePITest()
         * @generated
         */
        EClass NC_NAME_PI_TEST = eINSTANCE.getNCNamePITest();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NC_NAME_PI_TEST__NAME = eINSTANCE.getNCNamePITest_Name();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.StringLiteralPITestImpl <em>String Literal PI Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.StringLiteralPITestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getStringLiteralPITest()
         * @generated
         */
        EClass STRING_LITERAL_PI_TEST = eINSTANCE.getStringLiteralPITest();

        /**
         * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRING_LITERAL_PI_TEST__LITERAL = eINSTANCE.getStringLiteralPITest_Literal();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.CommentTestImpl <em>Comment Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.CommentTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getCommentTest()
         * @generated
         */
        EClass COMMENT_TEST = eINSTANCE.getCommentTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.TextTestImpl <em>Text Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.TextTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getTextTest()
         * @generated
         */
        EClass TEXT_TEST = eINSTANCE.getTextTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.AnyKindTestImpl <em>Any Kind Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.AnyKindTestImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAnyKindTest()
         * @generated
         */
        EClass ANY_KIND_TEST = eINSTANCE.getAnyKindTest();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.impl.CommentImpl <em>Comment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.impl.CommentImpl
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getComment()
         * @generated
         */
        EClass COMMENT = eINSTANCE.getComment();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMENT__COMMENT = eINSTANCE.getComment_Comment();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.ForwardAxisKind <em>Forward Axis Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.ForwardAxisKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getForwardAxisKind()
         * @generated
         */
        EEnum FORWARD_AXIS_KIND = eINSTANCE.getForwardAxisKind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.AbbrevForwardStepKind <em>Abbrev Forward Step Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.AbbrevForwardStepKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAbbrevForwardStepKind()
         * @generated
         */
        EEnum ABBREV_FORWARD_STEP_KIND = eINSTANCE.getAbbrevForwardStepKind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.ReverseAxisKind <em>Reverse Axis Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.ReverseAxisKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getReverseAxisKind()
         * @generated
         */
        EEnum REVERSE_AXIS_KIND = eINSTANCE.getReverseAxisKind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.AbbrevReverseStepKind <em>Abbrev Reverse Step Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.AbbrevReverseStepKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAbbrevReverseStepKind()
         * @generated
         */
        EEnum ABBREV_REVERSE_STEP_KIND = eINSTANCE.getAbbrevReverseStepKind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.UnionOp <em>Union Op</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.UnionOp
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnionOp()
         * @generated
         */
        EEnum UNION_OP = eINSTANCE.getUnionOp();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.AdditiveOpKind <em>Additive Op Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.AdditiveOpKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getAdditiveOpKind()
         * @generated
         */
        EEnum ADDITIVE_OP_KIND = eINSTANCE.getAdditiveOpKind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.MultiplicativeOpKind <em>Multiplicative Op Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.MultiplicativeOpKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getMultiplicativeOpKind()
         * @generated
         */
        EEnum MULTIPLICATIVE_OP_KIND = eINSTANCE.getMultiplicativeOpKind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.QuantifierKind <em>Quantifier Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.QuantifierKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getQuantifierKind()
         * @generated
         */
        EEnum QUANTIFIER_KIND = eINSTANCE.getQuantifierKind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.IntersectExceptOpKind <em>Intersect Except Op Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.IntersectExceptOpKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getIntersectExceptOpKind()
         * @generated
         */
        EEnum INTERSECT_EXCEPT_OP_KIND = eINSTANCE.getIntersectExceptOpKind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.UnaryOp <em>Unary Op</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.UnaryOp
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getUnaryOp()
         * @generated
         */
        EEnum UNARY_OP = eINSTANCE.getUnaryOp();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.GeneralCompKind <em>General Comp Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.GeneralCompKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getGeneralCompKind()
         * @generated
         */
        EEnum GENERAL_COMP_KIND = eINSTANCE.getGeneralCompKind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.NodeCompKind <em>Node Comp Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.NodeCompKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getNodeCompKind()
         * @generated
         */
        EEnum NODE_COMP_KIND = eINSTANCE.getNodeCompKind();

        /**
         * The meta object literal for the '{@link org.emftext.language.xpath3.OccurrenceIndicatorKind <em>Occurrence Indicator Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.emftext.language.xpath3.OccurrenceIndicatorKind
         * @see org.emftext.language.xpath3.impl.XPath3PackageImpl#getOccurrenceIndicatorKind()
         * @generated
         */
        EEnum OCCURRENCE_INDICATOR_KIND = eINSTANCE.getOccurrenceIndicatorKind();

    }

} //XPath3Package
