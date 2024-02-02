class Solution {
    public int maximumCount(int[] nums) {
        
        // Initializing both the count variable by 0.
        int Positive_Count = 0;
        int Negative_Count = 0;

        for (int i = 0; i < nums.length ; i++) {
            
            // We got the negative number
            if (nums[i] < 0) {

                Negative_Count += 1;

            } else if (nums[i] > 0){ // We got the positive number.

                Positive_Count += 1;
            }
        }

        // Maximum count will be assigned to the ans. 
        int ans = Math.max (Negative_Count , Positive_Count);

        return ans;
    }
}