package org.example.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesImplTest {

    private GenerateParenthesesImpl underTest;

    @BeforeEach
    void setUp() {
         underTest = new GenerateParenthesesImpl();
    }

    @Test
    void generateParenthesis() {
        Assertions.assertEquals(5, underTest.generateParenthesis(3).size());
        Assertions.assertEquals(42, underTest.generateParenthesis(5).size());
    }
}