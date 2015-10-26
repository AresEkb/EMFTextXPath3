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

import java.util.List;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class Xpath3ProposalPostProcessor {
	
	public List<org.emftext.language.xpath3.resource.xpath3.ui.Xpath3CompletionProposal> process(List<org.emftext.language.xpath3.resource.xpath3.ui.Xpath3CompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
