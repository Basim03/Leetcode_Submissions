class Solution {
    public int subsetXORSum(int[] nums) {
        int ans=0;
        int sum;
        int totalSubsets = 1 << nums.length; // 2^n subsets

        for(int i=0;i<totalSubsets;i++)
        {
            sum=0;
            for(int j=0;j<nums.length;j++)
            {                
                if ((i & (1 << j)) != 0) {
                sum ^= nums[j];
                }

            }
            ans+=sum;
        }
        return ans;
    }
}