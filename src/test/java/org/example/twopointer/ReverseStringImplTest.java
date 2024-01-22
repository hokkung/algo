package org.example.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringImplTest {
    private ReverseStringImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new ReverseStringImpl();
    }

    @Test
    void reverseString() {
        char[] a = new char[]{'h','e','l','l','o'};
        char[] expect = new char[]{'o','l','l','e','h'};

        underTest.reverseString(a);

        for (int i = 0; i < a.length; i++) {
            Assertions.assertEquals(expect[i], a[i]);
        }
    }
}