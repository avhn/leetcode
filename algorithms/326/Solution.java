class Solution {

    /**
     * 3 is a prime number, therefore it's powers can only be divided by
     * their lower or equal powers.
     * Integer.MAX_INT = 3^19.56, 3^19 = 1162261467.
     *
     * Time and space complexity: O(1)
     */
    public boolean isPowerOfThree(int n) {
       return 0 < n && 1162261467 % n == 0;
    }
}
