package org.example.stack;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;



@AllArgsConstructor
public class MinStackImpl implements MinStack {
    private List<Integer> stacks;
    private List<Integer> orderedStacks;


    @Override
    public void push(int val) {
        this.stacks.add(val);
        if (!orderedStacks.isEmpty()) {
            Integer min = orderedStacks.getLast();
            if (val > min) {
                this.orderedStacks.add(min);
                return;
            }
        }

        this.orderedStacks.add(val);
    }

    @Override
    public void pop() {
        this.stacks.removeLast();
        this.orderedStacks.removeLast();
    }

    @Override
    public int top() {
        return this.stacks.getLast();
    }

    @Override
    public int getMin() {
        return this.orderedStacks.getLast();
    }
}
