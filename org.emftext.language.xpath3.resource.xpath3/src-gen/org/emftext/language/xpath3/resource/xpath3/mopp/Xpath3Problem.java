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
import java.util.Collections;
import java.util.LinkedHashSet;

public class Xpath3Problem implements org.emftext.language.xpath3.resource.xpath3.IXpath3Problem {
	
	private String message;
	private org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemType type;
	private org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemSeverity severity;
	private Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3QuickFix> quickFixes;
	
	public Xpath3Problem(String message, org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemType type, org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemSeverity severity) {
		this(message, type, severity, Collections.<org.emftext.language.xpath3.resource.xpath3.IXpath3QuickFix>emptySet());
	}
	
	public Xpath3Problem(String message, org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemType type, org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemSeverity severity, org.emftext.language.xpath3.resource.xpath3.IXpath3QuickFix quickFix) {
		this(message, type, severity, Collections.singleton(quickFix));
	}
	
	public Xpath3Problem(String message, org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemType type, org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemSeverity severity, Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3QuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new LinkedHashSet<org.emftext.language.xpath3.resource.xpath3.IXpath3QuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemType getType() {
		return type;
	}
	
	public org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3QuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
