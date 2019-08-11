class Solution {

    /**
     * Find maximum profit for buying and selling stocks consecutively.
     *
     * Time complexity: O(n), where n is length of array.
     * Space complexity: O(1).
     *
     * @param prices array
     * @return maximum profit
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
