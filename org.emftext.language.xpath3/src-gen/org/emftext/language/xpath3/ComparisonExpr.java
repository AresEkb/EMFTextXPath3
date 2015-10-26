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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.ComparisonExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.ComparisonExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.ComparisonExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.xpath3.XPath3Package#getComparisonExpr()
 * @model
 * @generated
 */
public interface ComparisonExpr extends AndExprChild {
    /**
     * Returns the value of the '<em><b>Left</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Left</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left</em>' containment reference.
     * @see #setLeft(ComparisonExprChild)
     * @see org.emftext.language.xpath3.XPath3Package#getComparisonExpr_Left()
     * @model containment="true" required="true"
     * @generated
     */
    ComparisonExprChild getLeft();

    /**
     * Sets the value of the '{@link org.emftext.language.xpath3.ComparisonExpr#getLeft <em>Left</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left</em>' containment reference.
     * @see #getLeft()
     * @generated
     */
    void setLeft(ComparisonExprChild value);

    /**
     * Returns the value of the '<em><b>Operator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' containment reference.
     * @see #setOperator(Comp)
     * @see org.emftext.language.xpath3.XPath3Package#getComparisonExpr_Operator()
     * @model containment="true"
     * @generated
     */
    Comp getOperator();

    /**
     * Sets the value of the '{@link org.emftext.language.xpath3.ComparisonExpr#getOperator <em>Operator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' containment reference.
     * @see #getOperator()
     * @generated
     */
    void setOperator(Comp value);

    /**
     * Returns the value of the '<em><b>Right</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Right</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Right</em>' containment reference.
     * @see #setRight(ComparisonExprChild)
     * @see org.emftext.language.xpath3.XPath3Package#getComparisonExpr_Right()
     * @model containment="true"
     * @generated
     */
    ComparisonExprChild getRight();

    /**
     * Sets the value of the '{@link org.emftext.language.xpath3.ComparisonExpr#getRight <em>Right</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right</em>' containment reference.
     * @see #getRight()
     * @generated
     */
    void setRight(ComparisonExprChild value);

} // ComparisonExpr
