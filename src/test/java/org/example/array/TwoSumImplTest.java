package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumImplTest {
    private TwoSumImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new TwoSumImpl();
    }

    @Test
    void twoSum() {
        int[] result = underTest.twoSum(new int[] {2,7,11,15}, 9);

        Assertions.assertArrayEquals(new int[] {0, 1}, result);
    }

    @Test
    void twoSum2() {
        int[] result = underTest.twoSum(new int[] {3,2,4}, 6);

        Assertions.assertArrayEquals(new int[] {1, 2}, result);
    }

    @Test
    void twoSum3() {
        int[] result = underTest.twoSum(new int[] {3,3}, 6);

        Assertions.assertArrayEquals(new int[] {0, 1}, result);
    }
}