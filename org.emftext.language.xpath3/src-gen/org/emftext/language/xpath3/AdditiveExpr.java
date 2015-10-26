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
 * A representation of the model object '<em><b>Additive Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.AdditiveExpr#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.AdditiveExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.xpath3.XPath3Package#getAdditiveExpr()
 * @model
 * @generated
 */
public interface AdditiveExpr extends RangeExprChild {
    /**
     * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
     * The list contents are of type {@link org.emftext.language.xpath3.AdditiveExprChild}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operand</em>' containment reference list.
     * @see org.emftext.language.xpath3.XPath3Package#getAdditiveExpr_Operand()
     * @model containment="true" required="true"
     * @generated
     */
    EList<AdditiveExprChild> getOperand();

    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute list.
     * The list contents are of type {@link org.emftext.language.xpath3.AdditiveOpKind}.
     * The literals are from the enumeration {@link org.emftext.language.xpath3.AdditiveOpKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute list.
     * @see org.emftext.language.xpath3.AdditiveOpKind
     * @see org.emftext.language.xpath3.XPath3Package#getAdditiveExpr_Operator()
     * @model unique="false"
     * @generated
     */
    EList<AdditiveOpKind> getOperator();

} // AdditiveExpr
