package org.example.slidewindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingReplacementImpl implements LongestRepeatingReplacement {
    @Override
    public int characterReplacement(String s, int k) {
        Map<String, Integer> c = new HashMap<>();
        int res = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            Integer cur = c.get(s.substring(r, r + 1));
            if (cur == null) {
                cur = 0;
            }
            c.put(s.substring(r, r + 1), cur+1);

            int maxFromC = 0;
            for (Integer m : c.values()) {
                maxFromC = Math.max(maxFromC, m);
            }

            while (((r-l+1) - maxFromC) > k) {
                Integer curL = c.get(s.substring(l, l + 1));
                c.put(s.substring(l, l + 1), curL -1);
                l++;
            }
            res = Math.max(res, r - l + 1);


        }

        return res;
    }
}
