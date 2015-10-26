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
 * A representation of the model object '<em><b>Item Kind Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.xpath3.ItemKindTest#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.xpath3.XPath3Package#getItemKindTest()
 * @model
 * @generated
 */
public interface ItemKindTest extends ItemType {
    /**
     * Returns the value of the '<em><b>Test</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test</em>' containment reference.
     * @see #setTest(KindTest)
     * @see org.emftext.language.xpath3.XPath3Package#getItemKindTest_Test()
     * @model containment="true" required="true"
     * @generated
     */
    KindTest getTest();

    /**
     * Sets the value of the '{@link org.emftext.language.xpath3.ItemKindTest#getTest <em>Test</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test</em>' containment reference.
     * @see #getTest()
     * @generated
     */
    void setTest(KindTest value);

} // ItemKindTest
