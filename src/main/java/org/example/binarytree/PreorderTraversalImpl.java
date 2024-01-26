package org.example.binarytree;



import org.example.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversalImpl implements PreorderTraversal {
    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode cur = root;
        List<TreeNode> stack = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                res.add(cur.getVal());
                stack.add(cur.getRight());
                cur = cur.getLeft();
            } else {
                cur = stack.removeLast();
            }
        }

        return res;
    }
}
