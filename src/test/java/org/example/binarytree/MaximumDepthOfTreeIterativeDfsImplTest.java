package org.example.binarytree;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfTreeIterativeDfsImplTest {
    private MaximumDepthOfTreeIterativeDfsImpl underTest;

    @BeforeEach
    void setUp() {
         underTest = new MaximumDepthOfTreeIterativeDfsImpl();
    }

    @Test
    void maxDepth() {
        TreeNode r6 = new TreeNode(6, null, null);
        TreeNode r3 = new TreeNode(3, null, r6);
        TreeNode r2 = new TreeNode(2, null, null);
        TreeNode root = new TreeNode(1, r2, r3);

        Assertions.assertEquals(3, underTest.maxDepth(root));
    }
}