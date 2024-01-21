package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntImplTest {
    private RomanToIntImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new RomanToIntImpl();
    }

    @Test
    void romanToInt() {
        Assertions.assertEquals(40, underTest.romanToInt("XXXX"));
    }
}