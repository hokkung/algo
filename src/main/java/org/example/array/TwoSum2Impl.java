package org.example.array;

public class TwoSum2Impl implements TwoSum2 {
    @Override
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int diff = nums[r] + nums[l];
            if (diff > target) {
                r -= 1;
            } else if (diff < target) {
                l += 1;
            } else {
                return new int[]{l+1, r+1};
            }
        }
        return new int[0];
    }
}
