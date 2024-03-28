class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int localcount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                localcount++;

            }
            else
            {
                count=Math.max(count,localcount);
                localcount=0;
            }
            
        }
        return Math.max(count,localcount);
    }
}