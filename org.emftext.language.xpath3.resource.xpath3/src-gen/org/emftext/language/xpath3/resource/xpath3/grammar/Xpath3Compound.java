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


public class Xpath3Compound extends org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement {
	
	public Xpath3Compound(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice choice, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality cardinality) {
		super(cardinality, new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
