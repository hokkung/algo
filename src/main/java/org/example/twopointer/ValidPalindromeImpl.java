package org.example.twopointer;

public class ValidPalindromeImpl implements ValidPalindrome {
    @Override
    public boolean isPalindrome(String s) {
        String pattern = "[^0-9a-zA-Z]";
        s = s.replaceAll(pattern, "");
        s = s.replaceAll("\\s", "").toLowerCase();

        if (s.isEmpty()) {
            return true;
        }

        int size = s.length();
        int mid = size /  2;
        for (int i = 0; i < mid; i++) {
            if (s.charAt(i) != s.charAt(size-i-1)) {
                return false;
            }
        }

        return true;
    }
}
