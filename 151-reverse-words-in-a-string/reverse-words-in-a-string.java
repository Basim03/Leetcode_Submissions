class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ans="";
        String arr[]=s.split(" ");
       for(int i=arr.length-1;i>=0;i--)
       {
        if(!arr[i].isEmpty())
        if(i==0)          
ans+=arr[i];
else     
ans+=arr[i]+" ";
       }
     
       return ans;
    }
}