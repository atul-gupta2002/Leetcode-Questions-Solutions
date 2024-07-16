class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price
            } else {
                int profit = prices[i] - minPrice; // Calculate the potential profit
                if (profit > maxProfit) {
                    maxProfit = profit; // Update the maximum profit
                }
            }
        }

        return maxProfit;
    }
}
