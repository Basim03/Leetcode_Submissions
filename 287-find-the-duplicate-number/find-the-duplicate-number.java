class Solution {
    public int findDuplicate(int[] nums) {
        int arr[]=new int[nums.length];
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];

        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])

{            ans=arr[i];
break;
}
            
        }
        return ans;
    }

}