package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixImplTest {

    private LongestCommonPrefixImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new LongestCommonPrefixImpl();
    }

    @Test
    void longestCommonPrefix() {
        String actual = underTest.longestCommonPrefix(new String[]{"flower","flow","flight"});


        Assertions.assertEquals("fl", actual);
    }
}