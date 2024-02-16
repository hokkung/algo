package org.example.heap;

import java.util.PriorityQueue;

public class KthLargestInSteam {
    private PriorityQueue<Integer> heap;
    private int k;
    public KthLargestInSteam(int k, int[] nums) {
        this.heap = new PriorityQueue<>();
        this.k = k;

        for (int n : nums) {
            this.heap.add(n);
        }

        while ( this.heap.size() > this.k) {
            this.heap.poll();
        }
    }

    public int add(int val) {
        this.heap.add(val);
        if (this.heap.size() > this.k) {
            this.heap.poll();
        }

        return this.heap.peek();
    }
}
