class Solution {

    /**
     * One critical thing to improve practical runtime is using indexOf
     * instead of invoking charAt for every char in t. Both approaches
     * traverses in "String.array[]" and time complexity is same, but
     * time cost of invoking charAt for every char to access "String.array[]"
     * makes the difference, according to source code.
     *
     * Time complexity: O(n), where n is length of larger String
     * Space complexity: O(1)
     */
    public boolean isSubsequence(String s, String t) {
        for (int i = 0, j = 0; i < s.length(); j++) {
            j = t.indexOf(s.charAt(i++), j); // move j to first appearance of s[i]
            if (j == -1) return false;
        }
        return true;
    }
}
