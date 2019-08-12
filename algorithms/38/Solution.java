class Solution {

    /**
     * Time complexity: O(n^3)
     * Space complexity: O(1)
     */
    public String countAndSay(int n) {
        String sequence = "1";
        for (int i = 2; i <= n; i++) {
            sequence = generateSequence(sequence);
        }
        return sequence;
    }

    /**
     * Helper method for countAndSay.
     * Generate new sequence from given string.
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
}
