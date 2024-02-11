package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordImplTest {
    private LengthOfLastWordImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new LengthOfLastWordImpl();
    }

    @Test
    void lengthOfLastWord() {
        Assertions.assertEquals(6, underTest.lengthOfLastWord("luffy is still joyboy"));
    }
}