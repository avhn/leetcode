class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public String getHint(String secret, String guess) {
        int A = 0;
        int B = 0;
        int[][] count = new int[2][10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                A++;
            } else {
                count[0][secret.charAt(i) - '0'] += 1;
                count[1][guess.charAt(i) - '0'] += 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            B += Math.min(count[0][i], count[1][i]);
        }
        return A + "A" + B + "B";
    }
}
