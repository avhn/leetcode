class Solution {

    /**
     * If n is multiple of 4, second player can make you two's movements
     * sum of 4. Therefore, other player will be the first one to reach 0.
     * If n is not multiple of 4, first player can make n multiple of 4 and
     * use the same technique to beat second player.
     *
     * Time and space complexity: O(1)
     */
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    /**
     * Recurrence relation: DP[i] = not (DP[i - 1] and DP[i - 2] and DP[i - 3])
     * DP[i] represents if the current player at n = i can win the game.
     * When you make any move, 1 to 3, and other player can win every time, you lose.
     *
     * Time and space complexity: O(n)
     */
    public boolean withDp(int n) {
        if (n < 4) return true;
        // build dp table bottom-up
        boolean[] dp = new boolean[n + 1];
        dp[1] = true;
        dp[2] = true;
        dp[3] = true;
        for (int i = 4; i <= n; i++) {
            dp[i] = !(dp[i - 1] && dp[i - 2] && dp[i - 3]);
        }
        return dp[n];
    }
}
