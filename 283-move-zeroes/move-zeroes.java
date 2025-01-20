class Solution {
    public void moveZeroes(int[] nums) {
    int a=0;
    int b=nums.length-1;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]!=0)
        {
nums[a]=nums[i];
a++;      
  }
    }

  for(int i=a;i<nums.length;i++)
  {
nums[i]=0;
  }
        
    }
//     public void swap(int a,int b)
// {
//     int temp;
// temp=a;
// a=b;
// b=temp; 
// }
}