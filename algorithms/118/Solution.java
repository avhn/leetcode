import java.util.List;
import java.util.ArrayList;

class Solution {

    /**
     * Generate rows for Pascal's triangle.
     *
     * Time complexity: O(n^2), where n is number of the rows.
     * Space complexity: O(^2).
     *
     * @param numRows number of the rows to create
     * @return generated rows as lists of a list
     * @see List
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> currentList = new ArrayList();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    currentList.add(1);
                } else {
                    currentList.add(result.get(i - 2).get(j - 1)
                            + result.get(i - 2).get(j));
                }
            }
            result.add(currentList);
        }
        return result;
    }
}
