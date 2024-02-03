package org.example.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search2DMatrixImplTest {
    private Search2DMatrixImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new Search2DMatrixImpl();
    }

    @Test
    void searchMatrix() {
        Assertions.assertTrue(underTest.searchMatrix(new int[][] {{1, 2, 3}, {4, 5, 6}}, 2));

        Assertions.assertFalse(underTest.searchMatrix(new int[][] {{1, 2, 3}, {4, 5, 6}}, 10));
    }
}