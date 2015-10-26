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
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Xpath3ReferenceResolverSwitch implements org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private Map<Object, Object> options;
	
	protected org.emftext.language.xpath3.resource.xpath3.analysis.StringLiteralPITestLiteralReferenceResolver stringLiteralPITestLiteralReferenceResolver = new org.emftext.language.xpath3.resource.xpath3.analysis.StringLiteralPITestLiteralReferenceResolver();
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver<org.emftext.language.xpath3.StringLiteralPITest, org.emftext.language.xpath3.StringLiteral> getStringLiteralPITestLiteralReferenceResolver() {
		return getResolverChain(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStringLiteralPITest_Literal(), stringLiteralPITestLiteralReferenceResolver);
	}
	
	public void setOptions(Map<?, ?> options) {
		if (options != null) {
			this.options = new LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		stringLiteralPITestLiteralReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, EObject container, EReference reference, int position, org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolveResult<EObject> result) {
		if (container == null) {
			return;
		}
		if (org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStringLiteralPITest().isInstance(container)) {
			Xpath3FuzzyResolveResult<org.emftext.language.xpath3.StringLiteral> frr = new Xpath3FuzzyResolveResult<org.emftext.language.xpath3.StringLiteral>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("literal")) {
				stringLiteralPITestLiteralReferenceResolver.resolve(identifier, (org.emftext.language.xpath3.StringLiteralPITest) container, (EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver<? extends EObject, ? extends EObject> getResolver(EStructuralFeature reference) {
		if (reference == org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStringLiteralPITest_Literal()) {
			return getResolverChain(reference, stringLiteralPITestLiteralReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public <ContainerType extends EObject, ReferenceType extends EObject> org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver<ContainerType, ReferenceType> getResolverChain(EStructuralFeature reference, org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.emftext.language.xpath3.resource.xpath3.IXpath3Options.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof Map)) {
			// send this to the error log
			new org.emftext.language.xpath3.resource.xpath3.util.Xpath3RuntimeUtil().logWarning("Found value with invalid type for option " + org.emftext.language.xpath3.resource.xpath3.IXpath3Options.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		Map<?,?> resolverMap = (Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver) {
			org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver replacingResolver = (org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.emftext.language.xpath3.resource.xpath3.IXpath3DelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.emftext.language.xpath3.resource.xpath3.IXpath3DelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof Collection) {
			Collection replacingResolvers = (Collection) resolverValue;
			org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceCache) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver nextResolver = (org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolver) next;
					if (nextResolver instanceof org.emftext.language.xpath3.resource.xpath3.IXpath3DelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.emftext.language.xpath3.resource.xpath3.IXpath3DelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.emftext.language.xpath3.resource.xpath3.util.Xpath3RuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.xpath3.resource.xpath3.IXpath3Options.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.xpath3.resource.xpath3.IXpath3DelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.emftext.language.xpath3.resource.xpath3.util.Xpath3RuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.xpath3.resource.xpath3.IXpath3Options.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.xpath3.resource.xpath3.IXpath3DelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
