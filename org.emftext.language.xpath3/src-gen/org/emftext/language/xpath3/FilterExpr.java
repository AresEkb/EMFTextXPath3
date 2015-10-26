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
 * A representation of the model object '<em><b>Filter Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.FilterExpr#getPrimaryExpr <em>Primary Expr</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.FilterExpr#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.xpath3.XPath3Package#getFilterExpr()
 * @model
 * @generated
 */
public interface FilterExpr extends StepExpr {
    /**
     * Returns the value of the '<em><b>Primary Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Primary Expr</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Primary Expr</em>' containment reference.
     * @see #setPrimaryExpr(FilterExprChild)
     * @see org.emftext.language.xpath3.XPath3Package#getFilterExpr_PrimaryExpr()
     * @model containment="true" required="true"
     * @generated
     */
    FilterExprChild getPrimaryExpr();

    /**
     * Sets the value of the '{@link org.emftext.language.xpath3.FilterExpr#getPrimaryExpr <em>Primary Expr</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Primary Expr</em>' containment reference.
     * @see #getPrimaryExpr()
     * @generated
     */
    void setPrimaryExpr(FilterExprChild value);

    /**
     * Returns the value of the '<em><b>Predicate</b></em>' containment reference list.
     * The list contents are of type {@link org.emftext.language.xpath3.Predicate}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Predicate</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Predicate</em>' containment reference list.
     * @see org.emftext.language.xpath3.XPath3Package#getFilterExpr_Predicate()
     * @model containment="true"
     * @generated
     */
    EList<Predicate> getPredicate();

} // FilterExpr
