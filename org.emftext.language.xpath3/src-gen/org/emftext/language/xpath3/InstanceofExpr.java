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
 * A representation of the model object '<em><b>Instanceof Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.InstanceofExpr#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.InstanceofExpr#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.xpath3.XPath3Package#getInstanceofExpr()
 * @model
 * @generated
 */
public interface InstanceofExpr extends IntersectExceptExprChild {
    /**
     * Returns the value of the '<em><b>Operand</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operand</em>' containment reference.
     * @see #setOperand(InstanceofExprChild)
     * @see org.emftext.language.xpath3.XPath3Package#getInstanceofExpr_Operand()
     * @model containment="true" required="true"
     * @generated
     */
    InstanceofExprChild getOperand();

    /**
     * Sets the value of the '{@link org.emftext.language.xpath3.InstanceofExpr#getOperand <em>Operand</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operand</em>' containment reference.
     * @see #getOperand()
     * @generated
     */
    void setOperand(InstanceofExprChild value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(SequenceType)
     * @see org.emftext.language.xpath3.XPath3Package#getInstanceofExpr_Type()
     * @model containment="true"
     * @generated
     */
    SequenceType getType();

    /**
     * Sets the value of the '{@link org.emftext.language.xpath3.InstanceofExpr#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(SequenceType value);

} // InstanceofExpr
