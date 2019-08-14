class Solution {

    public int addDigits(int num) {
        return digitalRoot(num);
    }

    /**
     * Maximum of 3 iterations needed, time complexity
     * isn't related to n.
     *
     * Time and space complexity: O(1)
     */
    private int withLoops(int num) {
        int sum;
        while (9 < num) {
            sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    /**
     * Using congruence formula.
     *
     * Time and space complexity: O(1)
     */
    private int digitalRoot(int num) {
        return 1 + (num - 1) % 9;
    }
}
