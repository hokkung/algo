package org.example.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchImplTest {
    private BinarySearchImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new BinarySearchImpl();
    }

    @Test
    void search() {
        Assertions.assertEquals(3, underTest.search(new int[]{0, 3, 10, 15, 27, 41}, 15));

        Assertions.assertEquals(7, underTest.search(new int[]{-1, 3, 10, 15, 27, 50, 67, 100}, 100));

        Assertions.assertEquals(-1, underTest.search(new int[]{-1, 3, 10, 15, 27, 50, 67, 100}, 101));
    }
}