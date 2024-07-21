package org.example.binarytree;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeImplTest {
    private SymmetricTreeImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new SymmetricTreeImpl();

    }
    @Test
    void isSymmetric() {
        TreeNode t4 = new TreeNode(4, null, null);
        TreeNode t3 = new TreeNode(3, null, null);
        TreeNode left = new TreeNode(2, t3, t4);
        TreeNode right = new TreeNode(2, t4, t3);
        TreeNode root = new TreeNode(1, left, right);

        Assertions.assertTrue(underTest.isSymmetric(root));

        TreeNode left2 = new TreeNode(2, null, t3);
        TreeNode right2 = new TreeNode(2, null, t3);
        TreeNode root2 = new TreeNode(1, left2, right2);

        Assertions.assertFalse(underTest.isSymmetric(root2));

    }
}