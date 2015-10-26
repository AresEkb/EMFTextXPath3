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
 * A representation of the model object '<em><b>Union Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.UnionExpr#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.UnionExpr#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.xpath3.XPath3Package#getUnionExpr()
 * @model
 * @generated
 */
public interface UnionExpr extends MultiplicativeExprChild {
    /**
     * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
     * The list contents are of type {@link org.emftext.language.xpath3.UnionExprChild}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operand</em>' containment reference list.
     * @see org.emftext.language.xpath3.XPath3Package#getUnionExpr_Operand()
     * @model containment="true" required="true"
     * @generated
     */
    EList<UnionExprChild> getOperand();

    /**
     * Returns the value of the '<em><b>Operation</b></em>' attribute list.
     * The list contents are of type {@link org.emftext.language.xpath3.UnionOp}.
     * The literals are from the enumeration {@link org.emftext.language.xpath3.UnionOp}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' attribute list.
     * @see org.emftext.language.xpath3.UnionOp
     * @see org.emftext.language.xpath3.XPath3Package#getUnionExpr_Operation()
     * @model unique="false"
     * @generated
     */
    EList<UnionOp> getOperation();

} // UnionExpr
