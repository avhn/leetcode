class Solution {

    /**
     * Time complexity: O(n).
     * Space complexity: O(n).
     * Runtime: 1 ms, faster than 99.98% of Java online submissions for Remove Duplicates from Sorted Array.
     * Memory Usage: 39.4 MB, less than 94.58% of Java online submissions for Remove Duplicates from Sorted Array.
     *
     * @param nums array of numbers
     * @return length of modified array
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }
}
