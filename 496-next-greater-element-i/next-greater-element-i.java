class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int [nums1.length];
        int ans=-1;
        for(int i=0;i<nums1.length;i++)
        {
            int current=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
if(current==nums2[j])
{
for(int k=j;k<nums2.length;k++)
{
    if(nums2[k]>current)
    {
    ans=nums2[k];
    break;
    }
}

}
            }
            arr[i]=ans;
            ans=-1;
        }
        return arr;
    }
}