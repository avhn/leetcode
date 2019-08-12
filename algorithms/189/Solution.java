class Solution {

    /**
     * Time complexity: O(n), where n is length of the array.
     * Space complexity: O(1)
     */
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int c = 0;  // count of swaps performed
        int temp;   // swap element

        for (int i = 0; c < len && i < k; i++) {
            int j = i;
            int carry = nums[i];
            do {
                j = (j + k) % len;
                temp = nums[j];
                nums[j] = carry;
                carry = temp;
                // i == j, loop overlapped, start again with i++
                // ++c == len, all swaps performed, terminate
            } while (++c < len && i != j);
        }
    }
}
