class Solution {
    public int countDigits(int num) {
        int newNo=num;
        int count=0;
        while(newNo!=0)
        {
            int d=newNo%10;
           if(num%d==0)
           count++;
           newNo/=10;
        }
        return count;
    }
}