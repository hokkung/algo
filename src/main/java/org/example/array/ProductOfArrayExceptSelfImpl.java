package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrayExceptSelfImpl implements ProductOfArrayExceptSelf {
    @Override
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int cur = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = cur;
            cur = nums[i] * cur;
        }

        cur = 1;
        for (int i = nums.length -1; i >= 0; i--) {
            res[i] = cur * res[i];
            cur = cur * nums[i];
        }

        return res;
    }
}
