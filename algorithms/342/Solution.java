class Solution {

    /**
     * There should be only one 1 and multiple of two 0s at right hand
     * side of 1 in the bits. Eliminate 0s and compare num to 1.
     * Maximum iteration number is 15.
     *
     * Time and space complexity: O(1)
     */
    public boolean isPowerOfFour(int num) {
        while (4 <= num) {
            if ((num & 3) != 0) {  // check first 2 bits
                return false;
            }
            num >>= 2;
        }
        return num == 1;
    }
}
