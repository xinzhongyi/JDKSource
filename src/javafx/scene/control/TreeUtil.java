/*
 * Copyright (c) 2012, 2015, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.scene.control;

import java.util.List;

/**
 * A package protected util class used by TreeView and TreeTableView to reduce
 * the level of code duplication.
 */
class TreeUtil {
    
    static <T> int getExpandedDescendantCount(TreeItem<T> node, boolean treeItemCountDirty) {
        if (node == null) return 0;
        if (node.isLeaf()) return 1;
        
        return node.getExpandedDescendentCount(treeItemCountDirty);
    }
    
    static int updateExpandedItemCount(TreeItem treeItem, boolean treeItemCountDirty, boolean isShowRoot) {
        if (treeItem == null) {
            return 0;
        } else if (! treeItem.isExpanded()) {
            return 1;
        } else {
            int count = getExpandedDescendantCount(treeItem, treeItemCountDirty);
            if (! isShowRoot) count--;

            return count;
        }
    }

    static <T> TreeItem<T> getItem(TreeItem<T> parent, int itemIndex, boolean treeItemCountDirty) {
        if (parent == null) return null;

        // if itemIndex is 0 then our parent is what we were looking for
        if (itemIndex == 0) return parent;

        // if itemIndex is > the total item count, then it is out of range
        if (itemIndex >= getExpandedDescendantCount(parent, treeItemCountDirty)) return null;

        // if we got here, then one of our descendants is the item we're after
        List<TreeItem<T>> children = parent.getChildren();
        if (children == null) return null;
        
        int idx = itemIndex - 1;

        TreeItem<T> child;
        for (int i = 0, max = children.size(); i < max; i++) {
            child = children.get(i);
            if (idx == 0) return child;
            
            if (child.isLeaf() || ! child.isExpanded()) {
                idx--;
                continue;
            }
            
            int expandedChildCount = getExpandedDescendantCount(child, treeItemCountDirty);
            if (idx >= expandedChildCount) {
                idx -= expandedChildCount;
                continue;
            }

            TreeItem<T> result = getItem(child, idx, treeItemCountDirty);
            if (result != null) return result;
            idx--;
        }

        // We might get here if getItem(0) is called on an empty tree
        return null;
    }
    
    static <T> int getRow(TreeItem<T> item, TreeItem<T> root, boolean treeItemCountDirty, boolean isShowRoot) {
        if (item == null) {
            return -1;
        } else if (isShowRoot && item.equals(root)) {
            return 0;
        }
        
        int row = 0;
        TreeItem<T> i = item;
        TreeItem<T> p = item.getParent();
        
        TreeItem<T> sibling;
        List<TreeItem<T>> siblings;
        boolean parentIsCollapsed = false;
        
        while (!i.equals(root) && p != null) {
            if (!p.isExpanded()) {
                parentIsCollapsed = true;
                break;
            }

            siblings = p.children;
            
            // work up each sibling, from the current item
            int itemIndex = siblings.indexOf(i);
            for (int pos = itemIndex - 1; pos > -1; pos--) {
                sibling = siblings.get(pos);
                if (sibling == null) continue;
                
                row += getExpandedDescendantCount(sibling, treeItemCountDirty);
                
                if (sibling.equals(root)) {
                    if (! isShowRoot) {
                        // special case: we've found out that our sibling is 
                        // actually the root node AND we aren't showing root nodes.
                        // This means that the item shouldn't actually be shown.
                        return -1;
                    }
                    return row;
                }
            }
            
            i = p;
            p = p.getParent();
            row++;
        }
        
        return (p == null && row == 0) || parentIsCollapsed ? -1 : isShowRoot ? row : row - 1;
    }
}
