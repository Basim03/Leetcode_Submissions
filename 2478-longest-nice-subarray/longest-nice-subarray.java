class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLength = 0;
        int currentLength = 0;
        int currentMask = 0;
        int start = 0;
        
        for (int end = 0; end < nums.length; end++) {
            // Ensure no two numbers in the window share a bit set to 1
            while ((currentMask & nums[end]) != 0) {
                currentMask ^= nums[start];
                start++;
            }
            
            // Add current number to the mask
            currentMask |= nums[end];
            
            // Update the maximum length
            currentLength = end - start + 1;
            maxLength = Math.max(maxLength, currentLength);
        }
        
        return maxLength;
    }
}
