package org.example.slidewindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingReplacementImplTest {
    private LongestRepeatingReplacementImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new LongestRepeatingReplacementImpl();
    }

    @Test
    void characterReplacement() {
        Assertions.assertEquals(6, underTest.characterReplacement("AABBAA", 2));
    }
}