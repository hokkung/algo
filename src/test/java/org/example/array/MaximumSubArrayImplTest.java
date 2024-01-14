package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubArrayImplTest {
    private MaximumSubArrayImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new MaximumSubArrayImpl();
    }

    @Test
    void maxSubArray() {
        Assertions.assertEquals(16, underTest.maxSubArray(new int[] {1, 9, -4, 5, -2, 7}));

        Assertions.assertEquals(6, underTest.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));

        Assertions.assertEquals(-2, underTest.maxSubArray(new int[] {-2}));
    }
}