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
package org.emftext.language.xpath3.resource.xpath3.util;

import java.io.File;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * Class Xpath3TextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.emftext.language.xpath3.resource.xpath3.util.Xpath3ResourceUtil.
 */
public class Xpath3TextResourceUtil {
	
	/**
	 * Use
	 * org.emftext.language.xpath3.resource.xpath3.util.Xpath3ResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated
	public static org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Resource getResource(IFile file) {
		return new org.emftext.language.xpath3.resource.xpath3.util.Xpath3EclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.emftext.language.xpath3.resource.xpath3.util.Xpath3ResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated
	public static org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Resource getResource(File file, Map<?,?> options) {
		return org.emftext.language.xpath3.resource.xpath3.util.Xpath3ResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.emftext.language.xpath3.resource.xpath3.util.Xpath3ResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated
	public static org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Resource getResource(URI uri) {
		return org.emftext.language.xpath3.resource.xpath3.util.Xpath3ResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.emftext.language.xpath3.resource.xpath3.util.Xpath3ResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated
	public static org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Resource getResource(URI uri, Map<?,?> options) {
		return org.emftext.language.xpath3.resource.xpath3.util.Xpath3ResourceUtil.getResource(uri, options);
	}
	
}
