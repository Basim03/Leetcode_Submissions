class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans=gcd(nums[0],nums[nums.length-1]);
        return ans;
    }

     public static int gcd(int a, int b) {
        // Base case
        if (b == 0) {
            return a;
        }
        
        // Recursive case
        return gcd(b, a % b);
    }
}