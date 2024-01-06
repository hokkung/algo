package org.example.array;

import lombok.AllArgsConstructor;
import org.example.common.Executor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class TwoSumImpl implements TwoSum {
    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            Integer index = diffToIndex.get(diff);
            if (index != null) {
                return new int[] {index, i};
            } else {
                diffToIndex.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
