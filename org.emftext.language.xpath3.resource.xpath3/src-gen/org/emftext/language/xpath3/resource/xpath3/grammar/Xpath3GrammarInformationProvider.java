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
package org.emftext.language.xpath3.resource.xpath3.grammar;

import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

public class Xpath3GrammarInformationProvider {
	
	public final static EStructuralFeature ANONYMOUS_FEATURE = EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static Xpath3GrammarInformationProvider INSTANCE = new Xpath3GrammarInformationProvider();
	
	private Set<String> keywords;
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_0_0_0_0 = INSTANCE.getXPATH3_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.EXPR__EXPR), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_0_0_0_1_0_0_0 = INSTANCE.getXPATH3_0_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_0_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(",", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_0_0_0_1_0_0_1 = INSTANCE.getXPATH3_0_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_0_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.EXPR__EXPR), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_0_0_0_1_0_0 = INSTANCE.getXPATH3_0_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_0_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_0_0_0_1_0_0_0, XPATH3_0_0_0_1_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_0_0_0_1_0 = INSTANCE.getXPATH3_0_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_0_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_0_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_0_0_0_1 = INSTANCE.getXPATH3_0_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_0_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_0_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_0_0_0 = INSTANCE.getXPATH3_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_0_0_0_0, XPATH3_0_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_0_0 = INSTANCE.getXPATH3_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_0_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Expr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_0 = INSTANCE.getXPATH3_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExpr(), XPATH3_0_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_1_0_0_0 = INSTANCE.getXPATH3_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("for", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_1_0_0_1 = INSTANCE.getXPATH3_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_1_0_0_2 = INSTANCE.getXPATH3_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FOR_EXPR__ITERATOR), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIterator(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_1_0_0_3_0_0_0 = INSTANCE.getXPATH3_1_0_0_3_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_1_0_0_3_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(",", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_1_0_0_3_0_0_1 = INSTANCE.getXPATH3_1_0_0_3_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_1_0_0_3_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_1_0_0_3_0_0_2 = INSTANCE.getXPATH3_1_0_0_3_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_1_0_0_3_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FOR_EXPR__ITERATOR), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIterator(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_1_0_0_3_0_0 = INSTANCE.getXPATH3_1_0_0_3_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_1_0_0_3_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_1_0_0_3_0_0_0, XPATH3_1_0_0_3_0_0_1, XPATH3_1_0_0_3_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_1_0_0_3_0 = INSTANCE.getXPATH3_1_0_0_3_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_1_0_0_3_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_1_0_0_3_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_1_0_0_3 = INSTANCE.getXPATH3_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_1_0_0_3_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_1_0_0_4 = INSTANCE.getXPATH3_1_0_0_4();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_1_0_0_4() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_1_0_0_5 = INSTANCE.getXPATH3_1_0_0_5();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_1_0_0_5() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("return", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_1_0_0_6 = INSTANCE.getXPATH3_1_0_0_6();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_1_0_0_6() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_1_0_0_7 = INSTANCE.getXPATH3_1_0_0_7();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_1_0_0_7() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FOR_EXPR__RETURN), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExprSingle(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_1_0_0 = INSTANCE.getXPATH3_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_1_0_0_0, XPATH3_1_0_0_1, XPATH3_1_0_0_2, XPATH3_1_0_0_3, XPATH3_1_0_0_4, XPATH3_1_0_0_5, XPATH3_1_0_0_6, XPATH3_1_0_0_7);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_1_0 = INSTANCE.getXPATH3_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_1_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class ForExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_1 = INSTANCE.getXPATH3_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), XPATH3_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_2_0_0_0 = INSTANCE.getXPATH3_2_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_2_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__QUANTIFIER), new String[] {"some", "some", "every", "every", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_2_0_0_1 = INSTANCE.getXPATH3_2_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_2_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_2_0_0_2 = INSTANCE.getXPATH3_2_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_2_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__ITERATOR), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIterator(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_2_0_0_3_0_0_0 = INSTANCE.getXPATH3_2_0_0_3_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_2_0_0_3_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(",", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_2_0_0_3_0_0_1 = INSTANCE.getXPATH3_2_0_0_3_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_2_0_0_3_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_2_0_0_3_0_0_2 = INSTANCE.getXPATH3_2_0_0_3_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_2_0_0_3_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__ITERATOR), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIterator(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_2_0_0_3_0_0 = INSTANCE.getXPATH3_2_0_0_3_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_2_0_0_3_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_2_0_0_3_0_0_0, XPATH3_2_0_0_3_0_0_1, XPATH3_2_0_0_3_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_2_0_0_3_0 = INSTANCE.getXPATH3_2_0_0_3_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_2_0_0_3_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_2_0_0_3_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_2_0_0_3 = INSTANCE.getXPATH3_2_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_2_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_2_0_0_3_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_2_0_0_4 = INSTANCE.getXPATH3_2_0_0_4();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_2_0_0_4() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("satisfies", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_2_0_0_5 = INSTANCE.getXPATH3_2_0_0_5();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_2_0_0_5() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_2_0_0_6 = INSTANCE.getXPATH3_2_0_0_6();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_2_0_0_6() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__SATISFIES), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_2_0_0 = INSTANCE.getXPATH3_2_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_2_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_2_0_0_0, XPATH3_2_0_0_1, XPATH3_2_0_0_2, XPATH3_2_0_0_3, XPATH3_2_0_0_4, XPATH3_2_0_0_5, XPATH3_2_0_0_6);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_2_0 = INSTANCE.getXPATH3_2_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_2_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_2_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * QuantifiedExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_2 = INSTANCE.getXPATH3_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), XPATH3_2_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_3_0_0_0 = INSTANCE.getXPATH3_3_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_3_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("$", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_3_0_0_1_0_0_0 = INSTANCE.getXPATH3_3_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_3_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIterator().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_3_0_0_1_0_0 = INSTANCE.getXPATH3_3_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_3_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_3_0_0_1_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_3_0_0_1_0_1_0 = INSTANCE.getXPATH3_3_0_0_1_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_3_0_0_1_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIterator().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_3_0_0_1_0_1 = INSTANCE.getXPATH3_3_0_0_1_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_3_0_0_1_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_3_0_0_1_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_3_0_0_1_0 = INSTANCE.getXPATH3_3_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_3_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_3_0_0_1_0_0, XPATH3_3_0_0_1_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_3_0_0_1 = INSTANCE.getXPATH3_3_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_3_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_3_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_3_0_0_2 = INSTANCE.getXPATH3_3_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_3_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_3_0_0_3 = INSTANCE.getXPATH3_3_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_3_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("in", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_3_0_0_4 = INSTANCE.getXPATH3_3_0_0_4();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_3_0_0_4() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_3_0_0_5 = INSTANCE.getXPATH3_3_0_0_5();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_3_0_0_5() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIterator().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__LIST), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_3_0_0 = INSTANCE.getXPATH3_3_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_3_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_3_0_0_0, XPATH3_3_0_0_1, XPATH3_3_0_0_2, XPATH3_3_0_0_3, XPATH3_3_0_0_4, XPATH3_3_0_0_5);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_3_0 = INSTANCE.getXPATH3_3_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_3_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_3_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Iterator
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_3 = INSTANCE.getXPATH3_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIterator(), XPATH3_3_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_4_0_0_0 = INSTANCE.getXPATH3_4_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_4_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("if", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_4_0_0_1 = INSTANCE.getXPATH3_4_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_4_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_4_0_0_2 = INSTANCE.getXPATH3_4_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_4_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_4_0_0_3 = INSTANCE.getXPATH3_4_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_4_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__TEST), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_4_0_0_4 = INSTANCE.getXPATH3_4_0_0_4();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_4_0_0_4() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_4_0_0_5 = INSTANCE.getXPATH3_4_0_0_5();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_4_0_0_5() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_4_0_0_6 = INSTANCE.getXPATH3_4_0_0_6();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_4_0_0_6() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("then", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_4_0_0_7 = INSTANCE.getXPATH3_4_0_0_7();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_4_0_0_7() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_4_0_0_8 = INSTANCE.getXPATH3_4_0_0_8();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_4_0_0_8() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__THEN), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_4_0_0_9 = INSTANCE.getXPATH3_4_0_0_9();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_4_0_0_9() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_4_0_0_10 = INSTANCE.getXPATH3_4_0_0_10();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_4_0_0_10() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("else", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_4_0_0_11 = INSTANCE.getXPATH3_4_0_0_11();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_4_0_0_11() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_4_0_0_12 = INSTANCE.getXPATH3_4_0_0_12();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_4_0_0_12() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__ELSE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_4_0_0 = INSTANCE.getXPATH3_4_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_4_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_4_0_0_0, XPATH3_4_0_0_1, XPATH3_4_0_0_2, XPATH3_4_0_0_3, XPATH3_4_0_0_4, XPATH3_4_0_0_5, XPATH3_4_0_0_6, XPATH3_4_0_0_7, XPATH3_4_0_0_8, XPATH3_4_0_0_9, XPATH3_4_0_0_10, XPATH3_4_0_0_11, XPATH3_4_0_0_12);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_4_0 = INSTANCE.getXPATH3_4_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_4_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_4_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class IfExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_4 = INSTANCE.getXPATH3_4();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_4() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), XPATH3_4_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_5_0_0_0 = INSTANCE.getXPATH3_5_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_5_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OR_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAndExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_5_0_0_1_0_0_0 = INSTANCE.getXPATH3_5_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_5_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_5_0_0_1_0_0_1 = INSTANCE.getXPATH3_5_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_5_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("or", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_5_0_0_1_0_0_2 = INSTANCE.getXPATH3_5_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_5_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_5_0_0_1_0_0_3 = INSTANCE.getXPATH3_5_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_5_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OR_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAndExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_5_0_0_1_0_0 = INSTANCE.getXPATH3_5_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_5_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_5_0_0_1_0_0_0, XPATH3_5_0_0_1_0_0_1, XPATH3_5_0_0_1_0_0_2, XPATH3_5_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_5_0_0_1_0 = INSTANCE.getXPATH3_5_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_5_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_5_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_5_0_0_1 = INSTANCE.getXPATH3_5_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_5_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_5_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_5_0_0 = INSTANCE.getXPATH3_5_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_5_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_5_0_0_0, XPATH3_5_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_5_0 = INSTANCE.getXPATH3_5_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_5_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_5_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class OrExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_5 = INSTANCE.getXPATH3_5();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_5() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), XPATH3_5_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_6_0_0_0 = INSTANCE.getXPATH3_6_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_6_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAndExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.AND_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_6_0_0_1_0_0_0 = INSTANCE.getXPATH3_6_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_6_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_6_0_0_1_0_0_1 = INSTANCE.getXPATH3_6_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_6_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("and", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_6_0_0_1_0_0_2 = INSTANCE.getXPATH3_6_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_6_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_6_0_0_1_0_0_3 = INSTANCE.getXPATH3_6_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_6_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAndExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.AND_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_6_0_0_1_0_0 = INSTANCE.getXPATH3_6_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_6_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_6_0_0_1_0_0_0, XPATH3_6_0_0_1_0_0_1, XPATH3_6_0_0_1_0_0_2, XPATH3_6_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_6_0_0_1_0 = INSTANCE.getXPATH3_6_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_6_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_6_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_6_0_0_1 = INSTANCE.getXPATH3_6_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_6_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_6_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_6_0_0 = INSTANCE.getXPATH3_6_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_6_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_6_0_0_0, XPATH3_6_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_6_0 = INSTANCE.getXPATH3_6_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_6_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_6_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class AndExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_6 = INSTANCE.getXPATH3_6();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_6() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAndExpr(), XPATH3_6_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_7_0_0_0 = INSTANCE.getXPATH3_7_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_7_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__LEFT), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getRangeExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_7_0_0_1_0_0_0 = INSTANCE.getXPATH3_7_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_7_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_7_0_0_1_0_0_1 = INSTANCE.getXPATH3_7_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_7_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__OPERATOR), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComp(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_7_0_0_1_0_0_2 = INSTANCE.getXPATH3_7_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_7_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_7_0_0_1_0_0_3 = INSTANCE.getXPATH3_7_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_7_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__RIGHT), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getRangeExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_7_0_0_1_0_0 = INSTANCE.getXPATH3_7_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_7_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_7_0_0_1_0_0_0, XPATH3_7_0_0_1_0_0_1, XPATH3_7_0_0_1_0_0_2, XPATH3_7_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_7_0_0_1_0 = INSTANCE.getXPATH3_7_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_7_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_7_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_7_0_0_1 = INSTANCE.getXPATH3_7_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_7_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_7_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_7_0_0 = INSTANCE.getXPATH3_7_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_7_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_7_0_0_0, XPATH3_7_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_7_0 = INSTANCE.getXPATH3_7_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_7_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_7_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ComparisonExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_7 = INSTANCE.getXPATH3_7();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_7() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), XPATH3_7_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_8_0_0_0 = INSTANCE.getXPATH3_8_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_8_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getRangeExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.RANGE_EXPR__FROM), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAdditiveExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_8_0_0_1_0_0_0 = INSTANCE.getXPATH3_8_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_8_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_8_0_0_1_0_0_1 = INSTANCE.getXPATH3_8_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_8_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("to", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_8_0_0_1_0_0_2 = INSTANCE.getXPATH3_8_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_8_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_8_0_0_1_0_0_3 = INSTANCE.getXPATH3_8_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_8_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getRangeExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.RANGE_EXPR__TO), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAdditiveExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_8_0_0_1_0_0 = INSTANCE.getXPATH3_8_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_8_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_8_0_0_1_0_0_0, XPATH3_8_0_0_1_0_0_1, XPATH3_8_0_0_1_0_0_2, XPATH3_8_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_8_0_0_1_0 = INSTANCE.getXPATH3_8_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_8_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_8_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_8_0_0_1 = INSTANCE.getXPATH3_8_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_8_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_8_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_8_0_0 = INSTANCE.getXPATH3_8_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_8_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_8_0_0_0, XPATH3_8_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_8_0 = INSTANCE.getXPATH3_8_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_8_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_8_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class RangeExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_8 = INSTANCE.getXPATH3_8();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_8() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getRangeExpr(), XPATH3_8_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_9_0_0_0 = INSTANCE.getXPATH3_9_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_9_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralComp().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_COMP__OPERATOR), new String[] {"eq", "=", "ne", "!=", "lt", "<", "le", "<=", "gt", ">", "ge", ">=", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_9_0_0 = INSTANCE.getXPATH3_9_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_9_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_9_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_9_0 = INSTANCE.getXPATH3_9_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_9_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_9_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class GeneralComp
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_9 = INSTANCE.getXPATH3_9();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_9() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralComp(), XPATH3_9_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_10_0_0_0 = INSTANCE.getXPATH3_10_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_10_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getValueComp().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VALUE_COMP__OPERATOR), new String[] {"eq", "eq", "ne", "ne", "lt", "lt", "le", "le", "gt", "gt", "ge", "ge", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_10_0_0 = INSTANCE.getXPATH3_10_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_10_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_10_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_10_0 = INSTANCE.getXPATH3_10_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_10_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_10_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class ValueComp
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_10 = INSTANCE.getXPATH3_10();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_10() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getValueComp(), XPATH3_10_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_11_0_0_0 = INSTANCE.getXPATH3_11_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_11_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeComp().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NODE_COMP__OPERATOR), new String[] {"is", "is", "precedes", "<<", "follows", ">>", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_11_0_0 = INSTANCE.getXPATH3_11_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_11_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_11_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_11_0 = INSTANCE.getXPATH3_11_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_11_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_11_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class NodeComp
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_11 = INSTANCE.getXPATH3_11();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_11() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeComp(), XPATH3_11_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_12_0_0_0 = INSTANCE.getXPATH3_12_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_12_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAdditiveExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_12_0_0_1_0_0_0 = INSTANCE.getXPATH3_12_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_12_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_12_0_0_1_0_0_1 = INSTANCE.getXPATH3_12_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_12_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAdditiveExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERATOR), new String[] {"addition", "+", "subtraction", "-", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_12_0_0_1_0_0_2 = INSTANCE.getXPATH3_12_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_12_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_12_0_0_1_0_0_3 = INSTANCE.getXPATH3_12_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_12_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAdditiveExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_12_0_0_1_0_0 = INSTANCE.getXPATH3_12_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_12_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_12_0_0_1_0_0_0, XPATH3_12_0_0_1_0_0_1, XPATH3_12_0_0_1_0_0_2, XPATH3_12_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_12_0_0_1_0 = INSTANCE.getXPATH3_12_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_12_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_12_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_12_0_0_1 = INSTANCE.getXPATH3_12_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_12_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_12_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_12_0_0 = INSTANCE.getXPATH3_12_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_12_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_12_0_0_0, XPATH3_12_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_12_0 = INSTANCE.getXPATH3_12_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_12_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_12_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class AdditiveExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_12 = INSTANCE.getXPATH3_12();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_12() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAdditiveExpr(), XPATH3_12_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_13_0_0_0 = INSTANCE.getXPATH3_13_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_13_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnionExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_13_0_0_1_0_0_0 = INSTANCE.getXPATH3_13_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_13_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_13_0_0_1_0_0_1 = INSTANCE.getXPATH3_13_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_13_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR), new String[] {"multiplication", "*", "div", "div", "idiv", "idiv", "mod", "mod", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_13_0_0_1_0_0_2 = INSTANCE.getXPATH3_13_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_13_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_13_0_0_1_0_0_3 = INSTANCE.getXPATH3_13_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_13_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnionExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_13_0_0_1_0_0 = INSTANCE.getXPATH3_13_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_13_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_13_0_0_1_0_0_0, XPATH3_13_0_0_1_0_0_1, XPATH3_13_0_0_1_0_0_2, XPATH3_13_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_13_0_0_1_0 = INSTANCE.getXPATH3_13_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_13_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_13_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_13_0_0_1 = INSTANCE.getXPATH3_13_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_13_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_13_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_13_0_0 = INSTANCE.getXPATH3_13_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_13_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_13_0_0_0, XPATH3_13_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_13_0 = INSTANCE.getXPATH3_13_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_13_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_13_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * MultiplicativeExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_13 = INSTANCE.getXPATH3_13();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_13() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeExpr(), XPATH3_13_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_14_0_0_0 = INSTANCE.getXPATH3_14_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_14_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnionExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntersectExceptExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_14_0_0_1_0_0_0 = INSTANCE.getXPATH3_14_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_14_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_14_0_0_1_0_0_1 = INSTANCE.getXPATH3_14_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_14_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnionExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERATION), new String[] {"union", "union", "vertical_bar", "|", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_14_0_0_1_0_0_2 = INSTANCE.getXPATH3_14_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_14_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_14_0_0_1_0_0_3 = INSTANCE.getXPATH3_14_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_14_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnionExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntersectExceptExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_14_0_0_1_0_0 = INSTANCE.getXPATH3_14_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_14_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_14_0_0_1_0_0_0, XPATH3_14_0_0_1_0_0_1, XPATH3_14_0_0_1_0_0_2, XPATH3_14_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_14_0_0_1_0 = INSTANCE.getXPATH3_14_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_14_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_14_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_14_0_0_1 = INSTANCE.getXPATH3_14_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_14_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_14_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_14_0_0 = INSTANCE.getXPATH3_14_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_14_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_14_0_0_0, XPATH3_14_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_14_0 = INSTANCE.getXPATH3_14_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_14_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_14_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class UnionExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_14 = INSTANCE.getXPATH3_14();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_14() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnionExpr(), XPATH3_14_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_15_0_0_0 = INSTANCE.getXPATH3_15_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_15_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntersectExceptExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getInstanceofExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_15_0_0_1_0_0_0 = INSTANCE.getXPATH3_15_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_15_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_15_0_0_1_0_0_1 = INSTANCE.getXPATH3_15_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_15_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntersectExceptExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERATOR), new String[] {"intersect", "intersect", "except", "except", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_15_0_0_1_0_0_2 = INSTANCE.getXPATH3_15_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_15_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_15_0_0_1_0_0_3 = INSTANCE.getXPATH3_15_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_15_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntersectExceptExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getInstanceofExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_15_0_0_1_0_0 = INSTANCE.getXPATH3_15_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_15_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_15_0_0_1_0_0_0, XPATH3_15_0_0_1_0_0_1, XPATH3_15_0_0_1_0_0_2, XPATH3_15_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_15_0_0_1_0 = INSTANCE.getXPATH3_15_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_15_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_15_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_15_0_0_1 = INSTANCE.getXPATH3_15_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_15_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_15_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_15_0_0 = INSTANCE.getXPATH3_15_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_15_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_15_0_0_0, XPATH3_15_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_15_0 = INSTANCE.getXPATH3_15_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_15_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_15_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * IntersectExceptExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_15 = INSTANCE.getXPATH3_15();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_15() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntersectExceptExpr(), XPATH3_15_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_16_0_0_0 = INSTANCE.getXPATH3_16_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_16_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getInstanceofExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INSTANCEOF_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getTreatExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_16_0_0_1_0_0_0 = INSTANCE.getXPATH3_16_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_16_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_16_0_0_1_0_0_1 = INSTANCE.getXPATH3_16_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_16_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("instance", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_16_0_0_1_0_0_2 = INSTANCE.getXPATH3_16_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_16_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("of", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_16_0_0_1_0_0_3 = INSTANCE.getXPATH3_16_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_16_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getInstanceofExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INSTANCEOF_EXPR__TYPE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSequenceType(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_16_0_0_1_0_0 = INSTANCE.getXPATH3_16_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_16_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_16_0_0_1_0_0_0, XPATH3_16_0_0_1_0_0_1, XPATH3_16_0_0_1_0_0_2, XPATH3_16_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_16_0_0_1_0 = INSTANCE.getXPATH3_16_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_16_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_16_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_16_0_0_1 = INSTANCE.getXPATH3_16_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_16_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_16_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_16_0_0 = INSTANCE.getXPATH3_16_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_16_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_16_0_0_0, XPATH3_16_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_16_0 = INSTANCE.getXPATH3_16_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_16_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_16_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * InstanceofExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_16 = INSTANCE.getXPATH3_16();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_16() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getInstanceofExpr(), XPATH3_16_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_17_0_0_0 = INSTANCE.getXPATH3_17_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_17_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getTreatExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.TREAT_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastableExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_17_0_0_1_0_0_0 = INSTANCE.getXPATH3_17_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_17_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_17_0_0_1_0_0_1 = INSTANCE.getXPATH3_17_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_17_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("treat", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_17_0_0_1_0_0_2 = INSTANCE.getXPATH3_17_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_17_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("as", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_17_0_0_1_0_0_3 = INSTANCE.getXPATH3_17_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_17_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getTreatExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.TREAT_EXPR__TYPE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSequenceType(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_17_0_0_1_0_0 = INSTANCE.getXPATH3_17_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_17_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_17_0_0_1_0_0_0, XPATH3_17_0_0_1_0_0_1, XPATH3_17_0_0_1_0_0_2, XPATH3_17_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_17_0_0_1_0 = INSTANCE.getXPATH3_17_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_17_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_17_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_17_0_0_1 = INSTANCE.getXPATH3_17_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_17_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_17_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_17_0_0 = INSTANCE.getXPATH3_17_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_17_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_17_0_0_0, XPATH3_17_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_17_0 = INSTANCE.getXPATH3_17_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_17_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_17_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class TreatExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_17 = INSTANCE.getXPATH3_17();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_17() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getTreatExpr(), XPATH3_17_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_18_0_0_0 = INSTANCE.getXPATH3_18_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_18_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastableExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CASTABLE_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_18_0_0_1_0_0_0 = INSTANCE.getXPATH3_18_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_18_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_18_0_0_1_0_0_1 = INSTANCE.getXPATH3_18_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_18_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("castable", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_18_0_0_1_0_0_2 = INSTANCE.getXPATH3_18_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_18_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("as", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_18_0_0_1_0_0_3 = INSTANCE.getXPATH3_18_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_18_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastableExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CASTABLE_EXPR__TYPE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSingleType(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_18_0_0_1_0_0 = INSTANCE.getXPATH3_18_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_18_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_18_0_0_1_0_0_0, XPATH3_18_0_0_1_0_0_1, XPATH3_18_0_0_1_0_0_2, XPATH3_18_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_18_0_0_1_0 = INSTANCE.getXPATH3_18_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_18_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_18_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_18_0_0_1 = INSTANCE.getXPATH3_18_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_18_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_18_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_18_0_0 = INSTANCE.getXPATH3_18_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_18_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_18_0_0_0, XPATH3_18_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_18_0 = INSTANCE.getXPATH3_18_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_18_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_18_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class CastableExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_18 = INSTANCE.getXPATH3_18();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_18() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastableExpr(), XPATH3_18_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_19_0_0_0 = INSTANCE.getXPATH3_19_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_19_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CAST_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnaryExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_19_0_0_1_0_0_0 = INSTANCE.getXPATH3_19_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_19_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_19_0_0_1_0_0_1 = INSTANCE.getXPATH3_19_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_19_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("cast", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_19_0_0_1_0_0_2 = INSTANCE.getXPATH3_19_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_19_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("as", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_19_0_0_1_0_0_3 = INSTANCE.getXPATH3_19_0_0_1_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_19_0_0_1_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CAST_EXPR__TYPE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSingleType(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_19_0_0_1_0_0 = INSTANCE.getXPATH3_19_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_19_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_19_0_0_1_0_0_0, XPATH3_19_0_0_1_0_0_1, XPATH3_19_0_0_1_0_0_2, XPATH3_19_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_19_0_0_1_0 = INSTANCE.getXPATH3_19_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_19_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_19_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_19_0_0_1 = INSTANCE.getXPATH3_19_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_19_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_19_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_19_0_0 = INSTANCE.getXPATH3_19_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_19_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_19_0_0_0, XPATH3_19_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_19_0 = INSTANCE.getXPATH3_19_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_19_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_19_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class CastExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_19 = INSTANCE.getXPATH3_19();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_19() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastExpr(), XPATH3_19_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_20_0_0_0 = INSTANCE.getXPATH3_20_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_20_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnaryExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNARY_EXPR__OPERATOR), new String[] {"plus", "+", "minus", "-", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_20_0_0_1 = INSTANCE.getXPATH3_20_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_20_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnaryExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNARY_EXPR__OPERAND), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getValueExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_20_0_0 = INSTANCE.getXPATH3_20_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_20_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_20_0_0_0, XPATH3_20_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_20_0 = INSTANCE.getXPATH3_20_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_20_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_20_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class UnaryExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_20 = INSTANCE.getXPATH3_20();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_20() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnaryExpr(), XPATH3_20_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_21_0_0_0 = INSTANCE.getXPATH3_21_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_21_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FILTER_EXPR__PRIMARY_EXPR), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPrimaryExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_21_0_0_1 = INSTANCE.getXPATH3_21_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_21_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FILTER_EXPR__PREDICATE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPredicate(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_21_0_0 = INSTANCE.getXPATH3_21_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_21_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_21_0_0_0, XPATH3_21_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_21_0 = INSTANCE.getXPATH3_21_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_21_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_21_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class FilterExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_21 = INSTANCE.getXPATH3_21();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_21() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), XPATH3_21_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_22_0_0_0_0_0_0 = INSTANCE.getXPATH3_22_0_0_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_22_0_0_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFunctionCall().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_22_0_0_0_0_0 = INSTANCE.getXPATH3_22_0_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_22_0_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_22_0_0_0_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_22_0_0_0_0_1_0 = INSTANCE.getXPATH3_22_0_0_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_22_0_0_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFunctionCall().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_22_0_0_0_0_1 = INSTANCE.getXPATH3_22_0_0_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_22_0_0_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_22_0_0_0_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_22_0_0_0_0 = INSTANCE.getXPATH3_22_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_22_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_22_0_0_0_0_0, XPATH3_22_0_0_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_22_0_0_0 = INSTANCE.getXPATH3_22_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_22_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_22_0_0_0_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_22_0_0_1 = INSTANCE.getXPATH3_22_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_22_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_22_0_0_2_0_0_0 = INSTANCE.getXPATH3_22_0_0_2_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_22_0_0_2_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFunctionCall().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_22_0_0_2_0_0_1_0_0_0 = INSTANCE.getXPATH3_22_0_0_2_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_22_0_0_2_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(",", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_22_0_0_2_0_0_1_0_0_1 = INSTANCE.getXPATH3_22_0_0_2_0_0_1_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_22_0_0_2_0_0_1_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_22_0_0_2_0_0_1_0_0_2 = INSTANCE.getXPATH3_22_0_0_2_0_0_1_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_22_0_0_2_0_0_1_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFunctionCall().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_22_0_0_2_0_0_1_0_0 = INSTANCE.getXPATH3_22_0_0_2_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_22_0_0_2_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_22_0_0_2_0_0_1_0_0_0, XPATH3_22_0_0_2_0_0_1_0_0_1, XPATH3_22_0_0_2_0_0_1_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_22_0_0_2_0_0_1_0 = INSTANCE.getXPATH3_22_0_0_2_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_22_0_0_2_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_22_0_0_2_0_0_1_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_22_0_0_2_0_0_1 = INSTANCE.getXPATH3_22_0_0_2_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_22_0_0_2_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_22_0_0_2_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_22_0_0_2_0_0 = INSTANCE.getXPATH3_22_0_0_2_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_22_0_0_2_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_22_0_0_2_0_0_0, XPATH3_22_0_0_2_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_22_0_0_2_0 = INSTANCE.getXPATH3_22_0_0_2_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_22_0_0_2_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_22_0_0_2_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_22_0_0_2 = INSTANCE.getXPATH3_22_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_22_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_22_0_0_2_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_22_0_0_3 = INSTANCE.getXPATH3_22_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_22_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_22_0_0 = INSTANCE.getXPATH3_22_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_22_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_22_0_0_0, XPATH3_22_0_0_1, XPATH3_22_0_0_2, XPATH3_22_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_22_0 = INSTANCE.getXPATH3_22_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_22_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_22_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class FunctionCall
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_22 = INSTANCE.getXPATH3_22();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_22() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFunctionCall(), XPATH3_22_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_23_0_0_0 = INSTANCE.getXPATH3_23_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_23_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PATH_EXPR__STEP), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExprChild(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_23_0_0_1 = INSTANCE.getXPATH3_23_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_23_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PATH_EXPR__STEP), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getChildStepExpr(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDescOrSelfStepExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_23_0_0 = INSTANCE.getXPATH3_23_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_23_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_23_0_0_0, XPATH3_23_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_23_0 = INSTANCE.getXPATH3_23_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_23_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_23_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class PathExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_23 = INSTANCE.getXPATH3_23();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_23() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), XPATH3_23_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_24_0_0_0 = INSTANCE.getXPATH3_24_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_24_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("/", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_24_0_0_1 = INSTANCE.getXPATH3_24_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_24_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getChildStepExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CHILD_STEP_EXPR__STEP), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStepExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_24_0_0 = INSTANCE.getXPATH3_24_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_24_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_24_0_0_0, XPATH3_24_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_24_0 = INSTANCE.getXPATH3_24_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_24_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_24_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ChildStepExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_24 = INSTANCE.getXPATH3_24();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_24() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getChildStepExpr(), XPATH3_24_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_25_0_0_0 = INSTANCE.getXPATH3_25_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_25_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("//", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_25_0_0_1 = INSTANCE.getXPATH3_25_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_25_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDescOrSelfStepExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DESC_OR_SELF_STEP_EXPR__STEP), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStepExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_25_0_0 = INSTANCE.getXPATH3_25_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_25_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_25_0_0_0, XPATH3_25_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_25_0 = INSTANCE.getXPATH3_25_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_25_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_25_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * DescOrSelfStepExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_25 = INSTANCE.getXPATH3_25();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_25() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDescOrSelfStepExpr(), XPATH3_25_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_26_0_0_0 = INSTANCE.getXPATH3_26_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_26_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("/", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_26_0_0 = INSTANCE.getXPATH3_26_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_26_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_26_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_26_0 = INSTANCE.getXPATH3_26_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_26_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_26_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class RootStepExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_26 = INSTANCE.getXPATH3_26();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_26() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getRootStepExpr(), XPATH3_26_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_27_0_0_0 = INSTANCE.getXPATH3_27_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_27_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSelfStepExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SELF_STEP_EXPR__STEP), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSelfStepExprChild(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_27_0_0 = INSTANCE.getXPATH3_27_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_27_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_27_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_27_0 = INSTANCE.getXPATH3_27_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_27_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_27_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class SelfStepExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_27 = INSTANCE.getXPATH3_27();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_27() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSelfStepExpr(), XPATH3_27_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_28_0_0_0 = INSTANCE.getXPATH3_28_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_28_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS), new String[] {"child", "child", "descendant", "descendant", "attribute", "attribute", "self", "self", "descendant_or_self", "descendant-or-self", "following_sibling", "following-sibling", "following", "following", "namespace", "namespace", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_28_0_0_1 = INSTANCE.getXPATH3_28_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_28_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("::", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_28_0_0_2 = INSTANCE.getXPATH3_28_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_28_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__NODE_TEST), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeTest(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_28_0_0_3 = INSTANCE.getXPATH3_28_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_28_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__PREDICATE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPredicate(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_28_0_0 = INSTANCE.getXPATH3_28_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_28_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_28_0_0_0, XPATH3_28_0_0_1, XPATH3_28_0_0_2, XPATH3_28_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_28_0 = INSTANCE.getXPATH3_28_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_28_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_28_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * GeneralForwardStep
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_28 = INSTANCE.getXPATH3_28();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_28() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), XPATH3_28_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_29_0_0_0 = INSTANCE.getXPATH3_29_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_29_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__KIND), new String[] {"child", "", "attribute", "@", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_29_0_0_1 = INSTANCE.getXPATH3_29_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_29_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__NODE_TEST), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeTest(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_29_0_0_2 = INSTANCE.getXPATH3_29_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_29_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__PREDICATE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPredicate(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_29_0_0 = INSTANCE.getXPATH3_29_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_29_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_29_0_0_0, XPATH3_29_0_0_1, XPATH3_29_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_29_0 = INSTANCE.getXPATH3_29_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_29_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_29_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * AbbrevForwardStep
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_29 = INSTANCE.getXPATH3_29();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_29() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), XPATH3_29_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_30_0_0_0 = INSTANCE.getXPATH3_30_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_30_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__AXIS), new String[] {"parent", "parent", "ancestor", "ancestor", "preceding_sibling", "preceding-sibling", "preceding", "preceding", "ancestor_or_self", "ancestor-or-self", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_30_0_0_1 = INSTANCE.getXPATH3_30_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_30_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("::", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_30_0_0_2 = INSTANCE.getXPATH3_30_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_30_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__NODE_TEST), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeTest(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_30_0_0_3 = INSTANCE.getXPATH3_30_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_30_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__PREDICATE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPredicate(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_30_0_0 = INSTANCE.getXPATH3_30_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_30_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_30_0_0_0, XPATH3_30_0_0_1, XPATH3_30_0_0_2, XPATH3_30_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_30_0 = INSTANCE.getXPATH3_30_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_30_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_30_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * GeneralReverseStep
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_30 = INSTANCE.getXPATH3_30();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_30() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), XPATH3_30_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_31_0_0_0 = INSTANCE.getXPATH3_31_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_31_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevReverseStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_REVERSE_STEP__KIND), new String[] {"parent", "..", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_31_0_0_1 = INSTANCE.getXPATH3_31_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_31_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevReverseStep().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_REVERSE_STEP__PREDICATE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.STAR, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPredicate(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_31_0_0 = INSTANCE.getXPATH3_31_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_31_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_31_0_0_0, XPATH3_31_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_31_0 = INSTANCE.getXPATH3_31_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_31_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_31_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * AbbrevReverseStep
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_31 = INSTANCE.getXPATH3_31();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_31() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevReverseStep(), XPATH3_31_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_32_0_0_0 = INSTANCE.getXPATH3_32_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_32_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeKindTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NODE_KIND_TEST__TEST), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getKindTest(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_32_0_0 = INSTANCE.getXPATH3_32_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_32_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_32_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_32_0 = INSTANCE.getXPATH3_32_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_32_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_32_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class NodeKindTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_32 = INSTANCE.getXPATH3_32();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_32() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeKindTest(), XPATH3_32_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_33_0_0_0_0_0_0 = INSTANCE.getXPATH3_33_0_0_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_33_0_0_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQNameTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_33_0_0_0_0_0 = INSTANCE.getXPATH3_33_0_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_33_0_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_33_0_0_0_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_33_0_0_0_0_1_0 = INSTANCE.getXPATH3_33_0_0_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_33_0_0_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQNameTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_33_0_0_0_0_1 = INSTANCE.getXPATH3_33_0_0_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_33_0_0_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_33_0_0_0_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_33_0_0_0_0 = INSTANCE.getXPATH3_33_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_33_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_33_0_0_0_0_0, XPATH3_33_0_0_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_33_0_0_0 = INSTANCE.getXPATH3_33_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_33_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_33_0_0_0_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_33_0_0 = INSTANCE.getXPATH3_33_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_33_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_33_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_33_0 = INSTANCE.getXPATH3_33_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_33_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_33_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class QNameTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_33 = INSTANCE.getXPATH3_33();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_33() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQNameTest(), XPATH3_33_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_34_0_0_0 = INSTANCE.getXPATH3_34_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_34_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("*", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_34_0_0 = INSTANCE.getXPATH3_34_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_34_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_34_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_34_0 = INSTANCE.getXPATH3_34_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_34_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_34_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class AnyWildcard
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_34 = INSTANCE.getXPATH3_34();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_34() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAnyWildcard(), XPATH3_34_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_35_0_0_0 = INSTANCE.getXPATH3_35_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_35_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getLocalNameWildcard().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.LOCAL_NAME_WILDCARD__NAMESPACE), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_35_0_0_1 = INSTANCE.getXPATH3_35_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_35_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(":", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_35_0_0_2 = INSTANCE.getXPATH3_35_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_35_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("*", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_35_0_0 = INSTANCE.getXPATH3_35_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_35_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_35_0_0_0, XPATH3_35_0_0_1, XPATH3_35_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_35_0 = INSTANCE.getXPATH3_35_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_35_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_35_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * LocalNameWildcard
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_35 = INSTANCE.getXPATH3_35();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_35() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getLocalNameWildcard(), XPATH3_35_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_36_0_0_0 = INSTANCE.getXPATH3_36_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_36_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("*", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_36_0_0_1 = INSTANCE.getXPATH3_36_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_36_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(":", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_36_0_0_2 = INSTANCE.getXPATH3_36_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_36_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNamespaceWildcard().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAMESPACE_WILDCARD__LOCAL_NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_36_0_0 = INSTANCE.getXPATH3_36_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_36_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_36_0_0_0, XPATH3_36_0_0_1, XPATH3_36_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_36_0 = INSTANCE.getXPATH3_36_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_36_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_36_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * NamespaceWildcard
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_36 = INSTANCE.getXPATH3_36();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_36() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNamespaceWildcard(), XPATH3_36_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_37_0_0_0 = INSTANCE.getXPATH3_37_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_37_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("[", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_37_0_0_1 = INSTANCE.getXPATH3_37_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_37_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPredicate().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PREDICATE__EXPR), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_37_0_0_2 = INSTANCE.getXPATH3_37_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_37_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("]", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_37_0_0 = INSTANCE.getXPATH3_37_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_37_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_37_0_0_0, XPATH3_37_0_0_1, XPATH3_37_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_37_0 = INSTANCE.getXPATH3_37_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_37_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_37_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Predicate
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_37 = INSTANCE.getXPATH3_37();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_37() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPredicate(), XPATH3_37_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_38_0_0_0 = INSTANCE.getXPATH3_38_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_38_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("$", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_38_0_0_1_0_0_0 = INSTANCE.getXPATH3_38_0_0_1_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_38_0_0_1_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getVarRef().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_38_0_0_1_0_0 = INSTANCE.getXPATH3_38_0_0_1_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_38_0_0_1_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_38_0_0_1_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_38_0_0_1_0_1_0 = INSTANCE.getXPATH3_38_0_0_1_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_38_0_0_1_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getVarRef().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_38_0_0_1_0_1 = INSTANCE.getXPATH3_38_0_0_1_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_38_0_0_1_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_38_0_0_1_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_38_0_0_1_0 = INSTANCE.getXPATH3_38_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_38_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_38_0_0_1_0_0, XPATH3_38_0_0_1_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_38_0_0_1 = INSTANCE.getXPATH3_38_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_38_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_38_0_0_1_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_38_0_0 = INSTANCE.getXPATH3_38_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_38_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_38_0_0_0, XPATH3_38_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_38_0 = INSTANCE.getXPATH3_38_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_38_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_38_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class VarRef
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_38 = INSTANCE.getXPATH3_38();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_38() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getVarRef(), XPATH3_38_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_39_0_0_0 = INSTANCE.getXPATH3_39_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_39_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_39_0_0_1 = INSTANCE.getXPATH3_39_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_39_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getParenthesizedExpr().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PARENTHESIZED_EXPR__EXPR), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExpr(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_39_0_0_2 = INSTANCE.getXPATH3_39_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_39_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_39_0_0 = INSTANCE.getXPATH3_39_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_39_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_39_0_0_0, XPATH3_39_0_0_1, XPATH3_39_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_39_0 = INSTANCE.getXPATH3_39_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_39_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_39_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ParenthesizedExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_39 = INSTANCE.getXPATH3_39();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_39() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getParenthesizedExpr(), XPATH3_39_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_40_0_0_0 = INSTANCE.getXPATH3_40_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_40_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(".", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_40_0_0 = INSTANCE.getXPATH3_40_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_40_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_40_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_40_0 = INSTANCE.getXPATH3_40_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_40_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_40_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ContextItemExpr
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_40 = INSTANCE.getXPATH3_40();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_40() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getContextItemExpr(), XPATH3_40_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_41_0_0_0 = INSTANCE.getXPATH3_41_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_41_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSingleType().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SINGLE_TYPE__TYPE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAtomicType(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3BooleanTerminal XPATH3_41_0_0_1 = INSTANCE.getXPATH3_41_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3BooleanTerminal getXPATH3_41_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3BooleanTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSingleType().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SINGLE_TYPE__OPTIONAL), "?", "", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_41_0_0 = INSTANCE.getXPATH3_41_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_41_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_41_0_0_0, XPATH3_41_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_41_0 = INSTANCE.getXPATH3_41_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_41_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_41_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class SingleType
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_41 = INSTANCE.getXPATH3_41();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_41() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSingleType(), XPATH3_41_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_42_0_0_0 = INSTANCE.getXPATH3_42_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_42_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("empty-sequence", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_42_0_0_1 = INSTANCE.getXPATH3_42_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_42_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_42_0_0_2 = INSTANCE.getXPATH3_42_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_42_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_42_0_0 = INSTANCE.getXPATH3_42_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_42_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_42_0_0_0, XPATH3_42_0_0_1, XPATH3_42_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_42_0 = INSTANCE.getXPATH3_42_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_42_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_42_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * EmptySequenceType
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_42 = INSTANCE.getXPATH3_42();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_42() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getEmptySequenceType(), XPATH3_42_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_43_0_0_0 = INSTANCE.getXPATH3_43_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_43_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getItemSequenceType().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__ITEM_TYPE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getItemType(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal XPATH3_43_0_0_1 = INSTANCE.getXPATH3_43_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal getXPATH3_43_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getItemSequenceType().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__OCCURRENCE), new String[] {"mandatory", "", "optional", "?", "star", "*", "plus", "+", }, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_43_0_0 = INSTANCE.getXPATH3_43_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_43_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_43_0_0_0, XPATH3_43_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_43_0 = INSTANCE.getXPATH3_43_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_43_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_43_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ItemSequenceType
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_43 = INSTANCE.getXPATH3_43();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_43() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getItemSequenceType(), XPATH3_43_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_44_0_0_0 = INSTANCE.getXPATH3_44_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_44_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getItemKindTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_KIND_TEST__TEST), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getKindTest(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_44_0_0 = INSTANCE.getXPATH3_44_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_44_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_44_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_44_0 = INSTANCE.getXPATH3_44_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_44_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_44_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class ItemKindTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_44 = INSTANCE.getXPATH3_44();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_44() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getItemKindTest(), XPATH3_44_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_45_0_0_0 = INSTANCE.getXPATH3_45_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_45_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("item", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_45_0_0_1 = INSTANCE.getXPATH3_45_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_45_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_45_0_0_2 = INSTANCE.getXPATH3_45_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_45_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_45_0_0 = INSTANCE.getXPATH3_45_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_45_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_45_0_0_0, XPATH3_45_0_0_1, XPATH3_45_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_45_0 = INSTANCE.getXPATH3_45_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_45_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_45_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class AnyItemType
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_45 = INSTANCE.getXPATH3_45();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_45() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAnyItemType(), XPATH3_45_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_46_0_0_0 = INSTANCE.getXPATH3_46_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_46_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAtomicItemType().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_ITEM_TYPE__TYPE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAtomicType(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_46_0_0 = INSTANCE.getXPATH3_46_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_46_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_46_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_46_0 = INSTANCE.getXPATH3_46_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_46_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_46_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * AtomicItemType
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_46 = INSTANCE.getXPATH3_46();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_46() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAtomicItemType(), XPATH3_46_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_47_0_0_0_0_0_0 = INSTANCE.getXPATH3_47_0_0_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_47_0_0_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAtomicType().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_47_0_0_0_0_0 = INSTANCE.getXPATH3_47_0_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_47_0_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_47_0_0_0_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_47_0_0_0_0_1_0 = INSTANCE.getXPATH3_47_0_0_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_47_0_0_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAtomicType().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_47_0_0_0_0_1 = INSTANCE.getXPATH3_47_0_0_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_47_0_0_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_47_0_0_0_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_47_0_0_0_0 = INSTANCE.getXPATH3_47_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_47_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_47_0_0_0_0_0, XPATH3_47_0_0_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_47_0_0_0 = INSTANCE.getXPATH3_47_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_47_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_47_0_0_0_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_47_0_0 = INSTANCE.getXPATH3_47_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_47_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_47_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_47_0 = INSTANCE.getXPATH3_47_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_47_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_47_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class AtomicType
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_47 = INSTANCE.getXPATH3_47();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_47() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAtomicType(), XPATH3_47_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_48_0_0_0_0_0_0 = INSTANCE.getXPATH3_48_0_0_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_48_0_0_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOptionalAtomicType().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_48_0_0_0_0_0 = INSTANCE.getXPATH3_48_0_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_48_0_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_48_0_0_0_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_48_0_0_0_0_1_0 = INSTANCE.getXPATH3_48_0_0_0_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_48_0_0_0_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOptionalAtomicType().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_48_0_0_0_0_1 = INSTANCE.getXPATH3_48_0_0_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_48_0_0_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_48_0_0_0_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_48_0_0_0_0 = INSTANCE.getXPATH3_48_0_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_48_0_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_48_0_0_0_0_0, XPATH3_48_0_0_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_48_0_0_0 = INSTANCE.getXPATH3_48_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_48_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_48_0_0_0_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3BooleanTerminal XPATH3_48_0_0_1 = INSTANCE.getXPATH3_48_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3BooleanTerminal getXPATH3_48_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3BooleanTerminal(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOptionalAtomicType().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__OPTIONAL), "?", "", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_48_0_0 = INSTANCE.getXPATH3_48_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_48_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_48_0_0_0, XPATH3_48_0_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_48_0 = INSTANCE.getXPATH3_48_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_48_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_48_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * OptionalAtomicType
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_48 = INSTANCE.getXPATH3_48();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_48() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOptionalAtomicType(), XPATH3_48_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_49_0_0_0 = INSTANCE.getXPATH3_49_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_49_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("node", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_49_0_0_1 = INSTANCE.getXPATH3_49_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_49_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_49_0_0_2 = INSTANCE.getXPATH3_49_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_49_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_49_0_0 = INSTANCE.getXPATH3_49_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_49_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_49_0_0_0, XPATH3_49_0_0_1, XPATH3_49_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_49_0 = INSTANCE.getXPATH3_49_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_49_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_49_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class AnyKindTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_49 = INSTANCE.getXPATH3_49();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_49() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAnyKindTest(), XPATH3_49_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_50_0_0_0 = INSTANCE.getXPATH3_50_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_50_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("document-node", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_50_0_0_1 = INSTANCE.getXPATH3_50_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_50_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_50_0_0_2 = INSTANCE.getXPATH3_50_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_50_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDocumentTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOCUMENT_TEST__TEST), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getElementTest(), org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSchemaElementTest(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_50_0_0_3 = INSTANCE.getXPATH3_50_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_50_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_50_0_0 = INSTANCE.getXPATH3_50_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_50_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_50_0_0_0, XPATH3_50_0_0_1, XPATH3_50_0_0_2, XPATH3_50_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_50_0 = INSTANCE.getXPATH3_50_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_50_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_50_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class DocumentTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_50 = INSTANCE.getXPATH3_50();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_50() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDocumentTest(), XPATH3_50_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_51_0_0_0 = INSTANCE.getXPATH3_51_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_51_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("text", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_51_0_0_1 = INSTANCE.getXPATH3_51_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_51_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_51_0_0_2 = INSTANCE.getXPATH3_51_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_51_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_51_0_0 = INSTANCE.getXPATH3_51_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_51_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_51_0_0_0, XPATH3_51_0_0_1, XPATH3_51_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_51_0 = INSTANCE.getXPATH3_51_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_51_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_51_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class TextTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_51 = INSTANCE.getXPATH3_51();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_51() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getTextTest(), XPATH3_51_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_52_0_0_0 = INSTANCE.getXPATH3_52_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_52_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("comment", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_52_0_0_1 = INSTANCE.getXPATH3_52_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_52_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_52_0_0_2 = INSTANCE.getXPATH3_52_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_52_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_52_0_0 = INSTANCE.getXPATH3_52_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_52_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_52_0_0_0, XPATH3_52_0_0_1, XPATH3_52_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_52_0 = INSTANCE.getXPATH3_52_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_52_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_52_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class CommentTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_52 = INSTANCE.getXPATH3_52();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_52() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCommentTest(), XPATH3_52_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_53_0_0_0 = INSTANCE.getXPATH3_53_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_53_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("processing-instruction", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_53_0_0_1 = INSTANCE.getXPATH3_53_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_53_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_53_0_0_2 = INSTANCE.getXPATH3_53_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_53_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_53_0_0 = INSTANCE.getXPATH3_53_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_53_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_53_0_0_0, XPATH3_53_0_0_1, XPATH3_53_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_53_0 = INSTANCE.getXPATH3_53_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_53_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_53_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class PITest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_53 = INSTANCE.getXPATH3_53();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_53() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPITest(), XPATH3_53_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_54_0_0_0 = INSTANCE.getXPATH3_54_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_54_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("processing-instruction", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_54_0_0_1 = INSTANCE.getXPATH3_54_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_54_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_54_0_0_2 = INSTANCE.getXPATH3_54_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_54_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNCNamePITest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NC_NAME_PI_TEST__NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_54_0_0_3 = INSTANCE.getXPATH3_54_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_54_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_54_0_0 = INSTANCE.getXPATH3_54_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_54_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_54_0_0_0, XPATH3_54_0_0_1, XPATH3_54_0_0_2, XPATH3_54_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_54_0 = INSTANCE.getXPATH3_54_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_54_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_54_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class NCNamePITest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_54 = INSTANCE.getXPATH3_54();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_54() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNCNamePITest(), XPATH3_54_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_55_0_0_0 = INSTANCE.getXPATH3_55_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_55_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("processing-instruction", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_55_0_0_1 = INSTANCE.getXPATH3_55_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_55_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_55_0_0_2 = INSTANCE.getXPATH3_55_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_55_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStringLiteralPITest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL_PI_TEST__LITERAL), "STRING_LITERAL", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_55_0_0_3 = INSTANCE.getXPATH3_55_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_55_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_55_0_0 = INSTANCE.getXPATH3_55_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_55_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_55_0_0_0, XPATH3_55_0_0_1, XPATH3_55_0_0_2, XPATH3_55_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_55_0 = INSTANCE.getXPATH3_55_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_55_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_55_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * StringLiteralPITest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_55 = INSTANCE.getXPATH3_55();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_55() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStringLiteralPITest(), XPATH3_55_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_56_0_0_0 = INSTANCE.getXPATH3_56_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_56_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("attribute", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_56_0_0_1 = INSTANCE.getXPATH3_56_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_56_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_56_0_0_2 = INSTANCE.getXPATH3_56_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_56_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_56_0_0 = INSTANCE.getXPATH3_56_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_56_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_56_0_0_0, XPATH3_56_0_0_1, XPATH3_56_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_56_0 = INSTANCE.getXPATH3_56_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_56_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_56_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * AttributeTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_56 = INSTANCE.getXPATH3_56();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_56() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAttributeTest(), XPATH3_56_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_57_0_0_0 = INSTANCE.getXPATH3_57_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_57_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("attribute", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_57_0_0_1 = INSTANCE.getXPATH3_57_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_57_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_57_0_0_2 = INSTANCE.getXPATH3_57_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_57_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("*", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_57_0_0_3_0_0_0 = INSTANCE.getXPATH3_57_0_0_3_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_57_0_0_3_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(",", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_57_0_0_3_0_0_1 = INSTANCE.getXPATH3_57_0_0_3_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_57_0_0_3_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_57_0_0_3_0_0_2_0_0_0 = INSTANCE.getXPATH3_57_0_0_3_0_0_2_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_57_0_0_3_0_0_2_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getWildcardAttributeTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_57_0_0_3_0_0_2_0_0 = INSTANCE.getXPATH3_57_0_0_3_0_0_2_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_57_0_0_3_0_0_2_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_57_0_0_3_0_0_2_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_57_0_0_3_0_0_2_0_1_0 = INSTANCE.getXPATH3_57_0_0_3_0_0_2_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_57_0_0_3_0_0_2_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getWildcardAttributeTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_57_0_0_3_0_0_2_0_1 = INSTANCE.getXPATH3_57_0_0_3_0_0_2_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_57_0_0_3_0_0_2_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_57_0_0_3_0_0_2_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_57_0_0_3_0_0_2_0 = INSTANCE.getXPATH3_57_0_0_3_0_0_2_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_57_0_0_3_0_0_2_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_57_0_0_3_0_0_2_0_0, XPATH3_57_0_0_3_0_0_2_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_57_0_0_3_0_0_2 = INSTANCE.getXPATH3_57_0_0_3_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_57_0_0_3_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_57_0_0_3_0_0_2_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_57_0_0_3_0_0 = INSTANCE.getXPATH3_57_0_0_3_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_57_0_0_3_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_57_0_0_3_0_0_0, XPATH3_57_0_0_3_0_0_1, XPATH3_57_0_0_3_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_57_0_0_3_0 = INSTANCE.getXPATH3_57_0_0_3_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_57_0_0_3_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_57_0_0_3_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_57_0_0_3 = INSTANCE.getXPATH3_57_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_57_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_57_0_0_3_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_57_0_0_4 = INSTANCE.getXPATH3_57_0_0_4();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_57_0_0_4() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_57_0_0 = INSTANCE.getXPATH3_57_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_57_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_57_0_0_0, XPATH3_57_0_0_1, XPATH3_57_0_0_2, XPATH3_57_0_0_3, XPATH3_57_0_0_4);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_57_0 = INSTANCE.getXPATH3_57_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_57_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_57_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * WildcardAttributeTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_57 = INSTANCE.getXPATH3_57();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_57() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getWildcardAttributeTest(), XPATH3_57_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_58_0_0_0 = INSTANCE.getXPATH3_58_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_58_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("attribute", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_58_0_0_1 = INSTANCE.getXPATH3_58_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_58_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_58_0_0_2_0_0_0 = INSTANCE.getXPATH3_58_0_0_2_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_58_0_0_2_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameAttributeTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_58_0_0_2_0_0 = INSTANCE.getXPATH3_58_0_0_2_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_58_0_0_2_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_58_0_0_2_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_58_0_0_2_0_1_0 = INSTANCE.getXPATH3_58_0_0_2_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_58_0_0_2_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameAttributeTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_58_0_0_2_0_1 = INSTANCE.getXPATH3_58_0_0_2_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_58_0_0_2_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_58_0_0_2_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_58_0_0_2_0 = INSTANCE.getXPATH3_58_0_0_2_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_58_0_0_2_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_58_0_0_2_0_0, XPATH3_58_0_0_2_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_58_0_0_2 = INSTANCE.getXPATH3_58_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_58_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_58_0_0_2_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_58_0_0_3_0_0_0 = INSTANCE.getXPATH3_58_0_0_3_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_58_0_0_3_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(",", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_58_0_0_3_0_0_1 = INSTANCE.getXPATH3_58_0_0_3_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_58_0_0_3_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_58_0_0_3_0_0_2_0_0_0 = INSTANCE.getXPATH3_58_0_0_3_0_0_2_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_58_0_0_3_0_0_2_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameAttributeTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_58_0_0_3_0_0_2_0_0 = INSTANCE.getXPATH3_58_0_0_3_0_0_2_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_58_0_0_3_0_0_2_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_58_0_0_3_0_0_2_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_58_0_0_3_0_0_2_0_1_0 = INSTANCE.getXPATH3_58_0_0_3_0_0_2_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_58_0_0_3_0_0_2_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameAttributeTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_58_0_0_3_0_0_2_0_1 = INSTANCE.getXPATH3_58_0_0_3_0_0_2_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_58_0_0_3_0_0_2_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_58_0_0_3_0_0_2_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_58_0_0_3_0_0_2_0 = INSTANCE.getXPATH3_58_0_0_3_0_0_2_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_58_0_0_3_0_0_2_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_58_0_0_3_0_0_2_0_0, XPATH3_58_0_0_3_0_0_2_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_58_0_0_3_0_0_2 = INSTANCE.getXPATH3_58_0_0_3_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_58_0_0_3_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_58_0_0_3_0_0_2_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_58_0_0_3_0_0 = INSTANCE.getXPATH3_58_0_0_3_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_58_0_0_3_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_58_0_0_3_0_0_0, XPATH3_58_0_0_3_0_0_1, XPATH3_58_0_0_3_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_58_0_0_3_0 = INSTANCE.getXPATH3_58_0_0_3_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_58_0_0_3_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_58_0_0_3_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_58_0_0_3 = INSTANCE.getXPATH3_58_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_58_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_58_0_0_3_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_58_0_0_4 = INSTANCE.getXPATH3_58_0_0_4();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_58_0_0_4() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_58_0_0 = INSTANCE.getXPATH3_58_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_58_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_58_0_0_0, XPATH3_58_0_0_1, XPATH3_58_0_0_2, XPATH3_58_0_0_3, XPATH3_58_0_0_4);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_58_0 = INSTANCE.getXPATH3_58_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_58_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_58_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * NameAttributeTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_58 = INSTANCE.getXPATH3_58();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_58() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameAttributeTest(), XPATH3_58_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_59_0_0_0 = INSTANCE.getXPATH3_59_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_59_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("schema-attribute", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_59_0_0_1 = INSTANCE.getXPATH3_59_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_59_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_59_0_0_2_0_0_0 = INSTANCE.getXPATH3_59_0_0_2_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_59_0_0_2_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSchemaAttributeTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_59_0_0_2_0_0 = INSTANCE.getXPATH3_59_0_0_2_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_59_0_0_2_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_59_0_0_2_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_59_0_0_2_0_1_0 = INSTANCE.getXPATH3_59_0_0_2_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_59_0_0_2_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSchemaAttributeTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_59_0_0_2_0_1 = INSTANCE.getXPATH3_59_0_0_2_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_59_0_0_2_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_59_0_0_2_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_59_0_0_2_0 = INSTANCE.getXPATH3_59_0_0_2_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_59_0_0_2_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_59_0_0_2_0_0, XPATH3_59_0_0_2_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_59_0_0_2 = INSTANCE.getXPATH3_59_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_59_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_59_0_0_2_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_59_0_0_3 = INSTANCE.getXPATH3_59_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_59_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_59_0_0 = INSTANCE.getXPATH3_59_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_59_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_59_0_0_0, XPATH3_59_0_0_1, XPATH3_59_0_0_2, XPATH3_59_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_59_0 = INSTANCE.getXPATH3_59_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_59_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_59_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * SchemaAttributeTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_59 = INSTANCE.getXPATH3_59();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_59() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSchemaAttributeTest(), XPATH3_59_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_60_0_0_0 = INSTANCE.getXPATH3_60_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_60_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("element", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_60_0_0_1 = INSTANCE.getXPATH3_60_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_60_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_60_0_0_2 = INSTANCE.getXPATH3_60_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_60_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_60_0_0 = INSTANCE.getXPATH3_60_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_60_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_60_0_0_0, XPATH3_60_0_0_1, XPATH3_60_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_60_0 = INSTANCE.getXPATH3_60_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_60_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_60_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class ElementTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_60 = INSTANCE.getXPATH3_60();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_60() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getElementTest(), XPATH3_60_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_61_0_0_0 = INSTANCE.getXPATH3_61_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_61_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("element", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_61_0_0_1 = INSTANCE.getXPATH3_61_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_61_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_61_0_0_2 = INSTANCE.getXPATH3_61_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_61_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("*", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_61_0_0_3_0_0_0 = INSTANCE.getXPATH3_61_0_0_3_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_61_0_0_3_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(",", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_61_0_0_3_0_0_1 = INSTANCE.getXPATH3_61_0_0_3_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_61_0_0_3_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_61_0_0_3_0_0_2 = INSTANCE.getXPATH3_61_0_0_3_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_61_0_0_3_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getWildcardElementTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ELEMENT_TEST__TYPE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOptionalAtomicType(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_61_0_0_3_0_0 = INSTANCE.getXPATH3_61_0_0_3_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_61_0_0_3_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_61_0_0_3_0_0_0, XPATH3_61_0_0_3_0_0_1, XPATH3_61_0_0_3_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_61_0_0_3_0 = INSTANCE.getXPATH3_61_0_0_3_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_61_0_0_3_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_61_0_0_3_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_61_0_0_3 = INSTANCE.getXPATH3_61_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_61_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_61_0_0_3_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_61_0_0_4 = INSTANCE.getXPATH3_61_0_0_4();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_61_0_0_4() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_61_0_0 = INSTANCE.getXPATH3_61_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_61_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_61_0_0_0, XPATH3_61_0_0_1, XPATH3_61_0_0_2, XPATH3_61_0_0_3, XPATH3_61_0_0_4);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_61_0 = INSTANCE.getXPATH3_61_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_61_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_61_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * WildcardElementTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_61 = INSTANCE.getXPATH3_61();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_61() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getWildcardElementTest(), XPATH3_61_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_62_0_0_0 = INSTANCE.getXPATH3_62_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_62_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("element", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_62_0_0_1 = INSTANCE.getXPATH3_62_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_62_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_62_0_0_2_0_0_0 = INSTANCE.getXPATH3_62_0_0_2_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_62_0_0_2_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameElementTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_62_0_0_2_0_0 = INSTANCE.getXPATH3_62_0_0_2_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_62_0_0_2_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_62_0_0_2_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_62_0_0_2_0_1_0 = INSTANCE.getXPATH3_62_0_0_2_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_62_0_0_2_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameElementTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_62_0_0_2_0_1 = INSTANCE.getXPATH3_62_0_0_2_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_62_0_0_2_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_62_0_0_2_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_62_0_0_2_0 = INSTANCE.getXPATH3_62_0_0_2_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_62_0_0_2_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_62_0_0_2_0_0, XPATH3_62_0_0_2_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_62_0_0_2 = INSTANCE.getXPATH3_62_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_62_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_62_0_0_2_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_62_0_0_3_0_0_0 = INSTANCE.getXPATH3_62_0_0_3_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_62_0_0_3_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(",", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace XPATH3_62_0_0_3_0_0_1 = INSTANCE.getXPATH3_62_0_0_3_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace getXPATH3_62_0_0_3_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3WhiteSpace(1, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment XPATH3_62_0_0_3_0_0_2 = INSTANCE.getXPATH3_62_0_0_3_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment getXPATH3_62_0_0_3_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Containment(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameElementTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__TYPE), org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, new EClass[] {org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOptionalAtomicType(), }, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_62_0_0_3_0_0 = INSTANCE.getXPATH3_62_0_0_3_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_62_0_0_3_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_62_0_0_3_0_0_0, XPATH3_62_0_0_3_0_0_1, XPATH3_62_0_0_3_0_0_2);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_62_0_0_3_0 = INSTANCE.getXPATH3_62_0_0_3_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_62_0_0_3_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_62_0_0_3_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_62_0_0_3 = INSTANCE.getXPATH3_62_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_62_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_62_0_0_3_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_62_0_0_4 = INSTANCE.getXPATH3_62_0_0_4();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_62_0_0_4() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_62_0_0 = INSTANCE.getXPATH3_62_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_62_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_62_0_0_0, XPATH3_62_0_0_1, XPATH3_62_0_0_2, XPATH3_62_0_0_3, XPATH3_62_0_0_4);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_62_0 = INSTANCE.getXPATH3_62_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_62_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_62_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * NameElementTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_62 = INSTANCE.getXPATH3_62();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_62() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameElementTest(), XPATH3_62_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_63_0_0_0 = INSTANCE.getXPATH3_63_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_63_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("schema-element", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_63_0_0_1 = INSTANCE.getXPATH3_63_0_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_63_0_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword("(", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_63_0_0_2_0_0_0 = INSTANCE.getXPATH3_63_0_0_2_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_63_0_0_2_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSchemaElementTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME), "QNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_63_0_0_2_0_0 = INSTANCE.getXPATH3_63_0_0_2_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_63_0_0_2_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_63_0_0_2_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_63_0_0_2_0_1_0 = INSTANCE.getXPATH3_63_0_0_2_0_1_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_63_0_0_2_0_1_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSchemaElementTest().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME), "NCNAME", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_63_0_0_2_0_1 = INSTANCE.getXPATH3_63_0_0_2_0_1();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_63_0_0_2_0_1() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_63_0_0_2_0_1_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_63_0_0_2_0 = INSTANCE.getXPATH3_63_0_0_2_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_63_0_0_2_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_63_0_0_2_0_0, XPATH3_63_0_0_2_0_1);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound XPATH3_63_0_0_2 = INSTANCE.getXPATH3_63_0_0_2();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound getXPATH3_63_0_0_2() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Compound(XPATH3_63_0_0_2_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword XPATH3_63_0_0_3 = INSTANCE.getXPATH3_63_0_0_3();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword getXPATH3_63_0_0_3() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword(")", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_63_0_0 = INSTANCE.getXPATH3_63_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_63_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_63_0_0_0, XPATH3_63_0_0_1, XPATH3_63_0_0_2, XPATH3_63_0_0_3);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_63_0 = INSTANCE.getXPATH3_63_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_63_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_63_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * SchemaElementTest
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_63 = INSTANCE.getXPATH3_63();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_63() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getSchemaElementTest(), XPATH3_63_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_64_0_0_0 = INSTANCE.getXPATH3_64_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_64_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntegerLiteral().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTEGER_LITERAL__VALUE), "INTEGER_LITERAL", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_64_0_0 = INSTANCE.getXPATH3_64_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_64_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_64_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_64_0 = INSTANCE.getXPATH3_64_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_64_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_64_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * IntegerLiteral
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_64 = INSTANCE.getXPATH3_64();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_64() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntegerLiteral(), XPATH3_64_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_65_0_0_0 = INSTANCE.getXPATH3_65_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_65_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDecimalLiteral().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DECIMAL_LITERAL__VALUE), "DECIMAL_LITERAL", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_65_0_0 = INSTANCE.getXPATH3_65_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_65_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_65_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_65_0 = INSTANCE.getXPATH3_65_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_65_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_65_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * DecimalLiteral
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_65 = INSTANCE.getXPATH3_65();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_65() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDecimalLiteral(), XPATH3_65_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_66_0_0_0 = INSTANCE.getXPATH3_66_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_66_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDoubleLiteral().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOUBLE_LITERAL__VALUE), "DOUBLE_LITERAL", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_66_0_0 = INSTANCE.getXPATH3_66_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_66_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_66_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_66_0 = INSTANCE.getXPATH3_66_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_66_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_66_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * DoubleLiteral
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_66 = INSTANCE.getXPATH3_66();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_66() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDoubleLiteral(), XPATH3_66_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder XPATH3_67_0_0_0 = INSTANCE.getXPATH3_67_0_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder getXPATH3_67_0_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Placeholder(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStringLiteral().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL__VALUE), "STRING_LITERAL", org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, 0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence XPATH3_67_0_0 = INSTANCE.getXPATH3_67_0_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence getXPATH3_67_0_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Sequence(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_67_0_0_0);
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice XPATH3_67_0 = INSTANCE.getXPATH3_67_0();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice getXPATH3_67_0() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Choice(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE, XPATH3_67_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * StringLiteral
	 */
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule XPATH3_67 = INSTANCE.getXPATH3_67();
	private org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule getXPATH3_67() {
		return new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getStringLiteral(), XPATH3_67_0, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Cardinality.ONE);
	}
	
	
	public static String getSyntaxElementID(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (Field field : org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement) org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule[] RULES = new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule[] {
		XPATH3_0,
		XPATH3_1,
		XPATH3_2,
		XPATH3_3,
		XPATH3_4,
		XPATH3_5,
		XPATH3_6,
		XPATH3_7,
		XPATH3_8,
		XPATH3_9,
		XPATH3_10,
		XPATH3_11,
		XPATH3_12,
		XPATH3_13,
		XPATH3_14,
		XPATH3_15,
		XPATH3_16,
		XPATH3_17,
		XPATH3_18,
		XPATH3_19,
		XPATH3_20,
		XPATH3_21,
		XPATH3_22,
		XPATH3_23,
		XPATH3_24,
		XPATH3_25,
		XPATH3_26,
		XPATH3_27,
		XPATH3_28,
		XPATH3_29,
		XPATH3_30,
		XPATH3_31,
		XPATH3_32,
		XPATH3_33,
		XPATH3_34,
		XPATH3_35,
		XPATH3_36,
		XPATH3_37,
		XPATH3_38,
		XPATH3_39,
		XPATH3_40,
		XPATH3_41,
		XPATH3_42,
		XPATH3_43,
		XPATH3_44,
		XPATH3_45,
		XPATH3_46,
		XPATH3_47,
		XPATH3_48,
		XPATH3_49,
		XPATH3_50,
		XPATH3_51,
		XPATH3_52,
		XPATH3_53,
		XPATH3_54,
		XPATH3_55,
		XPATH3_56,
		XPATH3_57,
		XPATH3_58,
		XPATH3_59,
		XPATH3_60,
		XPATH3_61,
		XPATH3_62,
		XPATH3_63,
		XPATH3_64,
		XPATH3_65,
		XPATH3_66,
		XPATH3_67,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new LinkedHashSet<String>();
			for (org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Rule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement element, Set<String> keywords) {
		if (element instanceof org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword) {
			keywords.add(((org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3Keyword) element).getValue());
		} else if (element instanceof org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3BooleanTerminal) {
			keywords.add(((org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3BooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3BooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal) {
			org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal terminal = (org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3EnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3SyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
