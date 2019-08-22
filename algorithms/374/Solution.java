/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {

    /**
     * Time complexity: O(log n)
     * Space complexity: O(1)
     */
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int m;
        int g;
        do {
            m = l + (r - l) / 2;
            g = guess(m);
            if (g < 0) {
                r = m - 1;
            } else if (0 < g) {
                l = m + 1;
            }
        } while (l < r && g != 0);
        // l == r means, result is r and m isn't computed yet
        return l < r ? m : r;
    }
}
