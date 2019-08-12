class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            else if (profit < prices[i] - min) profit = prices[i] - min;
        }
        return profit;
    }
}
