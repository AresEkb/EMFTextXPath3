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
 * A representation of the model object '<em><b>Path Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.PathExpr#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.xpath3.XPath3Package#getPathExpr()
 * @model
 * @generated
 */
public interface PathExpr extends ValueExpr {
    /**
     * Returns the value of the '<em><b>Step</b></em>' containment reference list.
     * The list contents are of type {@link org.emftext.language.xpath3.PathExprChild}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Step</em>' containment reference list.
     * @see org.emftext.language.xpath3.XPath3Package#getPathExpr_Step()
     * @model containment="true" required="true"
     * @generated
     */
    EList<PathExprChild> getStep();

} // PathExpr
