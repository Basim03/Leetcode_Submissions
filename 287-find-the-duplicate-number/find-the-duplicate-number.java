class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int ans=0;
        while(i!=nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                swap(nums,i,correct);
            }
            else
            {
            i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for( i=0;i<nums.length;i++)
        {
            
            if(i+1!=nums[i])
            {
            ans=nums[i];
            break;
            }
        }
        return ans;
    }
    public static void swap(int [] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;

    }
}