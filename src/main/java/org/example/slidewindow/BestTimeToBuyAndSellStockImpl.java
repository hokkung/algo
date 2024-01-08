package org.example.slidewindow;

public class BestTimeToBuyAndSellStockImpl implements BestTimeToBuyAndSellStock {
    @Override
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profitIfSoldToday = prices[i] - minPrice;
            if (profitIfSoldToday > maxProfit) {
                maxProfit = profitIfSoldToday;
            }
        }
        return maxProfit;
    }
}
