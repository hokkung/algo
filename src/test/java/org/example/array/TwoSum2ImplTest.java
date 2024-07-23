package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum2ImplTest {
    private TwoSum2Impl underTest;

    @BeforeEach
    void setUp() {
        underTest = new TwoSum2Impl();
    }

    @Test
    void testTwoSum() {
        int[] input = new int[]{2,7,11,15};

        int[] act = underTest.twoSum(input, 9);

        Assertions.assertEquals(2, act.length);
        Assertions.assertEquals(1, act[0]);
        Assertions.assertEquals(2, act[1]);
    }
}
