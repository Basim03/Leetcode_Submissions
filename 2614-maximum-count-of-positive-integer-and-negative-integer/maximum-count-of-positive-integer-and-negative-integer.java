class Solution {
    public int maximumCount(int[] nums) {
        int posMax=0;
        int negMax=0;
        for(int i=0;i<nums.length;i++)
        {
if(nums[i]>0)
{
    posMax+=1;
}
else if(nums[i]<0)
{
    negMax+=1;
}
else if(nums[i]==0)
continue;
        }
        return Math.max(posMax,negMax);
    }
}