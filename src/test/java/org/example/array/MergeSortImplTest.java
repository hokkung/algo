package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortImplTest {
    private MergeSortImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new MergeSortImpl();
    }

    @Test
    void merge() {
        int[] n1 = new int[]{1,2,3,0,0,0};
        int[] expect = new int[]{1,2,3,4,5,6};

        underTest.merge(n1, 3, new int[]{4,5,6}, 3);

        for (int i = 0; i < expect.length; i++) {
            Assertions.assertEquals(expect[i], n1[i]);
        }
    }
}