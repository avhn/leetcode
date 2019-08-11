class Solution {

    /**
     * Find how many distinct ways are there to climb
     * an n staired stairway, using dp with bottop up approach.
     *
     * Time complexity: O(n).
     * Space complexity: O(n).
     *
     * @param n stair count on the stairway
     * @return number of distinct ways to climb the stairway
     */
    public int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
