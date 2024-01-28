package org.example.binarytree;

import org.example.common.TreeNode;

public class InvertBinaryTreeImpl implements InvertBinaryTree {
    @Override
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(left);

        this.invertTree(root.getLeft());
        this.invertTree(root.getRight());


        return root;
    }
}
