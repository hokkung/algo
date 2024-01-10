package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramImplTest {

    private ValidAnagramImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new ValidAnagramImpl();
    }

    @Test
    void isAnagram() {
        Assertions.assertTrue(underTest.isAnagram("anagram", "nagaram"));

        Assertions.assertFalse(underTest.isAnagram("rat", "car"));
    }
}