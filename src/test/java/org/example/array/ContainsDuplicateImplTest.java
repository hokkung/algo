package org.example.array;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateImplTest {
    private ContainsDuplicateImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new ContainsDuplicateImpl();
    }

    @Test
    void testContainsDuplicate() {
        boolean result = underTest.containsDuplicate(new int[]{1,2,3,1});

        assertTrue(result);

        boolean result2 = underTest.containsDuplicate(new int[]{1,2,3,4});

        assertFalse(result2);

        boolean result3 = underTest.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});

        assertTrue(result);
    }
}