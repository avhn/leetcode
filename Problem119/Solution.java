class Solution {

    /**
     * Return kth row in the Pascal's triangle.
     *
     * Time complexity: O(k^2), where k is the row to return.
     * Space complexity: O(k).
     *
     * @param k row of Pascal's triangle to return
     * @return list
     * @see List
     */
    public List<Integer> getRow(int k) {
        List<Integer> previous;
        List<Integer> current = new ArrayList();
        current.add(1);
        for (int i = 1; i < k + 1; i++) {   // row indexes starts from 0
            previous = current;
            current = new ArrayList();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    current.add(1);
                } else {
                    current.add(previous.get(j - 1) + previous.get(j));
                }
            }
        }
        return current;
    }
}

