class Solution {
    public int pivotIndex(int[] nums) {
        int ans=0;
        int local=0;
       
        for(int i=0;i<nums.length;i++)
        {
             int local2=0;
local+=nums[i];
            for(int j=i;j<nums.length;j++){
                local2+=nums[j];

            }
                            if(local==local2)
                            return i;

        }
        return -1;
    }
}