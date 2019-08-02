class Solution {

    /**
     * Helper method for countAndSay.
     * Generate new sequence from given string.
     *
     * @param oldSequence String
     * @return new sequence
     * @see String
     */
    private String generateSequence(String oldSequence) {
        StringBuilder result = new StringBuilder();

        char current = oldSequence.charAt(0);
        int streak = 1;
        for (int i = 1; i < oldSequence.length(); i++) {
            if (current == oldSequence.charAt(i)) {
                streak += 1;
            } else {    // append to result and reset streak
                result.append(streak);
                result.append(current);

                current = oldSequence.charAt(i);
                streak = 1;
            }
        }
        result.append(streak);
        result.append(current);

        return result.toString();
    }

    /**
     * Generate nth sequence starting from "1".
     *
     * Time complexity: O(n^3), where n is rank of the sequence.
     * Space complexity: O(1).
     *
     * @param n rank of sequence to return
     * @return sequence
     * @see String
     */
    public String countAndSay(int n) {
        String sequence = "1";
        for (int i = 2; i <= n; i++) {
            sequence = generateSequence(sequence);
        }
        return sequence;
    }
}
