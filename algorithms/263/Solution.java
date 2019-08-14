class Solution {

    /**
     * Time complexity: O(log n)
     * Space complexity: O(1)
     */
    public boolean isUgly(int n) {
        if (n == 0) return false;
        else if (n == 1) return true;

        int[] validFactors = new int[]{2, 3, 5};
        for (int factor : validFactors){
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
