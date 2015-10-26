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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.xpath3.RangeExpr;
import org.emftext.language.xpath3.RangeExprChild;
import org.emftext.language.xpath3.XPath3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.impl.RangeExprImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.impl.RangeExprImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeExprImpl extends ComparisonExprChildImpl implements RangeExpr {
    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected RangeExprChild from;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected RangeExprChild to;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RangeExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XPath3Package.Literals.RANGE_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangeExprChild getFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFrom(RangeExprChild newFrom, NotificationChain msgs) {
        RangeExprChild oldFrom = from;
        from = newFrom;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPath3Package.RANGE_EXPR__FROM, oldFrom, newFrom);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFrom(RangeExprChild newFrom) {
        if (newFrom != from) {
            NotificationChain msgs = null;
            if (from != null)
                msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPath3Package.RANGE_EXPR__FROM, null, msgs);
            if (newFrom != null)
                msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPath3Package.RANGE_EXPR__FROM, null, msgs);
            msgs = basicSetFrom(newFrom, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XPath3Package.RANGE_EXPR__FROM, newFrom, newFrom));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangeExprChild getTo() {
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTo(RangeExprChild newTo, NotificationChain msgs) {
        RangeExprChild oldTo = to;
        to = newTo;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPath3Package.RANGE_EXPR__TO, oldTo, newTo);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTo(RangeExprChild newTo) {
        if (newTo != to) {
            NotificationChain msgs = null;
            if (to != null)
                msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPath3Package.RANGE_EXPR__TO, null, msgs);
            if (newTo != null)
                msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPath3Package.RANGE_EXPR__TO, null, msgs);
            msgs = basicSetTo(newTo, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XPath3Package.RANGE_EXPR__TO, newTo, newTo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XPath3Package.RANGE_EXPR__FROM:
                return basicSetFrom(null, msgs);
            case XPath3Package.RANGE_EXPR__TO:
                return basicSetTo(null, msgs);
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
            case XPath3Package.RANGE_EXPR__FROM:
                return getFrom();
            case XPath3Package.RANGE_EXPR__TO:
                return getTo();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XPath3Package.RANGE_EXPR__FROM:
                setFrom((RangeExprChild)newValue);
                return;
            case XPath3Package.RANGE_EXPR__TO:
                setTo((RangeExprChild)newValue);
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
            case XPath3Package.RANGE_EXPR__FROM:
                setFrom((RangeExprChild)null);
                return;
            case XPath3Package.RANGE_EXPR__TO:
                setTo((RangeExprChild)null);
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
            case XPath3Package.RANGE_EXPR__FROM:
                return from != null;
            case XPath3Package.RANGE_EXPR__TO:
                return to != null;
        }
        return super.eIsSet(featureID);
    }

} //RangeExprImpl
