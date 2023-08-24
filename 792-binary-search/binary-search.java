class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int end=nums.length-1;
        while(s<=end)
        {
             int mid=(s+end)/2;
             if(target==nums[mid]){
                 return mid;
             }
             else if(nums[mid]>target)
             end=mid-1;
             else s=mid+1;

        }
        return -1;
    }
}