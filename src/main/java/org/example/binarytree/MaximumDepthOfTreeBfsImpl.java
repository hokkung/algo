package org.example.binarytree;

import org.example.common.TreeNode;

import java.util.*;

public class MaximumDepthOfTreeBfsImpl implements MaximumDepthOfTree {
    @Override
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int dep = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            dep++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.removeLast();
                if (node != null) {
                    if (node.right != null) {
                        queue.addFirst(node.right);
                    }

                    if (node.left != null) {
                        queue.addFirst(node.left);
                    }
                }
            }
        }
        return dep;
    }
}
