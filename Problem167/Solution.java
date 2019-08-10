class Solution {

    /**
     * Find two numbers in an ascending array those
     * add up to the given target using sliding window
     * technique.
     *
     * Time complexity: O(n), where n is length of the array.
     * Space complexity: O(1).
     *
     * @param numbers sorted array
     * @param target decimal number
     * @return found two indexes as an array
     */
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int diff = target - (numbers[l] + numbers[r]);
            if (diff == 0) return new int[]{++l, ++r};
            else if (diff > 0) l++;
            else r--;
        }
        return new int[0];
    }
}
