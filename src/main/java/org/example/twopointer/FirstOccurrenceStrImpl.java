package org.example.twopointer;

public class FirstOccurrenceStrImpl implements FirstOccurrenceStr {
    @Override
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
             return -1;
        }
        int l = 0;
        int r = 0;
        int index = -1;

        while (r < needle.length()) {
            if (haystack.charAt(l) == needle.charAt(r)) {
                if (index == -1) {
                    index = l;
                }
                l++;
                r++;
            } else {
                if (index != -1) {
                    l = index + 1;
                } else {
                    l++;
                }
                index = -1;
                r = 0;
            }

            if (l > haystack.length() -1) {
                break;
            }

        }
        return (r < needle.length()) ? -1 : index;
    }
}
