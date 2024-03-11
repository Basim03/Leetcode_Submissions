import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        BigInteger number = BigInteger.ZERO;
        List<Integer> ans = new ArrayList<>();

        // Convert num array to a BigInteger
        for (int i = 0; i < num.length; i++) {
            number = number.multiply(BigInteger.TEN).add(BigInteger.valueOf(num[i]));
        }

        // Add k to the number
        number = number.add(BigInteger.valueOf(k));

        // Convert number back to an array
        while (!number.equals(BigInteger.ZERO)) {
            ans.add(number.mod(BigInteger.TEN).intValue());
            number = number.divide(BigInteger.TEN);
        }

        // Reverse the list to get the correct order
        List<Integer> ans2 = new ArrayList<>();
        for (int i = ans.size() - 1; i >= 0; i--) {
            ans2.add(ans.get(i));
        }
        return ans2;
    }
}
