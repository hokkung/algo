package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateImpl implements ContainsDuplicate {
    @Override
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = valueToIndex.get(nums[i]);
            if (index != null) {
                return true;
            }
            valueToIndex.put(nums[i], i);
        }
        return false;
    }
}
