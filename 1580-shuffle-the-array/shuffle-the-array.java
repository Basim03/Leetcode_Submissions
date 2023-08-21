class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
    int y=nums.length/2;
    int x=0;
    int k=0;
    int j=1;
for(int i=0;i<nums.length;i++)
{
    if(i%2==0)
    {
arr[k]=nums[x];
System.out.println(k+"="+nums[x]);
x++;
k++;
    }
    else 
    {
        arr[k]=nums[y];
        System.out.println(j+"="+nums[y]);
        k++;
        y++;

    }

}
return arr;
}
}