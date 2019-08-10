class Solution {

    /**
     * Find column number of the excel sheet with given column title.
     *
     * Time complexity: O(n), where n is length of String.
     * Space complexity: O(1).
     *
     * @param s column title
     * @return column number
     */
    public int titleToNumber(String s) {
        int column = 0;
        int period = 1; // stands for Math.pow(character number, 0)
        char[] array = s.toCharArray();
        for (int i = array.length - 1; 0 <= i; i--) {
            column += (array[i] - 'A' + 1) * period;
            period *= 26;
        }
        return column;
    }
}
