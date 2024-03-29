class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(EvenSum(i))
            {
                count++;
            }
        }
        return count;
    }

    public static boolean EvenSum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n= n/10;
        }
        return sum%2==0;
    }
}