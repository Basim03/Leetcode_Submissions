class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1=0,sum2=0;
    for(int i=1;i<=n;i++)
    {
        if(i%m==0)
        sum2+=i;
        else if(i%m!=0)
        sum1+=i;
    }
    System.out.println(sum1+" "+sum2);
    return sum1-sum2;
    }
}