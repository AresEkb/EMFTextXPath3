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
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class Xpath3AbstractExpectedElement implements org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement {
	
	private EClass ruleMetaclass;
	
	private Set<org.emftext.language.xpath3.resource.xpath3.util.Xpath3Pair<org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[]>> followers = new LinkedHashSet<org.emftext.language.xpath3.resource.xpath3.util.Xpath3Pair<org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[]>>();
	
	public Xpath3AbstractExpectedElement(EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement follower, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[] path) {
		followers.add(new org.emftext.language.xpath3.resource.xpath3.util.Xpath3Pair<org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[]>(follower, path));
	}
	
	public Collection<org.emftext.language.xpath3.resource.xpath3.util.Xpath3Pair<org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
