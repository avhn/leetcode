class Solution {

    /**
     * Time complexity: O(n), where n is length of longest string
     * Space complexity: O(1)
     */
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int sum;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (0 <= i || 0 <= j || 0 < carry) {
            sum = carry;
            sum += 0 <= i && a.charAt(i--) == '1' ? 1 : 0;
            sum += 0 <= j && b.charAt(j--) == '1' ? 1 : 0;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        return result.toString();
    }
}
