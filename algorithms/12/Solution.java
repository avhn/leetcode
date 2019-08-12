class Solution {

    /**
     * Time Complexity: O(n), where n is the number of roman characters
     * Space complexity: O(1)
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
