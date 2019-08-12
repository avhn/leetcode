class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int titleToNumber(String s) {
        int column = 0;
        int period = 1;   // stands for Math.pow(character number, 0)
        char[] array = s.toCharArray();
        for (int i = array.length - 1; 0 <= i; i--) {
            column += (array[i] - 'A' + 1) * period;
            period *= 26;
        }
        return column;
    }
}
