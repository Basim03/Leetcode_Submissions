class Solution {
    public int fib(int n) {
        int ans=FindAns(n);
        return ans;
        
    }
    public static int FindAns(int n)
    {
        if(n==1)
        {
            return 1;

        }
        if(n==0)
        {
            return 0;
        }
        return FindAns(n-1)+FindAns(n-2);
    }
}