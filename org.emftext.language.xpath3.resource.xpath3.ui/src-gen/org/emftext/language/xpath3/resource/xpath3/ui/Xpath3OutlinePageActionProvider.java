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

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.action.IAction;

public class Xpath3OutlinePageActionProvider {
	
	public List<IAction> getActions(org.emftext.language.xpath3.resource.xpath3.ui.Xpath3OutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		List<IAction> defaultActions = new ArrayList<IAction>();
		defaultActions.add(new org.emftext.language.xpath3.resource.xpath3.ui.Xpath3OutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.emftext.language.xpath3.resource.xpath3.ui.Xpath3OutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.xpath3.resource.xpath3.ui.Xpath3OutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.xpath3.resource.xpath3.ui.Xpath3OutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.emftext.language.xpath3.resource.xpath3.ui.Xpath3OutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.emftext.language.xpath3.resource.xpath3.ui.Xpath3OutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
