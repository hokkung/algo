package org.example.array;

public class MaximumSubArrayImpl implements MaximumSubArray {
    @Override
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += nums[i];
            max = Math.max(curSum, max);
        }
        return max;
    }
}
