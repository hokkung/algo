package org.example.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstOccurrenceStrImplTest {
    private FirstOccurrenceStrImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new FirstOccurrenceStrImpl();
    }

    @Test
    void strStr() {
        int actual = underTest.strStr("sadbutsad", "sad");


        Assertions.assertEquals(0, actual);
    }
}