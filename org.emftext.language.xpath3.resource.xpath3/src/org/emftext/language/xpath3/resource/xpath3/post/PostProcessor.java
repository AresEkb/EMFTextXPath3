/**
 * Copyright (c) 2013, 2014 Denis Nikiforov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Denis Nikiforov - initial API and implementation
 */
package org.emftext.language.xpath3.resource.xpath3.post;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.xpath3.AnyExpr;
import org.emftext.language.xpath3.AxisStep;
import org.emftext.language.xpath3.ParenthesizedExpr;
import org.emftext.language.xpath3.PathExpr;
import org.emftext.language.xpath3.resource.xpath3.IXpath3OptionProvider;
import org.emftext.language.xpath3.resource.xpath3.IXpath3Options;
import org.emftext.language.xpath3.resource.xpath3.IXpath3ResourcePostProcessor;
import org.emftext.language.xpath3.resource.xpath3.IXpath3ResourcePostProcessorProvider;
import org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3Resource;

public class PostProcessor implements IXpath3OptionProvider,
IXpath3ResourcePostProcessorProvider, IXpath3ResourcePostProcessor {

    @Override
    public void process(Xpath3Resource resource) {
        simplifyExpressions(resource);
    }

    @Override
    public void terminate() {
    }

    @Override
    public IXpath3ResourcePostProcessor getResourcePostProcessor() {
        return this;
    }

    @Override
    public Map<?, ?> getOptions() {
        return Collections.singletonMap(
                IXpath3Options.RESOURCE_POSTPROCESSOR_PROVIDER, this);
    }

    public static void simplifyExpressions(Resource resource) {
        simplifyDown(resource.getContents());
    }

    private static void simplifyDown(EList<EObject> parentList) {
        for (EObject child : new BasicEList<EObject>(parentList)) {
            EObject singleContained = getSingleContained(child);
            EObject next = singleContained;
            EObject path = null;
            while (next != null) {
                next = getSingleContained(singleContained);
                if (next != null) {
                    singleContained = next;
                    if (singleContained instanceof PathExpr) {
                        path = singleContained;
                    }
                }
            }
            // AxisStep must be contained in PathExpr
            if (AxisStep.class.isInstance(singleContained)) {
                singleContained = path;
            }
            if (singleContained != null) {
                EcoreUtil.replace(child, singleContained);
                child = singleContained;
            }
            simplifyDown(child.eContents());
        }
    }

    private static EObject getSingleContained(EObject parent) {
        if (!(parent instanceof AnyExpr)) {
            return null;
        }
        if (parent instanceof ParenthesizedExpr) {
            return null;
        }

        EObject singleContained = null;
        for (EObject contained : parent.eContents()) {
            if (singleContained != null) {
                return null;
            }
            singleContained = contained;
        }

        EReference feature = parent.eContainmentFeature();
        if (feature != null && !feature.getEType().isInstance(singleContained)) {
            return null;
        }

        return singleContained;
    }
}
