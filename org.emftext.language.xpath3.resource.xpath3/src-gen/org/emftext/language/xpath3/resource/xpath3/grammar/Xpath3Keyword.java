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


/**
 * A class to represent a keyword in the grammar.
 */
public class Xpath3Keyword extends org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement {
	
	private final String value;
	
	public Xpath3Keyword(String value, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return "\"" + value + "\"";
	}
	
}
