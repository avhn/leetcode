import java.util.ArrayList;
import java.util.List;

class Solution {
    char[][] buttonMap = {
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };

    /**
     * Time Complexity: O(4^n), where n is length of digits.
     *
     * @param digits digits of buttons
     * @return combinations as String values
     * @see List
     */
    public List<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<>();

        char[] charArray = digits.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int button = charArray[i] - '2';

            if (i == 0) {
                // initialization
                for (int j = 0; j < buttonMap[button].length; j++) {
                    result.add(String.valueOf(buttonMap[button][j]));
                }
            } else {
                // cartesian multiplication
                ArrayList<String> newResult = new ArrayList<>();
                for (int r = 0; r < result.size(); r++) {
                    for (int j = 0; j < buttonMap[button].length; j++) {
                        String currChar = String.valueOf(buttonMap[button][j]);
                        newResult.add(result.get(r) + currChar);
                    }
                }
                result = newResult;
            }
        }

        return result;
    }
}
