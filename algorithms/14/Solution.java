class Solution {

    /**
     * Time complexity: O(n), where n is total number of characters in the array
     * Space complexity: O(1)
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        boolean Continue = true;
        Character current;
        int i = 0;
        while (Continue) {
            current = null;
            for (String str : strs) {
                if (i == str.length()) {
                    Continue = false;
                    break;
                }
                else if (current == null) current = str.charAt(i);
                else if (current == str.charAt(i)) continue;
                else {
                    Continue = false;
                    break;
                }
            }
            i++;
        }
        return strs[0].substring(0, i - 1);
    }
}
