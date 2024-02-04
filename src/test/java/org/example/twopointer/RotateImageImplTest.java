package org.example.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageImplTest {
    private RotateImageImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new RotateImageImpl();
    }

    @Test
    void rotate() {
        int[][] actual = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        underTest.rotate(actual);

        int[][] expect = new int[][]{{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};

        for (int i = 0; i < expect.length; i++) {
            for (int j = 0; j < expect.length; j++) {
                Assertions.assertEquals(expect[i][j], actual[i][j]);
            }
        }
    }
}