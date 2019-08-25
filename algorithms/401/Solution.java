import java.util.ArrayList;
import java.util.List;

class Solution {

    /**
     * Iterate over all possibilities, add matching bits to result.
     *
     * Time and space complexity: O(1)
     */
    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for (int h = 0; h < 12; h++) for (int m = 0; m < 60; m++) {
            if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
                list.add(String.format("%d:%02d", h, m));
            }
        }
        return list;
    }
}
