package org.example.binarytree;

import org.example.common.TreeNode;


// no test
public class isSubTreeImpl implements isSubTree {
    @Override
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (this.isSameTree(root, subRoot)) {
            return true;
        }

        return this.isSubtree(root.left, subRoot) || this.isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if ((root == null && subRoot != null) || (root != null && subRoot == null)) {
            return false;
        }

        return root.val == subRoot.val && this.isSameTree(root.left, subRoot.left)
                && this.isSameTree(root.right, subRoot.right);
    }

}
