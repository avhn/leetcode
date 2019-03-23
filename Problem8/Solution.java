import java.lang.Character;


class Solution {

    /**
     * Time complexity O(n).
     * Runtime: 18 ms, faster than 58.59% of Java online submissions for String to Integer (atoi).
     * Memory Usage: 38.6 MB, less than 14.00% of Java online submissions for String to Integer (atoi).
     *
     * @param str String to convert to Integer
     * @return Integer value, between -2**31 <= value <= 2**31. value == 0 mostly means conversion unsuccessful.
     */
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) return 0;
        String strnum = "";
        Character c = str.charAt(0);

        // check if it's a number
        if (Character.isDigit(c)) strnum += c;
        else {
            if (c == '-' || c == '+') {
                if (1 < str.length() && Character.isDigit(str.charAt(1))) strnum += c;
                else return 0;
            } else return 0;
        }

        // add the whole number
        for (int i = 1; i < str.length(); i++) {
            c = str.charAt(i);

            if (Character.isDigit(c)) strnum += c;
            else break;
        }

        // convert and return
        try {
            return Integer.parseInt(strnum);

        } catch (NumberFormatException e) {
            if (strnum.charAt(0) == '-') return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
    }
}