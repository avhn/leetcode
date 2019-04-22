class Solution {

    /**
     * Time complexity: O(n).
     * Space complexity: O(n).
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
     * Memory Usage: 37.1 MB, less than 96.93% of Java online submissions for Remove Element.
     *
     * @param nums array of numbers
     * @param val value to ignore
     * @return length of modified array
     */
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }
}
