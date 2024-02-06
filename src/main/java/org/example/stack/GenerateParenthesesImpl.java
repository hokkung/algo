package org.example.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class GenerateParenthesesImpl implements GenerateParentheses {

    @Override
    public List<String> generateParenthesis(int n) {
        List<String> stack = new ArrayList<>();
        List<String> res = new ArrayList<>();

        backtrack(0, 0, n, stack, res);

        return res;
    }

    private void backtrack(int op, int cl, int n, List<String> stack, List<String> res) {
        if ((op == n) && (cl == n))  {
            res.add(String.join("", stack));
            return;
        }

        if (op < n) {
            stack.add("(");
            backtrack(op + 1, cl, n, stack, res);
            stack.removeLast();
        }

        if (cl < op) {
            stack.add(")");
            backtrack(op, cl + 1, n, stack, res);
            stack.removeLast();
        }
    }


}
