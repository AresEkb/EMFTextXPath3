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
package org.emftext.language.xpath3.resource.xpath3.ui;

import org.eclipse.core.resources.IResource;

public class Xpath3UIMetaInformation extends org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3MetaInformation {
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3HoverTextProvider getHoverTextProvider() {
		return new org.emftext.language.xpath3.resource.xpath3.ui.Xpath3HoverTextProvider();
	}
	
	public org.emftext.language.xpath3.resource.xpath3.ui.Xpath3ImageProvider getImageProvider() {
		return org.emftext.language.xpath3.resource.xpath3.ui.Xpath3ImageProvider.INSTANCE;
	}
	
	public org.emftext.language.xpath3.resource.xpath3.ui.Xpath3ColorManager createColorManager() {
		return new org.emftext.language.xpath3.resource.xpath3.ui.Xpath3ColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.emftext.language.xpath3.resource.xpath3.IXpath3TextResour
	 * ce, org.emftext.language.xpath3.resource.xpath3.ui.Xpath3ColorManager) instead.
	 */
	public org.emftext.language.xpath3.resource.xpath3.ui.Xpath3TokenScanner createTokenScanner(org.emftext.language.xpath3.resource.xpath3.ui.Xpath3ColorManager colorManager) {
		return (org.emftext.language.xpath3.resource.xpath3.ui.Xpath3TokenScanner) createTokenScanner(null, colorManager);
	}
	
	public org.emftext.language.xpath3.resource.xpath3.ui.IXpath3TokenScanner createTokenScanner(org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource resource, org.emftext.language.xpath3.resource.xpath3.ui.Xpath3ColorManager colorManager) {
		return new org.emftext.language.xpath3.resource.xpath3.ui.Xpath3TokenScanner(resource, colorManager);
	}
	
	public org.emftext.language.xpath3.resource.xpath3.ui.Xpath3CodeCompletionHelper createCodeCompletionHelper() {
		return new org.emftext.language.xpath3.resource.xpath3.ui.Xpath3CodeCompletionHelper();
	}
	
	@SuppressWarnings("rawtypes")
	public Object createResourceAdapter(Object adaptableObject, Class adapterType, IResource resource) {
		return new org.emftext.language.xpath3.resource.xpath3.ui.debug.Xpath3LineBreakpointAdapter();
	}
	
}
