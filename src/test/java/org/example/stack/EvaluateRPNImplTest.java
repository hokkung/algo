package org.example.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateRPNImplTest {
    private EvaluateRPNImpl underTest;


    @BeforeEach
    void setUp() {
        underTest = new EvaluateRPNImpl();
    }

    @Test
    void evalRPN() {
        int res = underTest.evalRPN(new String[]{"2","1","+","3","*"});

        Assertions.assertEquals(9, res);
    }
}