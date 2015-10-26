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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource.Factory;

public class Xpath3MetaInformation implements org.emftext.language.xpath3.resource.xpath3.IXpath3MetaInformation {
	
	public String getSyntaxName() {
		return "xpath3";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/xpath3";
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TextScanner createLexer() {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3AntlrScanner(new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Lexer());
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TextParser createParser(InputStream inputStream, String encoding) {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Parser().createInstance(inputStream, encoding);
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TextPrinter createPrinter(OutputStream outputStream, org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource resource) {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Printer2(outputStream, resource);
	}
	
	public EClass[] getClassesWithSyntax() {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3SyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public EClass[] getStartSymbols() {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3SyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3ReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ReferenceResolverSwitch();
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolverFactory getTokenResolverFactory() {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.emftext.language.xpath3/metamodel/xpath3.cs";
	}
	
	public String[] getTokenNames() {
		return org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Parser.tokenNames;
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3BracketPair> getBracketPairs() {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3BracketInformationProvider().getBracketPairs();
	}
	
	public EClass[] getFoldableClasses() {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3FoldingInformationProvider().getFoldableClasses();
	}
	
	public Factory createResourceFactory() {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ResourceFactory();
	}
	
	public org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3NewFileContentProvider getNewFileContentProvider() {
		return new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3NewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ResourceFactoryDelegator());
		}
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.emftext.language.xpath3.resource.xpath3.ui.launchConfigurationType";
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3NameProvider createNameProvider() {
		return new org.emftext.language.xpath3.resource.xpath3.analysis.Xpath3DefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3AntlrTokenHelper tokenHelper = new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3AntlrTokenHelper();
		List<String> highlightableTokens = new ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
