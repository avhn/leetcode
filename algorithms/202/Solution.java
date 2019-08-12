import java.util.HashSet;

class Solution {

    /**
     * Time and space complexity: O(1)
     *
     * Maximum 16 iterations for positive integers, and for every iteration,
     * we calculate sum of maximum of 10 digits.
     */
    public boolean isHappy(int n) {
        return withFloydCycleDetection(n);
    }

    private boolean withFloydCycleDetection(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = calculateSum(slow);
            fast = calculateSum(fast);
            fast = calculateSum(fast);
        } while (slow != 1 && slow != fast);
        return slow == 1;
    }

    private boolean withHashSet(int n) {
        HashSet<Integer> visited = new HashSet<>();
        while (visited.add(n)) {
            n = calculateSum(n);
        }
        return n == 1;
    }

    /**
     * Calculate sum of a decimal's every digits' squared values.
     *
     * Time and space complexity: O(1)
     */
    private int calculateSum(int n) {
        int sum = 0;
        while (0 < n) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}
