package array;

/**
 * @author Max DeMaio
 * Solved on 05/17/2022
 *
 * Best Time to Buy and Sell Stock II
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * Difficulty: Medium
 *
 * Approach: Buy/sell on any 2 days we can make profit with 2 pointers.
 * Since there is no taxes, and we can look at next day price, we buy/sell
 * whenever there is profit.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 */

public class BestTimeToBuyAndSellStockIi {
    public int maxProfit(int[] prices) {
        // Size needs to be at least 2 days so you can sell
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        int pa = 0;
        int pb = 1;
        int profit = 0;

        while (pa < prices.length - 1) {
            if (prices[pb] > prices[pa]) {
                // buy at pa price, sell at pb price
                // we buy/sell at any possible moment
                profit += prices[pb] - prices[pa];
            }
            pb++;
            pa++;
        }
        return profit;
    }
}
