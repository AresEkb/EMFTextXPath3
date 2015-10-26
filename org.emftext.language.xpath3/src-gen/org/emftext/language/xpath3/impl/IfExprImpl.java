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

import org.emftext.language.xpath3.AnyExpr;
import org.emftext.language.xpath3.ExprSingle;
import org.emftext.language.xpath3.IfExpr;
import org.emftext.language.xpath3.XPath3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.impl.IfExprImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.impl.IfExprImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.emftext.language.xpath3.impl.IfExprImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfExprImpl extends ExprSingleImpl implements IfExpr {
    /**
     * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTest()
     * @generated
     * @ordered
     */
    protected AnyExpr test;

    /**
     * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThen()
     * @generated
     * @ordered
     */
    protected ExprSingle then;

    /**
     * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElse()
     * @generated
     * @ordered
     */
    protected ExprSingle else_;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XPath3Package.Literals.IF_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyExpr getTest() {
        return test;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTest(AnyExpr newTest, NotificationChain msgs) {
        AnyExpr oldTest = test;
        test = newTest;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPath3Package.IF_EXPR__TEST, oldTest, newTest);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTest(AnyExpr newTest) {
        if (newTest != test) {
            NotificationChain msgs = null;
            if (test != null)
                msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPath3Package.IF_EXPR__TEST, null, msgs);
            if (newTest != null)
                msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPath3Package.IF_EXPR__TEST, null, msgs);
            msgs = basicSetTest(newTest, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XPath3Package.IF_EXPR__TEST, newTest, newTest));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExprSingle getThen() {
        return then;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThen(ExprSingle newThen, NotificationChain msgs) {
        ExprSingle oldThen = then;
        then = newThen;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPath3Package.IF_EXPR__THEN, oldThen, newThen);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThen(ExprSingle newThen) {
        if (newThen != then) {
            NotificationChain msgs = null;
            if (then != null)
                msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPath3Package.IF_EXPR__THEN, null, msgs);
            if (newThen != null)
                msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPath3Package.IF_EXPR__THEN, null, msgs);
            msgs = basicSetThen(newThen, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XPath3Package.IF_EXPR__THEN, newThen, newThen));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExprSingle getElse() {
        return else_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElse(ExprSingle newElse, NotificationChain msgs) {
        ExprSingle oldElse = else_;
        else_ = newElse;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPath3Package.IF_EXPR__ELSE, oldElse, newElse);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElse(ExprSingle newElse) {
        if (newElse != else_) {
            NotificationChain msgs = null;
            if (else_ != null)
                msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPath3Package.IF_EXPR__ELSE, null, msgs);
            if (newElse != null)
                msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPath3Package.IF_EXPR__ELSE, null, msgs);
            msgs = basicSetElse(newElse, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XPath3Package.IF_EXPR__ELSE, newElse, newElse));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XPath3Package.IF_EXPR__TEST:
                return basicSetTest(null, msgs);
            case XPath3Package.IF_EXPR__THEN:
                return basicSetThen(null, msgs);
            case XPath3Package.IF_EXPR__ELSE:
                return basicSetElse(null, msgs);
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
            case XPath3Package.IF_EXPR__TEST:
                return getTest();
            case XPath3Package.IF_EXPR__THEN:
                return getThen();
            case XPath3Package.IF_EXPR__ELSE:
                return getElse();
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
            case XPath3Package.IF_EXPR__TEST:
                setTest((AnyExpr)newValue);
                return;
            case XPath3Package.IF_EXPR__THEN:
                setThen((ExprSingle)newValue);
                return;
            case XPath3Package.IF_EXPR__ELSE:
                setElse((ExprSingle)newValue);
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
            case XPath3Package.IF_EXPR__TEST:
                setTest((AnyExpr)null);
                return;
            case XPath3Package.IF_EXPR__THEN:
                setThen((ExprSingle)null);
                return;
            case XPath3Package.IF_EXPR__ELSE:
                setElse((ExprSingle)null);
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
            case XPath3Package.IF_EXPR__TEST:
                return test != null;
            case XPath3Package.IF_EXPR__THEN:
                return then != null;
            case XPath3Package.IF_EXPR__ELSE:
                return else_ != null;
        }
        return super.eIsSet(featureID);
    }

} //IfExprImpl
