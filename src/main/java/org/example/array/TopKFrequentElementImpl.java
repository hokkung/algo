package org.example.array;

import java.util.*;

public class TopKFrequentElementImpl implements TopKFrequentElement {
    @Override
    public int[] topKFrequent(int[] nums, int k) {
        int numSize = nums.length;
        Map<Integer, Integer> indexToSums = new HashMap<>();
        List<List<Integer>> frq = new ArrayList<>();
        for (int i = 0; i < numSize; i++) {
            frq.add(new ArrayList<>());
        }

        for (int i = 0; i < numSize; i++) {
            int key = nums[i];
            Integer val = indexToSums.get(key);
            if (val == null) {
                indexToSums.put(key, 1);
            } else {
                val++;
                indexToSums.put(key, val);
            }
        }

        for (Map.Entry<Integer, Integer> indexToSum : indexToSums.entrySet()) {
            List<Integer> ls = frq.get(indexToSum.getValue()-1);
            ls.add(indexToSum.getKey());
        }

        List<Integer> res = new ArrayList<>();
        for (int j = numSize -1; j >= 0; j--) {
            List<Integer> items = frq.get(j);
            for (Integer item : items) {
                res.add(item);
                if (res.size() == k) {
                    int[] res2 = new int[k];
                    for (int l = 0; l < k; l++) {
                        res2[l] = res.get(l);
                    }
                    return res2;
                }
            }
        }

        return new int[0];
    }
}
