package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfImplTest {
    private ProductOfArrayExceptSelfImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new ProductOfArrayExceptSelfImpl();
    }

    @Test
    void productExceptSelf() {
        int[] res = underTest.productExceptSelf(new int[]{1,2,3,4});

        int[] expected = new int[]{24, 12, 8, 6};

        for (int i = 0; i < res.length; i++) {
            Assertions.assertEquals(expected[i], res[i]);
        }
    }
}