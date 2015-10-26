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
package org.emftext.language.xpath3.resource.xpath3;

import java.util.Collection;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IXpath3ExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement getSyntaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement follower, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public Collection<org.emftext.language.xpath3.resource.xpath3.util.Xpath3Pair<org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[]>> getFollowers();
	
}
