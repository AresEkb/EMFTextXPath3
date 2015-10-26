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
package org.emftext.language.xpath3.resource.xpath3.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class Xpath3SyntaxElement {
	
	private Xpath3SyntaxElement[] children;
	private Xpath3SyntaxElement parent;
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality cardinality;
	
	public Xpath3SyntaxElement(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality cardinality, Xpath3SyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (Xpath3SyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(Xpath3SyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public Xpath3SyntaxElement getParent() {
		return parent;
	}
	
	/**
	 * Returns the rule of this syntax element. The rule is determined by the
	 * containment hierarchy in the CS model.
	 */
	public org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getRule() {
		if (this instanceof org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule) {
			return (org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule) this;
		}
		return parent.getRule();
	}
	
	public Xpath3SyntaxElement[] getChildren() {
		if (children == null) {
			return new Xpath3SyntaxElement[0];
		}
		return children;
	}
	
	public EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality getCardinality() {
		return cardinality;
	}
	
	public boolean hasContainment(EClass metaclass) {
		org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement[] children = getChildren();
		for (org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement child : children) {
			if (child.hasContainment(metaclass)) {
				return true;
			}
		}
		return false;
	}
	
}
