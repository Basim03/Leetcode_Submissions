class Solution {
    public int numIdenticalPairs(int[] nums) {
        int counter=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
            if(nums[i] == nums[j] && i<j)
            counter+=1;
            }
        }
         return counter;
    }
   
}