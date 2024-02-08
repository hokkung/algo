package org.example.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementImplTest {
    private RemoveElementImpl underTest;


    @BeforeEach
    void setUp() {
        underTest = new RemoveElementImpl();
    }

    @Test
    void removeElement() {
        int[] nums = new int[]{3,2,2,3};

        int actual = underTest.removeElement(nums, 3);

        int[] expectedNums = new int[]{2,2};
        Assertions.assertEquals(2, actual);

        for (int i = 0; i < actual; i++) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }
}