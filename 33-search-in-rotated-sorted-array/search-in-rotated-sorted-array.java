class Solution {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        // System.out.println(pivot);
    int start=0;
    int end=pivot-1;
    int start2=pivot;
    int end2=nums.length-1;
   int pos= OrderAgnosticBS(nums,start2,end2,target);
   int pos2=OrderAgnosticBS(nums,start,end,target);
   if(pos==-1)
   {
       return pos2;
   }
return pos;
    }
            public static int findPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static int OrderAgnosticBS(int nums[],int start,int end,int target)
    {
        
        while(start<=end)
        {
            int middle=start+(end-start)/2;
if(nums[middle]==target)
{
    return middle;
}
else if(target>nums[middle])
{
    start=middle+1;
}
else
{
    end=middle-1;
}
            
        }
        return -1;
    }

}