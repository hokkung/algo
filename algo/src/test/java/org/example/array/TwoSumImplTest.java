package org.example.array;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumImplTest {
    private TwoSumImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new TwoSumImpl();
    }

    @Test
    void execute() {
        int[] result = underTest.twoSum(new int[] {2,7,11,15}, 9);


    }
}