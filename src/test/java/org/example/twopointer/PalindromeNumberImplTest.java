package org.example.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberImplTest {
    private  PalindromeNumberImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new PalindromeNumberImpl();
    }

    @Test
    void isPalindrome() {
        Assertions.assertTrue(underTest.isPalindrome(121));

        Assertions.assertFalse(underTest.isPalindrome(-121));

        Assertions.assertTrue(underTest.isPalindrome(0));
    }
}