class Solution {
    public boolean isThree(int n) {
       int counter=0;
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
           counter++;
       } 


       return counter==3;
    }
}