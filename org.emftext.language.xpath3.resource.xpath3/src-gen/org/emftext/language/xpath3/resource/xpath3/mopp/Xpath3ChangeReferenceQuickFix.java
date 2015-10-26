/**
 * Copyright (c) 2013, 2015 Denis Nikiforov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Denis Nikiforov - initial API and implementation
 */
package org.emftext.language.xpath3.resource.xpath3.mopp;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A quick fix that replaces the target of a reference with another EObject. This
 * class is used to implement default quick fixes for references that could not be
 * resolved, but can also be used by custom reference resolvers.
 */
public class Xpath3ChangeReferenceQuickFix extends org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3QuickFix {
	
	private EObject container;
	private EReference reference;
	private EObject oldTarget;
	private EObject newTarget;
	
	public Xpath3ChangeReferenceQuickFix(String displayString, String imageKey, EObject container, EReference reference, EObject oldTarget, EObject newTarget) {
		super(displayString, imageKey, Arrays.asList(container, reference, oldTarget));
		this.container = container;
		this.reference = reference;
		this.oldTarget = oldTarget;
		this.newTarget = newTarget;
	}
	
	@Override
	public void applyChanges() {
		EcoreUtil.replace(container, reference, oldTarget, newTarget);
	}
	
}
