import java.util.ArrayList;

class Solution {

    /**
     * Time complexity: O(n), where n is length of s
     */
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() < 2) return s;
        int currRow, i;
        ArrayList<String> Rows = new ArrayList<>();
        for (currRow = 0; currRow < numRows; currRow++) Rows.add(""); // initialize Rows

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
        StringBuilder result = new StringBuilder();
        for (currRow = 0; currRow < numRows; currRow++) result.append(Rows.get(currRow));
        return result.toString();
    }
}
