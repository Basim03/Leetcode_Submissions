public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    //   String ans=Binary(n);
     int counter=0;
        while(n!=0)
        {
            // int d=n%2;
            counter++;
            n&=(n-1);
            
        }
      
       String s="";
    //    for(int i=0;i<s.length();i++)
    //    {
    //         char ch=s.charAt(i);
    //         if(ch=='1')
    //         counter++;
    //    }
    //    System.out.println(ans);
       return counter;
    }


    public String Binary(int n)
    {
        String ans="";
      
        return ans;
}
}