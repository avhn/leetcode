class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
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
