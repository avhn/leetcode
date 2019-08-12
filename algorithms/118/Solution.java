import java.util.List;
import java.util.ArrayList;

class Solution {

    /**
     * Time and space complexity: O(n^2)
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
