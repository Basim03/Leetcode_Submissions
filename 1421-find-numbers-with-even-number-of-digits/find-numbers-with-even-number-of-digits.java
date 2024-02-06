class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
if(isEven(nums[i]))
count++;
        }
        return count;
    }
    public boolean isEven(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        return count%2==0;
    }
}