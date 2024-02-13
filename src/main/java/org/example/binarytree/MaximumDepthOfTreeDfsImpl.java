package org.example.binarytree;

import org.example.common.TreeNode;

public class MaximumDepthOfTreeDfsImpl implements MaximumDepthOfTree {
    @Override
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(this.maxDepth(root.getLeft()), this.maxDepth(root.getRight()));
    }
}
