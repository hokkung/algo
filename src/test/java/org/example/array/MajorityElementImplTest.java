package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementImplTest {

    private MajorityElementImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new MajorityElementImpl();
    }

    @Test
    void majorityElement() {
        int actual = underTest.majorityElement(new int[]{1,1,1,3,4,6,6});

        Assertions.assertEquals(1, actual);
    }
}