class Solution {
    /**
     * Move tail to corresponding place in array at end of every iteration. Count
     * same characters with left and right indexes, write values in-place to array
     * looking at where the tail is. Tail is the current processed length of the array.
     * 
     * Time complexity: O(n), where n is length of the array
     * Space complexity: O(1), in-place operations
     */
    public int compress(char[] chars) {
        int t = 0;
        for (int r = 0, l = r; r < chars.length; l = r, t++) {
            chars[t] = chars[l];
            while (++r < chars.length && chars[l] == chars[r])
                ;
            int count = r - l;
            if (1 < count) {
                int len = (int) Math.log10(count) + 1; // number of the decimal digits
                for (int z = len; 0 < z; z--) {
                    chars[t + z] = (char) ('0' + count % 10);
                    count /= 10;
                }
                t += len;
            }
        }
        return t;
    }
}
