class Solution {

    /**
     * Time and space complexity: O(max(n, m)), where n and m are length of the Strings
     */
    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) return addStrings(num2, num1);
        StringBuilder sum = new StringBuilder();
        char[] array1 = num1.toCharArray();
        char[] array2 = num2.toCharArray();
        int carry = 0;
        for (int i = 1; i <= array1.length; i++) {
            carry += array1[array1.length - i] - '0'
                    + (0 <= array2.length - i ? array2[array2.length - i] - '0' : 0);
            sum.append(carry % 10);
            carry /= 10;
        }
        if (carry != 0) sum.append(carry);
        return sum.reverse().toString();
    }
}
