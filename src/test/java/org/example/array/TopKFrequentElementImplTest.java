package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementImplTest {

    private TopKFrequentElementImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new TopKFrequentElementImpl();
    }

    @Test
    void topKFrequent() {
        int[] r1 = underTest.topKFrequent(new int[]{1}, 1);

        Assertions.assertEquals(r1, r1);

        int[] r2 = underTest.topKFrequent(new int[]{1,1,1,2,2,3}, 2);

        Assertions.assertEquals(r2, r2);
    }
}