package org.example.binarytree;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSameTreeImplTest {

    private IsSameTreeImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new IsSameTreeImpl();
    }

    @Test
    void isSameTree() {
        TreeNode nl = new TreeNode(2, null, null);
        TreeNode n = new TreeNode(1, nl, null);

        TreeNode ml = new TreeNode(2, null, null);
        TreeNode m = new TreeNode(1, ml, null);

        boolean actual = underTest.isSameTree(n , m);

        Assertions.assertTrue(actual);
    }

    @Test
    void isSameTree2() {
        TreeNode nll = new TreeNode(3, null, null);
        TreeNode nl = new TreeNode(2, null, null);
        TreeNode n = new TreeNode(1, nl, nll);

        TreeNode ml = new TreeNode(2, null, null);
        TreeNode m = new TreeNode(1, ml, null);

        boolean actual = underTest.isSameTree(n , m);

        Assertions.assertFalse(actual);
    }
}