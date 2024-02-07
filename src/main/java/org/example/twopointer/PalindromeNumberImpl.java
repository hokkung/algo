package org.example.twopointer;

public class PalindromeNumberImpl implements PalindromeNumber {
    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String xx = String.valueOf(x);
        int l = 0;
        int r = xx.length() - 1;

        while (l <= r) {
            if (xx.charAt(l) != xx.charAt(r)) {
                return false;
            }
            l++;
            r--;

        }

        return true;
    }
}
