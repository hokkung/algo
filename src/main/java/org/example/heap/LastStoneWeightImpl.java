package org.example.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeightImpl implements LastStoneWeight {
    @Override
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            q.add(s);
        }

        while (q.size() > 1) {
            int firstMax = q.poll();
            int secMax = q.poll();

            if (firstMax != secMax) {
                int n = firstMax - secMax;
                q.add(n);
            }
        }

        if (q.isEmpty()) {
            return 0;
        }

        return q.poll();
    }
}
