class Solution {
    public int[] twoSum(int[] arr, int target) {
        int nums[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
for(int j=i+1;j<arr.length;j++)
{
    if(arr[i]+arr[j]==target)
    {
        return new int[]{i,j};
    }
    }
            }
        return nums;
        
    }
}