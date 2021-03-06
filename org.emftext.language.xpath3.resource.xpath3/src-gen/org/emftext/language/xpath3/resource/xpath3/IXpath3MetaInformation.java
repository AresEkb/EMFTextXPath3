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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import org.eclipse.emf.ecore.EClass;

/**
 * This interface provides information about a generated EMFText text resource
 * plug-in.
 */
public interface IXpath3MetaInformation {
	
	public String getURI();
	
	/**
	 * <p>
	 * Returns the name of the concrete syntax. This name is used as file extension.
	 * </p>
	 * 
	 * @return the file extension
	 */
	public String getSyntaxName();
	
	/**
	 * <p>
	 * Returns the relative path to the .cs file within the plug-in.
	 * </p>
	 * 
	 * @return relative path to the .cs specification
	 */
	public String getPathToCSDefinition();
	
	/**
	 * <p>
	 * Returns a lexer capable to split the underlying text file into tokens.
	 * </p>
	 * 
	 * @return a new instance of the lexer class.
	 */
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TextScanner createLexer();
	
	/**
	 * <p>
	 * Returns an instance of the parser. This factory method is needed, because we
	 * can not create ANTLR parsers using the default constructor without arguments,
	 * because this constructor does expect the input stream or rather a token stream
	 * as arguments. Furthermore, the parser implementation can be exchanged by
	 * returning other parsers in this factory method.
	 * </p>
	 * 
	 * @param inputStream the stream to read from
	 * @param encoding the encoding of the input stream, pass null to use platform
	 * default encoding
	 * 
	 * @return a new instance of the parser class
	 */
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TextParser createParser(InputStream inputStream, String encoding);
	
	/**
	 * <p>
	 * Returns a new instance of the printer.
	 * </p>
	 * 
	 * @param outputStream the stream to print to
	 * @param resource that contains the elements that will be printed
	 * 
	 * @return a new instance of the printer class
	 */
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TextPrinter createPrinter(OutputStream outputStream, org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource resource);
	
	/**
	 * Returns all meta classes for which syntax was defined. This information is used
	 * both by the NewFileWizard and the code completion.
	 */
	public EClass[] getClassesWithSyntax();
	
	/**
	 * Returns an instance of the reference resolver switch class.
	 */
	public org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolverSwitch getReferenceResolverSwitch();
	
	/**
	 * Returns an instance of the token resolver factory.
	 */
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolverFactory getTokenResolverFactory();
	
	/**
	 * Returns a list of the names of all tokens defined in the syntax.
	 */
	public String[] getTokenNames();
	
	/**
	 * <p>
	 * Returns the default style that should be used to present tokens of the given
	 * type.
	 * </p>
	 * 
	 * @param tokenName the name of the token type
	 * 
	 * @return a style object or null if no default style is set
	 */
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TokenStyle getDefaultTokenStyle(String tokenName);
	
	/**
	 * Returns the default bracket pairs.
	 */
	public Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3BracketPair> getBracketPairs();
	
	/**
	 * Returns all classes for which folding must be enabled in the editor.
	 */
	public EClass[] getFoldableClasses();
	
}
