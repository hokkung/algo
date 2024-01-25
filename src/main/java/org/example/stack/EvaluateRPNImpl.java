package org.example.stack;

import java.util.Stack;

public class EvaluateRPNImpl implements EvaluateRPN {
    @Override
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+": {
                    stack.add(stack.removeLast() + stack.removeLast());
                    continue;
                }
                case "-": {
                    Integer a = stack.removeLast();
                    Integer b = stack.removeLast();
                    stack.add(b-a);
                    continue;
                }
                case "*": {
                    stack.add(stack.removeLast() * stack.removeLast());
                    continue;
                }
                case "/": {
                    Integer a = stack.removeLast();
                    Integer b = stack.removeLast();
                    stack.add(b/a);
                    continue;
                }
                default: {
                    stack.add(Integer.parseInt(token));
                }
            }
        }
        return stack.removeLast();
    }
}
