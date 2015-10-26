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


public class Xpath3TokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TokenStyle getDefaultTokenStyle(String tokenName) {
		if ("$".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0xDA, 0x00, 0x00}, null, false, false, false, false);
		}
		if ("INTEGER_LITERAL".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x25, 0x18, 0xB5}, null, false, false, false, false);
		}
		if ("DECIMAL_LITERAL".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x25, 0x18, 0xB5}, null, false, false, false, false);
		}
		if ("DOUBLE_LITERAL".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x25, 0x18, 0xB5}, null, false, false, false, false);
		}
		if ("STRING_LITERAL".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x25, 0x18, 0xB5}, null, false, false, false, false);
		}
		if ("NCNAME".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x00, 0x80, 0x2A}, null, false, false, false, false);
		}
		if ("for".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("return".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("some".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("every".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("satisfies".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("in".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("if".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("then".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("else".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("or".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("and".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("to".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("eq".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ne".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("lt".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("le".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("gt".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ge".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("is".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("div".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("idiv".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("mod".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("union".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("intersect".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("except".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("instance".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("of".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("treat".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("as".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("castable".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("cast".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("child".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("descendant".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("attribute".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("self".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("descendant-or-self".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("following-sibling".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("following".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("namespace".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("parent".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ancestor".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("preceding-sibling".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("preceding".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ancestor-or-self".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("empty-sequence".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("item".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("node".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("document-node".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("text".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("comment".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("processing-instruction".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("schema-attribute".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("element".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("schema-element".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
