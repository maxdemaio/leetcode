package array;

/*
Approach:
To find the max profit, we use a sliding window approach w/ two pointers:
p1 for the buying day and p2 for the selling day.
We start with p1 as the first day and p2 as the second day.
By comparison, we calculate the profit and update the max profit accordingly.
We slide the window forward by moving p1 and p2 (if p2 < p1), always moving p2
ensuring we always consider the best buying and selling opportunities.
This technique is useful for maximizing profits in sequential data problems like stock prices.

Time complexity:
The time complexity of the algorithm is O(n), where n is the length of the prices array.
We iterate through the array once, performing a constant-time operation at each iteration.
Therefore, the time complexity is linear with respect to the input size.

Space complexity:
The space complexity of the algorithm is O(1), indicating constant space usage.
We only use a few variables which require constant space.
Thus, the space complexity does not depend on the input size.

Extra notes:
*/

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // Variable to store the maximum profit
        if (prices.length < 2) {
            // If there are fewer than 2 prices, return 0 as no transaction is possible
            return maxProfit;
        }

        int p1 = 0; // Pointer 1 to track the buying day
        int p2 = 1; // Pointer 2 to track the selling day
        while (p2 < prices.length) {
            int currProfit = prices[p2] - prices[p1]; // Calculate the current profit by selling on p2 and buying on p1
            if (currProfit > maxProfit) {
                maxProfit = currProfit; // Update maxProfit if the current profit is greater
            }
            if (prices[p2] < prices[p1]) {
                // If the price on p2 is lower than p1, update the buying day to p2
                p1 = p2;
            }
            p2++; // Move the selling day pointer to the next day
        }
        return maxProfit; // Return the maximum profit achieved
    }
}
