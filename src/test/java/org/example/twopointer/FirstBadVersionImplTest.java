package org.example.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionImplTest {
    private FirstBadVersionImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new FirstBadVersionImpl();
    }

    @Test
    void firstBadVersion() {
        Assertions.assertEquals(5, underTest.firstBadVersion(9));


        Assertions.assertEquals(5, underTest.firstBadVersion(948932));
    }
}