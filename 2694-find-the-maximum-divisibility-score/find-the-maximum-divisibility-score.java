import java.util.Arrays;

class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        Arrays.sort(divisors);
        
        int maxScore = 0;
        int maxDivisor = divisors[0]; // Initialize with the minimum divisor
        
        for (int divisor : divisors) {
            int score = 0;
            
            for (int num : nums) {
                if (num % divisor == 0) {
                    score++;
                }
            }
            
            if (score > maxScore) {
                maxScore = score;
                maxDivisor = divisor;
            } else if (score == maxScore) {
                maxDivisor = Math.min(maxDivisor, divisor);
            }
        }
        
        return maxDivisor;
    }
}
