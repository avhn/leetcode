import java.util.ArrayList;
import java.util.List;

class Solution {

    /**
     * Time and space complexity: O(n)
     */
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                list.add(i % 3 == 0 ? ("Fizz" + (i % 5 == 0 ? "Buzz" : "")) : "Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
