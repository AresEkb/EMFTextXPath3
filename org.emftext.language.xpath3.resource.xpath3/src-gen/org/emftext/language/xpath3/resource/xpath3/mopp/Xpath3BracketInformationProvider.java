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

/**
 * This class provides information about how brackets must be handled in the
 * editor (e.g., whether they must be closed automatically).
 */
public class Xpath3BracketInformationProvider {
	
	public Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3BracketPair> getBracketPairs() {
		Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3BracketPair> result = new ArrayList<org.emftext.language.xpath3.resource.xpath3.IXpath3BracketPair>();
		result.add(new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3BracketPair("(", ")", true, false));
		result.add(new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3BracketPair("[", "]", true, false));
		return result;
	}
	
}
