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


/**
 * <p>
 * A mapping from an identifier to something else. The &quot;something else&quot;
 * is defined by subclasses of this interface. Implementors of such subclasses are
 * used during the process of resolving references, where identifiers need to be
 * mapped to other objects.
 * </p>
 * <p>
 * This interface must not be implemented by clients.
 * </p>
 * 
 * @param <ReferenceType> the type of the reference this mapping points to.
 */
public interface IXpath3ReferenceMapping<ReferenceType> {
	
	/**
	 * Returns the identifier that is mapped.
	 */
	public String getIdentifier();
	
	/**
	 * A mapping can have a warning attached that contains additional information
	 * (e.g., when the mapping might be wrong under specific conditions). The warning
	 * is meant to be presented to the user together with the mapping result.
	 */
	public String getWarning();
}
