package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementImpl implements MajorityElement {
    @Override
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int lastestMaxCount = 1;
        Map<Integer, Integer> count = new HashMap<>();

        for ( int i = 0; i<nums.length; i++) {
            Integer c = count.get(nums[i]);

            if (c == null) {
                c = 1;
            } else {
                c++;
            }


            if (c > lastestMaxCount) {
                lastestMaxCount = c;
                res = nums[i];
            }

            count.put(nums[i], c);
        }

        return res;
    }
}
