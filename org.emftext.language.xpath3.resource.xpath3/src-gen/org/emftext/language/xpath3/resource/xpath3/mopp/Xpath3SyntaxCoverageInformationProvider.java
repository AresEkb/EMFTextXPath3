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

import org.eclipse.emf.ecore.EClass;

public class Xpath3SyntaxCoverageInformationProvider {
	
	public EClass[] getClassesWithSyntax() {
		return new EClass[] {
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIterator(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAndExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getRangeExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralComp(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getValueComp(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeComp(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAdditiveExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnionExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntersectExceptExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getInstanceofExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getTreatExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastableExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnaryExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFunctionCall(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getChildStepExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDescOrSelfStepExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getRootStepExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSelfStepExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevReverseStep(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeKindTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQNameTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAnyWildcard(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getLocalNameWildcard(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNamespaceWildcard(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPredicate(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getVarRef(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getParenthesizedExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getContextItemExpr(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSingleType(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getEmptySequenceType(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getItemSequenceType(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getItemKindTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAnyItemType(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAtomicItemType(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAtomicType(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOptionalAtomicType(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAnyKindTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDocumentTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getTextTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCommentTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPITest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNCNamePITest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStringLiteralPITest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAttributeTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getWildcardAttributeTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameAttributeTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSchemaAttributeTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getElementTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getWildcardElementTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameElementTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSchemaElementTest(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntegerLiteral(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDecimalLiteral(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDoubleLiteral(),
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStringLiteral(),
		};
	}
	
	public EClass[] getStartSymbols() {
		return new EClass[] {
			org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExpr(),
		};
	}
	
}
