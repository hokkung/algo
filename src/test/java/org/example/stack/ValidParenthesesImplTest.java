package org.example.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesImplTest {
    private ValidParenthesesImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new ValidParenthesesImpl();
    }

    @Test
    void isValid() {
        Assertions.assertTrue(underTest.isValid("()"));
        Assertions.assertTrue(underTest.isValid("()[]{}"));
        Assertions.assertFalse(underTest.isValid("(]"));
        Assertions.assertTrue(underTest.isValid("((({[]})))"));
        Assertions.assertFalse(underTest.isValid("((({(]})))"));
    }
}