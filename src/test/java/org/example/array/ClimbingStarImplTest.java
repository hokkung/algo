package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStarImplTest {

    private ClimbingStarImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new ClimbingStarImpl();
    }

    @Test
    void process() {
        Assertions.assertEquals(55, underTest.process(9));
        Assertions.assertEquals(3, underTest.process(3));
    }
}
