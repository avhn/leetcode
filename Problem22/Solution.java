import java.util.*;


class Solution {

    /**
     * Time Complexity: O(4^n / sqrt(n)), dataset increases in sync with Catalan Numbers.
     *
     * Using DP approach:
     * DP[n] = [for j = 0 to n do ['(' + DP[j] + ')'] * DP[n - j - 1]]
     *
     * @param n number of parenthesizations
     * @return list of Strings contains legit combinations
     * @see List
     */
    public List<String> generateParenthesis(int n) {
        // bottom up approach with memoization
        List<List<String>> DP = new ArrayList<>(n + 1);
        for (int i = 0; i < n + 1; i++) DP.add(new ArrayList<>());

        DP.get(0).add("");
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                // x = DP[j], y = DP[i - j - 1]
                // parenthesizing s, therefore -1 for index
                for (String x : DP.get(j)) {
                    for (String y : DP.get(i - j - 1)) {
                        DP.get(i).add("(" + x + ")" + y);
                    }
                }
            }
        }
        return DP.get(n);
    }

}
