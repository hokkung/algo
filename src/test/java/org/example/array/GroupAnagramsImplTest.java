package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsImplTest {
    private GroupAnagramsImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new GroupAnagramsImpl();
    }

    @Test
    void groupAnagrams() {
        List<List<String>> result = underTest.groupAnagrams(new String[]{"ddddddddddg","dgggggggggg"});

        List<List<String>> a = new ArrayList<>();
        a.add(List.of("ddddddddddg"));
        a.add(List.of("dgggggggggg"));

        Assertions.assertArrayEquals(a.toArray(), result.toArray());

        List<List<String>> result2 = underTest.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        List<List<String>> b = new ArrayList<>();
        b.add(List.of("bat"));
        b.add(List.of("tan", "nat"));
        b.add(List.of("eat", "tea", "ate"));

        Assertions.assertArrayEquals(b.toArray(), result2.toArray());
    }
}