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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <p>
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * </p>
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class Xpath3ContextDependentURIFragmentFactory<ContainerType extends EObject, ReferenceType extends EObject>  implements org.emftext.language.xpath3.resource.xpath3.IXpath3ContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public Xpath3ContextDependentURIFragmentFactory(org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3ContextDependentURIFragment<?> create(String identifier, ContainerType container, EReference reference, int positionInReference, EObject proxy) {
		
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
