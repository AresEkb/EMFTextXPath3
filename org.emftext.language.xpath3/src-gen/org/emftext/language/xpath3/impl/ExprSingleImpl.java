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

import org.emftext.language.xpath3.ExprSingle;
import org.emftext.language.xpath3.XPath3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Single</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExprSingleImpl extends AnyExprImpl implements ExprSingle {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExprSingleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XPath3Package.Literals.EXPR_SINGLE;
    }

} //ExprSingleImpl
