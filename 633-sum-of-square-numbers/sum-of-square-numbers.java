class Solution {
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;

        long left = 0;
        long right = (long) Math.sqrt(c);  // Use long to avoid overflow issues

        while (left <= right) {
            long sum = left * left + right * right;

            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
