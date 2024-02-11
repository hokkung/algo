package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWordImpl implements LengthOfLastWord {
    @Override
    public int lengthOfLastWord(String s) {
        List<String> arr = new ArrayList<>();
        String cur = "";
        for (int i = 0; i < s.length(); i++) {
            String w = s.substring(i, i+1);
            if (!" ".equals(w)) {
                cur += w;
            } else if (!"".equals(cur)) {
                arr.add(cur);
                cur = "";
            }
        }

        if (!"".equals(cur)) {
            arr.add(cur);
        }

        return arr.getLast().length();
    }
}
