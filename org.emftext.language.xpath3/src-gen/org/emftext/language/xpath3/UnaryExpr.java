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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.UnaryExpr#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.UnaryExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.xpath3.XPath3Package#getUnaryExpr()
 * @model
 * @generated
 */
public interface UnaryExpr extends CastExprChild {
    /**
     * Returns the value of the '<em><b>Operand</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operand</em>' containment reference.
     * @see #setOperand(UnaryExprChild)
     * @see org.emftext.language.xpath3.XPath3Package#getUnaryExpr_Operand()
     * @model containment="true" required="true"
     * @generated
     */
    UnaryExprChild getOperand();

    /**
     * Sets the value of the '{@link org.emftext.language.xpath3.UnaryExpr#getOperand <em>Operand</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operand</em>' containment reference.
     * @see #getOperand()
     * @generated
     */
    void setOperand(UnaryExprChild value);

    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute list.
     * The list contents are of type {@link org.emftext.language.xpath3.UnaryOp}.
     * The literals are from the enumeration {@link org.emftext.language.xpath3.UnaryOp}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute list.
     * @see org.emftext.language.xpath3.UnaryOp
     * @see org.emftext.language.xpath3.XPath3Package#getUnaryExpr_Operator()
     * @model unique="false"
     * @generated
     */
    EList<UnaryOp> getOperator();

} // UnaryExpr
