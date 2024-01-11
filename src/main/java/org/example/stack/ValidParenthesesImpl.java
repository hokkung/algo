package org.example.stack;

import java.util.*;

public class ValidParenthesesImpl implements ValidParentheses {
    @Override
    public boolean isValid(String s) {
        Map<String, String> parentheses = new HashMap<>();
        parentheses.put("}", "{");
        parentheses.put("]", "[");
        parentheses.put(")", "(");

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String cur = s.substring(i, i+1);
            String leftSide = parentheses.get(cur);
            if (leftSide == null) {
                stack.add(cur);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            String lastItemInStack = stack.getLast();
            if (!Objects.equals(lastItemInStack, leftSide)) {
                return false;
            } else {
                stack.removeLast();
            }
        }

        return stack.isEmpty();
    }
}
