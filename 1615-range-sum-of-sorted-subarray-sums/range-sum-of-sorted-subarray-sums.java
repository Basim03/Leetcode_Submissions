class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int arr[]=new int[(n*(n+1))/2];
         int MOD = 1_000_000_007;
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                arr[index++]=sum;
            }
        }
        System.out.println(Arrays.toString(arr));
int ans=0;
Arrays.sort(arr);
         for (int i = left - 1; i < right; i++) {
            ans = (ans + arr[i]) % MOD;
        }

        return (int) ans;
    }
}