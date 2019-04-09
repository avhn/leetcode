class Solution {

    /**
     * Return roman value of a single character.
     *
     * @param c Roman number
     * @return value of c
     */
    static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    /**
     * Time Complexity: O(n).
     * Runtime: 3 ms, faster than 100.00% of Java online submissions for Roman to Integer.
     * Memory Usage: 37.2 MB, less than 35.04% of Java online submissions for Roman to Integer.
     *
     * @param s String to convert
     * @return int value of s
     */
    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0, currValue, nextValue; i < s.length(); i++) {
            currValue = getValue(s.charAt(i));
            nextValue = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;

            if (currValue >= nextValue) {
                // single character
                sum += currValue;
            } else {
                // double characters
                sum += nextValue - currValue;
                i++;
            }
        }

        return sum;
    }
}
