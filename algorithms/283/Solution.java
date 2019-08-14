class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public void moveZeroes(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[c++] = nums[i];
        }

        while (c < nums.length) {
            nums[c++] = 0;
        }
    }
}
