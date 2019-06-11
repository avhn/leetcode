class Solution {

    /**
     * Time complexity: O(n).
     * Space complexity: O(n).
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
