class Solution {

    /**
     * Time and space complexity: O(n)
     */
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        else if (len == 1) return nums[0];

        // recurrence relation: dp(i) = max(value(i) + dp(i - 2), dp(i - 1))
        // build dp table bottom-up
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], dp[0]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[len - 1];
    }
}
