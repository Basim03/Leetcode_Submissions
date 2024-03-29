class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=Reverse(num);
        int ans=Reverse(temp);
        return ans==num;

    }
    public static int Reverse(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            sum=sum*10+d;
            n/=10;
        }
        return sum;
    }
}