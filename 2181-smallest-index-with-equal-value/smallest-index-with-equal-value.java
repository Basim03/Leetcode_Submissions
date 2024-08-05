class Solution {
    public int smallestEqual(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int current=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           current=i%10;
           if(current==nums[i])
           {
            ans=Math.min(ans,i);
           }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
        
    }
}