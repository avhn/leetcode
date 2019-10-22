class Solution {
    public int arrangeCoins(int n) {
        return constantTime(n);
    }

    /**
     * Sum of the linear sequence starting from 1 is: f(n) = n * (n + 1) / 2
     * We we want is x of f(x) <= n therefore (x^2 + x) / 2 <= n
     * Solving x with the quadratic formula we get x = (-1 +- sqrt(1 + 8n)) / 2
     * We need positive values, exclude - signed square root and round double to floor as int.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    private int constantTime(int n) {
        // to activate type promotion to prevent overflow of int
        // while multiplying n with 8, convert 8 or n to double or long
        return (int) ((-1 + Math.sqrt(1 + ((double) 8)*n)) / 2);
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    private int linearTime(int n) {
        int i = 0;
        while (i < n) {
            n -= ++i;
        }
        return i;
    }
}
