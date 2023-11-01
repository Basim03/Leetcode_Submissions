class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      ArrayList<Integer> ans=new ArrayList<>();
      int i=0;
while(i!=nums.length)
{
    int correct=nums[i]-1;
    if(nums[i]!=nums[correct])
    {
        swap(i,correct,nums);
    }
    else 
    {
        i++;
    }

}
for( i=0;i<nums.length;i++)
{
    if(nums[i]!=i+1)
    ans.add(i+1);
}
return ans;

    }
public static void swap(int i,int j,int nums[])
{
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}
}