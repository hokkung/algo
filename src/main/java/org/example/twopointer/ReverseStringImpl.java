package org.example.twopointer;

public class ReverseStringImpl implements ReverseString {
    @Override
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length -1;

        while (l < r) {
            char lv = s[l];
            char rv = s[r];
            s[l] = rv;
            s[r] = lv;
            l++;
            r--;
        }
    }
}
