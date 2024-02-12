package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneImplTest {
    private PlusOneImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new PlusOneImpl();
    }

    @Test
    void plusOne() {
        int[] expect = new int[]{1,0,0,0};
        int[] actual = underTest.plusOne(new int[] {9,9,9});
        for ( int i = 0; i < expect.length; i++) {
            Assertions.assertEquals(expect[i], actual[i]);
        }
    }
}