package org.example.twopointer;

public class SearchInsertPositionImpl implements SearchInsertPosition {
    @Override
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
        while (l <= r) {
            int m = (r - l) + l;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m -1;
            }
        }
        return l;
    }
}
