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

import java.util.Collection;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * A FuzzyResolveResult is an implementation of the IXpath3ReferenceResolveResult
 * interface that delegates all method calls to a given
 * IXpath3ReferenceResolveResult with ReferenceType EObject. It is used by
 * reference resolver switches to collect results from different reference
 * resolvers in a type safe manner.
 * </p>
 * 
 * @param <ReferenceType> the type of the reference that is resolved
 */
public class Xpath3FuzzyResolveResult<ReferenceType extends EObject> implements org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolveResult<ReferenceType> {
	
	private org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolveResult<EObject> delegate;
	
	public Xpath3FuzzyResolveResult(org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolveResult<EObject> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceMapping<ReferenceType>> getMappings() {
		return null;
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, (EObject) target);
	}
	
	public void addMapping(String identifier, URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, (EObject) target, warning);
	}
	
	public void addMapping(String identifier, URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
	
	public Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3QuickFix> getQuickFixes() {
		return delegate.getQuickFixes();
	}
	
	public void addQuickFix(org.emftext.language.xpath3.resource.xpath3.IXpath3QuickFix quickFix) {
		delegate.addQuickFix(quickFix);
	}
	
}
