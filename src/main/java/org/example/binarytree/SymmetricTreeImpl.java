package org.example.binarytree;

import com.sun.source.tree.Tree;
import org.example.common.TreeNode;

public class SymmetricTreeImpl implements SymmetricTree {
    @Override
    public boolean isSymmetric(TreeNode root) {

        return this.isSameTree(root.left, root.right);
    }

    public boolean isSameTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null) {
            return false;
        }
        if (right == null) {
            return false;
        }
        return left.val == right.val &&
                this.isSameTree(left.left, right.right) &&
                this.isSameTree(left.right, right.left);
    }
}
