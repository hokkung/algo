package org.example.slidewindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockImplTest {

    private BestTimeToBuyAndSellStockImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new BestTimeToBuyAndSellStockImpl();
    }

    @Test
    void maxProfit() {
        int result = underTest.maxProfit(new int[] {7,1,5,3,6,4});

        Assertions.assertEquals(5, result);

        int result2 = underTest.maxProfit(new int[] {7,6,4,3,1});

        Assertions.assertEquals(0, result2);
    }
}