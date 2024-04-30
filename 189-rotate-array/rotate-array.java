class Solution {
    public void rotate(int[] nums, int k) {
        int rotate=0;
        if(k>nums.length)
        {
        rotate=k%nums.length;
        }
       else 
       {
        rotate=k;
       }
       int arr[]=new int[nums.length]; 
       int f=0;
       for(int i=nums.length-rotate;i<nums.length;i++)
    {
      arr[f++]=nums[i];
    }
    for(int i=0;i<nums.length-rotate;i++)
    {
        arr[f++]=nums[i];

    }
    for(int i=0;i<nums.length;i++)
    {
        nums[i]=arr[i];
    }

    }
}