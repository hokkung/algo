package org.example.array;

import java.util.*;

public class GroupAnagramsImpl implements GroupAnagrams {
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<String> engChars = Set.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

        Map<String, List<String>> result = new HashMap<>();
        for (String str : strs) {
            Map<String, Integer> charToNums = new HashMap<>(26);
            for (int i = 0; i < str.length(); i++) {
                String c = str.substring(i, i+1);
                Integer num = charToNums.get(c);
                if (num != null) {
                    charToNums.put(c, num+1);
                    continue;
                }
                charToNums.put(c, 1);
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (String engChar : engChars) {
                Integer keyCharToNum = charToNums.get(engChar);
                if (keyCharToNum != null) {
                    keyBuilder.append(engChar).append(keyCharToNum);
                    continue;
                }
                keyBuilder.append(engChar).append("0");
            }

            String key = keyBuilder.toString();
            List<String> words = result.get(key);
            if (words != null) {
                words.add(str);
                result.put(key, words);
                continue;
            }

            result.put(key, new ArrayList<>(List.of(str)));
        }

        return new ArrayList<>(result.values());
    }
}
