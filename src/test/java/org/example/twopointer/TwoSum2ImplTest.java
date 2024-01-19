package org.example.twopointer;

import org.hamcrest.Matchers;
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
    void twoSum() {
        int[] res = underTest.twoSum(new int[] {2,7,11,15}, 9);
        int[] expect = new int[] {1,2};

        for (int i = 0; i < expect.length; i++) {
            Assertions.assertEquals(expect[i], res[i]);
        }
    }
}