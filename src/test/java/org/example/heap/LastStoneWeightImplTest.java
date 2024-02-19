package org.example.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightImplTest {

    private LastStoneWeightImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new LastStoneWeightImpl();
    }

    @Test
    void lastStoneWeight() {
        Assertions.assertEquals(1, underTest.lastStoneWeight(new int[]{2,7,4,1,8,1}));

        Assertions.assertEquals(1, underTest.lastStoneWeight(new int[]{1}));
    }
}
