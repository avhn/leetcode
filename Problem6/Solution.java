import java.util.ArrayList;


class Solution {

    /**
     * Time complexity: O(n).
     * Runtime: 16 ms, faster than 99.35% of Java online submissions for ZigZag Conversion.
     * Memory Usage: 39.3 MB, less than 88.70% of Java online submissions for ZigZag Conversion.
     *
     * @param s String to convert
     * @param numRows Decimal, number of rows
     * @return converted String
     * @see String
     */
    public String convert(String s, int numRows) {
        int currRow, i;
        String result = "";
        ArrayList<String> Rows = new ArrayList<>();
        for (currRow = 0; currRow < numRows; currRow++) Rows.add("");

        // calculate result in while loop
        i = 0; // i, index of current char at s
        while (i < s.length()) {
            // forward
            for (currRow = 0; currRow < numRows && i < s.length();) {
                Rows.set(currRow, Rows.get(currRow++) + s.charAt(i++));
            }
            // backward, do not include last and first rows
            for (currRow = numRows - 2; 0 < currRow && i < s.length();) {
                Rows.set(currRow, Rows.get(currRow--) + s.charAt(i++));
            }
        }

        // retrieve result
        for (currRow = 0; currRow < numRows; currRow++) result += Rows.get(currRow);
        return result;
    }
}
