package array;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length < 2) {
            return maxProfit;
        }

        int p1 = 0;
        int p2 = 1;
        while(p2 < prices.length) {
            int currProfit = prices[p2] - prices[p1];
            if (currProfit > maxProfit) {
                maxProfit = currProfit;
            } if (prices[p2] < prices[p1]) {
                // update pointers
                p1 = p2;
            }
            p2++;
        }
        return maxProfit;
    }
}
