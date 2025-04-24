/*
    Time: O(N)
    Space: O(1)
*/
class Solution {
    public int maxProfit(int[] prices) {
        int min_buy_price = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min_buy_price) {
                min_buy_price = prices[i];
            } else if (prices[i] - min_buy_price > profit) {
                profit = prices[i] - min_buy_price;
            }
        }
        return profit;
    }
}