package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntImpl implements RomanToInt {
    @Override
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>(7);
        m.put('M', 1000);
        m.put('D', 500);
        m.put('C', 100);
        m.put('L', 50);
        m.put('X', 10);
        m.put('V', 5);
        m.put('I', 1);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = m.get(s.charAt(i));
            if (i + 1 < s.length() && cur < m.get(s.charAt(i+1))) {
                sum -= cur;
            } else {
                sum += cur;
            }
        }
        return sum;
    }
}
