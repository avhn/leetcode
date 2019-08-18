class NumArray {
    private int[] sums;

    /**
     * Time and space complexity: O(n)
     */
    public NumArray(int[] nums) {
        sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }

    /**
     * Time and space complexity: O(1)
     */
    public int sumRange(int i, int j) {
        return sums[j] - (0 < i ? sums[i - 1] : 0);
    }
}
