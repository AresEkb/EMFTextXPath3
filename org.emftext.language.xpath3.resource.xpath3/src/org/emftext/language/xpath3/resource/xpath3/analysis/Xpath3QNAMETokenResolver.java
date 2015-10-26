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
package org.emftext.language.xpath3.resource.xpath3.analysis;

import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Xpath3QNAMETokenResolver implements org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver {
	
	private org.emftext.language.xpath3.resource.xpath3.analysis.Xpath3DefaultTokenResolver defaultTokenResolver = new org.emftext.language.xpath3.resource.xpath3.analysis.Xpath3DefaultTokenResolver(true);
	
	public String deResolve(Object value, EStructuralFeature feature, EObject container) {
		if (value instanceof QName) {
			QName name = (QName)value;
			String prefix = name.getPrefix();
			return prefix.isEmpty() ? name.getLocalPart() : prefix + ":" + name.getLocalPart();
		}
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, EStructuralFeature feature, org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result) {
		String[] parts = lexem.split(":");
		switch (parts.length) {
		case 1:
			result.setResolvedToken(new QName(parts[0]));
			break;
		case 2:
			result.setResolvedToken(new QName(null, parts[1], parts[0]));
			break;
		default:
			// By default token resolving is delegated to the DefaultTokenResolver.
			defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
			break;
		}
	}
	
	public void setOptions(Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
