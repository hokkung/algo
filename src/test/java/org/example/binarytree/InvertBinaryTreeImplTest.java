package org.example.binarytree;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeImplTest {

    private InvertBinaryTreeImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new InvertBinaryTreeImpl();
    }

    @Test
    void invertTree() {
        TreeNode l2 = new TreeNode(2, null, null);
        TreeNode r3 = new TreeNode(3, null, null);
        TreeNode root = new TreeNode(1, l2, r3);

        TreeNode actual = underTest.invertTree(root);

        Assertions.assertEquals(r3, actual.getLeft());
        Assertions.assertEquals(l2, actual.getRight());
    }
}