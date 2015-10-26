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

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * A class to hold all resources (e.g., text constants) for the resource UI
 * plug-in.
 */
public class Xpath3UIResourceBundle {
	
	/**
	 * The title of the NewProjectWizard window.
	 */
	public static String NEW_PROJECT_WIZARD_WINDOW_TITLE = "New xpath3 Project";
	
	/**
	 * The name of the main page for the NewProjectWizard.
	 */
	public static String NEW_PROJECT_WIZARD_PAGE_NAME = "Create new xpath3 Project";
	
	/**
	 * The name of the ZIP file that is used as content for the new project (relative
	 * to the root of the resource UI plug-in).
	 */
	public static String NEW_PROJECT_ZIP_FILE_NAME = "newProject.zip";
	
	/**
	 * The description of the project creation page
	 */
	public static String NEW_PROJECT_WIZARD_PAGE_DESCRIPTION = "Enter a name and select a location where the new project shall be created.";
	
	/**
	 * The name of the project in the project creation page
	 */
	public static String NEW_PROJECT_WIZARD_PROJECT_NAME = "";
	
	/**
	 * The path of the icon to be used for the pages of the NewProjectWizard.
	 */
	public static String NEW_PROJECT_WIZARD_PAGE_ICON = "icons/new_project_wizban.gif";
	
	/**
	 * The default file name for the new file wizard.
	 */
	public static String NEW_FILE_WIZARD_FILE_NAME = "new_file.xpath3";
	
	/**
	 * The title for the NewFileWizard window.
	 */
	public static String NEW_FILE_WIZARD_WINDOW_TITLE = "New xpath3 File";
	
	/**
	 * The title for the NewFileWizard page.
	 */
	public static String NEW_FILE_WIZARD_PAGE_TITLE = "Create new xpath3 file";
	
	/**
	 * The description for the NewFileWizard.
	 */
	public static String NEW_FILE_WIZARD_DESCRIPTION = "This wizard creates a new file with *.xpath3 extension.";
	
	/**
	 * The description for the root preference page.
	 */
	public static String ROOT_PREFERENCE_PAGE_DESCRIPTION = "Xpath3 Text Editor Preferences";
	
	/**
	 * The text for the root preference page.
	 */
	public static String ROOT_PREFERENCE_PAGE_TEXT = "Go to <a href=\"http://www.emftext.org\">www.emftext.org</a> for more information.";
	
	/**
	 * The static initializer tries to load resources from properties files or
	 * resource bundle classes. If no properties files or resource bundle classes are
	 * available, the default values are kept.
	 */
	static {
		try {
			ResourceBundle bundle = ResourceBundle.getBundle(Xpath3UIResourceBundle.class.getName(), Locale.getDefault());
			if (bundle != null) {
				Set<String> keys = bundle.keySet();
				for (String key : keys) {
					String value = bundle.getString(key);
					try {
						Field field = Xpath3UIResourceBundle.class.getDeclaredField(key.toUpperCase());
						field.set(null, value);
					} catch (SecurityException e) {
						// Ignore
					} catch (NoSuchFieldException e) {
						// Ignore?
					} catch (IllegalArgumentException e) {
						// Ignore
					} catch (IllegalAccessException e) {
						// Ignore
					}
				}
			}
		} catch (MissingResourceException mre) {
			// Ignore
		}
	}
	
}
