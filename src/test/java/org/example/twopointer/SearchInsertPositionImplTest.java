package org.example.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionImplTest {
    private SearchInsertPositionImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new SearchInsertPositionImpl();
    }

    @Test
    void searchInsert() {
        Assertions.assertEquals(3, underTest.searchInsert(new int[] { 1, 3, 5, 7 ,9 }, 6));
    }
}