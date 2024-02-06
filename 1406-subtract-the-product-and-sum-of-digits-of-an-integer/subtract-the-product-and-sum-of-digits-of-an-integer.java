class Solution {
    public int subtractProductAndSum(int n) {
       int prod=Product(n);
       int sum=Sum(n);
       return prod-sum; 
    }

    public static int Product(int n)
    {
        int sum=1;
        while(n!=0)
        {
            int d=n%10;
            sum*=d;
            n/=10;
        }
        return sum;
    }
      public static int Sum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
}