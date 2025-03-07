class Solution {
    public int[] closestPrimes(int left, int right) {
       List<Integer> list=new ArrayList<>();
       int num1=0;
       int num2=0;
       for(int i=left;i<=right;i++)
    {
        if(isPrime(i))
    {
        list.add(i);
    }
    }
    if(list.size()<2)
    {
    return new int[]{-1,-1};
    }
    int m=Integer.MAX_VALUE;
    for(int i=1;i<list.size();i++)
    {
int diff=list.get(i)-list.get(i-1);
if(diff<m)
{
    m=diff;
    num1=list.get(i-1);
    num2=list.get(i);
}

    }
    return new int[]{num1,num2};

       
    }
    
     private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}