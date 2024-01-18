package org.example.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MinStackImplTest {
    private MinStackImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new MinStackImpl(new ArrayList<>(), new ArrayList<>());
    }

    @Test
    void testAll() {
        underTest.push(1);
        underTest.push(-1);
        underTest.push(-2);
        underTest.push(5);
        underTest.push(0);

        underTest.pop();
        underTest.pop();

        Assertions.assertEquals(-2, underTest.top());

        Assertions.assertEquals(-2, underTest.getMin());

        underTest.pop();

        Assertions.assertEquals(-1, underTest.getMin());
    }
}