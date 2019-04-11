import java.util.Stack;


class Solution {

    /**
     * Time Complexity: O(n).
     * Runtime: 1 ms, faster than 99.68% of Java online submissions for Valid Parentheses.
     * Memory Usage: 35.6 MB, less than 37.02% of Java online submissions for Valid Parentheses.
     *
     * @param s String to examine parentheses in
     * @return boolean value indicating validity of s
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.add(c);
            } else if (c == '}' || c == ')' || c == ']') {
                Character pop = (stack.isEmpty()) ? null : stack.pop();

                // ASCII codes of two similar parentheses at most differs by 2
                // and closing parentheses are the bigger ones
                if (pop == null || c - pop < 0 || c - pop > 2) return false;
            }
        }
        return stack.isEmpty();
    }
}
