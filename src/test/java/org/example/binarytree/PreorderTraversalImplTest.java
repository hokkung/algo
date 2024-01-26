package org.example.binarytree;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreorderTraversalImplTest {
    private PreorderTraversalImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new PreorderTraversalImpl();
    }

    @Test
    void preorderTraversal() {
        TreeNode left2 = new TreeNode(2, null, null);
        TreeNode left4 = new TreeNode(4, null, null);
        TreeNode right5 = new TreeNode(5, null, null);
        TreeNode right3 = new TreeNode(3, left4, right5);
        TreeNode root = new TreeNode(1, left2, right3);

        List<Integer> res = underTest.preorderTraversal(root);

        Assertions.assertEquals(5, res.size());
        for (int i = 0; i < res.size(); i++) {
            Assertions.assertEquals(i+1, res.get(i));
        }
    }
}