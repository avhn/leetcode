class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n), we clone String to char[]
     */
    public int myAtoi(String str) {
        double result = 0;
        byte sign = 1;

        char[] array = str.trim().toCharArray();
        boolean firstIter = true;
        for (char c : array) {
            if ('0' <= c && c <= '9') {
                result *= 10;
                result += c - '0';
            } else if (firstIter && c == '-') {
                sign = -1;
            } else if (firstIter && c == '+') {
                ;
            } else {
                break;
            }
            if (firstIter) firstIter = false;
        }

        if (result <= Integer.MAX_VALUE) {
            return (int)(sign * result);
        } else {
            if (sign < 0) return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
    }
}
