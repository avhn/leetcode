class Solution {

    /**
     * Time Complexity: O(n), where n is the number of roman characters.
     * Runtime: 3 ms, faster than 100.00% of Java online submissions for Integer to Roman.
     * Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Integer to Roman.
     *
     * @param num decimal to convert
     * @return Roman number
     * @see String
     */
    public String intToRoman(int num) {
        int[] Numeric = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] Symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Numeric.length; i++) {
            while (0 < num / Numeric[i]) {
                num -= Numeric[i];
                result.append(Symbol[i]);
            }
        }
        return result.toString();
    }
}
