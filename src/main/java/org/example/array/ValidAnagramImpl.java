package org.example.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagramImpl implements ValidAnagram {
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<String, Integer> sMap = new HashMap<>();
        Map<String, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String cur = s.substring(i, i+1);
            if (!sMap.containsKey(cur)) {
                sMap.put(cur, 1);
            } else {
                Integer curVal = sMap.get(cur);
                sMap.put(cur, curVal + 1);
            }

            String cur2 = t.substring(i, i+1);
            if (!tMap.containsKey(cur2)) {
                tMap.put(cur2, 1);
            } else {
                Integer curVal2 = tMap.get(cur2);
                tMap.put(cur2, curVal2 + 1);
            }
        }

        for (Map.Entry<String, Integer> sItem : sMap.entrySet()) {
            String key = sItem.getKey();
            if (!Objects.equals(tMap.get(key), sItem.getValue())) {
                return false;
            }
        }

        return true;
    }
}
