package org.example.twopointer;

public class RemoveElementImpl implements RemoveElement {
    @Override
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length -1;
        while (l <= r) {
            if (nums[l] == val) {
                if (nums[r] != val) {
                    int right = nums[r];
                    nums[r] = nums[l];
                    nums[l] = right;
                    l++;
                    r--;
                } else {
                    r--;
                }
            } else {
                l++;
            }
        }
        return l;
    }
}
