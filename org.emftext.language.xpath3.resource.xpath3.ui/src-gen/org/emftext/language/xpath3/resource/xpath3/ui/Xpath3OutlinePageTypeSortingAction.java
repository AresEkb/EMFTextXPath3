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

import org.eclipse.jface.action.IAction;

public class Xpath3OutlinePageTypeSortingAction extends org.emftext.language.xpath3.resource.xpath3.ui.AbstractXpath3OutlinePageAction {
	
	public Xpath3OutlinePageTypeSortingAction(org.emftext.language.xpath3.resource.xpath3.ui.Xpath3OutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
