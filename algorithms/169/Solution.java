class Solution {

    /**
     * Find majority element using Boyer-Moore algorithm.
     *
     * Time complexity: O(n), where n is length of the array.
     * Space complexity: O(1).
     *
     * @param nums array
     * @return majority element
     */
    public int majorityElement(int[] nums) {
        int m = 0;  // current element
        int i = 0;  // counter
        for (int num : nums) {
            if (i == 0) {
                m = num;
                i = 1;
            }
            else if (m == num) i++;
            else i--;
        }
        return m;
    }
}
