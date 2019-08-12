class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
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
