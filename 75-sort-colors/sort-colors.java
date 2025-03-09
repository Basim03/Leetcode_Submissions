class Solution {
    public void sortColors(int[] nums) {
        // int min=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<nums.length;j++)
            {

                if(nums[min]>nums[j])
                {
                   min=j;
                }
            }
            swap(nums,i,min);
        }
    }
    public static void swap(int[] nums,int a, int b)
    {
      int temp=nums[a];
      nums[a]=nums[b];
      nums[b]=temp;
    }
}