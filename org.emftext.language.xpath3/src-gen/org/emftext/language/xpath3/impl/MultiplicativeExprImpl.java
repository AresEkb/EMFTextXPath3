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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.xpath3.MultiplicativeExpr;
import org.emftext.language.xpath3.MultiplicativeExprChild;
import org.emftext.language.xpath3.MultiplicativeOpKind;
import org.emftext.language.xpath3.XPath3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicative Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.impl.MultiplicativeExprImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.impl.MultiplicativeExprImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicativeExprImpl extends AdditiveExprChildImpl implements MultiplicativeExpr {
    /**
     * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperand()
     * @generated
     * @ordered
     */
    protected EList<MultiplicativeExprChild> operand;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected EList<MultiplicativeOpKind> operator;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MultiplicativeExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XPath3Package.Literals.MULTIPLICATIVE_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MultiplicativeExprChild> getOperand() {
        if (operand == null) {
            operand = new EObjectContainmentEList<MultiplicativeExprChild>(MultiplicativeExprChild.class, this, XPath3Package.MULTIPLICATIVE_EXPR__OPERAND);
        }
        return operand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MultiplicativeOpKind> getOperator() {
        if (operator == null) {
            operator = new EDataTypeEList<MultiplicativeOpKind>(MultiplicativeOpKind.class, this, XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR);
        }
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XPath3Package.MULTIPLICATIVE_EXPR__OPERAND:
                return ((InternalEList<?>)getOperand()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XPath3Package.MULTIPLICATIVE_EXPR__OPERAND:
                return getOperand();
            case XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR:
                return getOperator();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XPath3Package.MULTIPLICATIVE_EXPR__OPERAND:
                getOperand().clear();
                getOperand().addAll((Collection<? extends MultiplicativeExprChild>)newValue);
                return;
            case XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR:
                getOperator().clear();
                getOperator().addAll((Collection<? extends MultiplicativeOpKind>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XPath3Package.MULTIPLICATIVE_EXPR__OPERAND:
                getOperand().clear();
                return;
            case XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR:
                getOperator().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XPath3Package.MULTIPLICATIVE_EXPR__OPERAND:
                return operand != null && !operand.isEmpty();
            case XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR:
                return operator != null && !operator.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (operator: ");
        result.append(operator);
        result.append(')');
        return result.toString();
    }

} //MultiplicativeExprImpl
