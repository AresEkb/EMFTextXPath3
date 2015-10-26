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

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

public class Xpath3ParseResult implements org.emftext.language.xpath3.resource.xpath3.IXpath3ParseResult {
	
	private EObject root;
	
	private org.emftext.language.xpath3.resource.xpath3.IXpath3LocationMap locationMap;
	
	private Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3Command<org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource>> commands = new ArrayList<org.emftext.language.xpath3.resource.xpath3.IXpath3Command<org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource>>();
	
	public Xpath3ParseResult() {
		super();
	}
	
	public EObject getRoot() {
		return root;
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3LocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(org.emftext.language.xpath3.resource.xpath3.IXpath3LocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3Command<org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource>> getPostParseCommands() {
		return commands;
	}
	
}
