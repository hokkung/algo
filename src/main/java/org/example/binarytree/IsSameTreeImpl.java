package org.example.binarytree;

import org.example.common.TreeNode;

public class IsSameTreeImpl implements IsSameTree {
    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }
        return (p.getVal() == q.getVal()) && this.isSameTree(p.getLeft(), q.getLeft()) && this.isSameTree(p.getRight(), q.getRight());
    }
}
