package org.example.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeImplTest {
    private ValidPalindromeImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new ValidPalindromeImpl();
    }

    @Test
    void isPalindrome() {
        Assertions.assertTrue(underTest.isPalindrome("A man, a plan, a canal: Panama"));
        Assertions.assertTrue(underTest.isPalindrome(", ,:"));
        Assertions.assertFalse(underTest.isPalindrome(", ,:fesfsfesdd"));
    }
}