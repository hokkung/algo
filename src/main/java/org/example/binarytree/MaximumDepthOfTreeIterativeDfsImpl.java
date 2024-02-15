package org.example.binarytree;

import lombok.AllArgsConstructor;
import org.example.common.TreeNode;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumDepthOfTreeIterativeDfsImpl implements MaximumDepthOfTree {

    @AllArgsConstructor
    class NodeLevel {
        public TreeNode node;
        public int dept;
    }

    @Override
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<NodeLevel> stack = new Stack<>();
        stack.add(new NodeLevel(root, 1));
        int dept = 1;

        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                NodeLevel nodeLevel = stack.removeLast();
                TreeNode node = nodeLevel.node;
                // 1
                int d = nodeLevel.dept;
                // 2
                dept = Math.max(dept, d);
                if (node.right != null) {
                    stack.add(new NodeLevel(node.right, d+1));
                }

                if (node.left != null) {
                    stack.add(new NodeLevel(node.left, d+1));
                }
            }
        }
        return dept;
    }
}
