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

public interface IXpath3Problem {
	public String getMessage();
	public org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemSeverity getSeverity();
	public org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemType getType();
	public Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3QuickFix> getQuickFixes();
}
