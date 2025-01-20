class Solution {
    public String mergeAlternately(String word1, String word2) {
      String ans="";
      int i=0,j=0,k=0;  
      int len1=word1.length();
      int len2=word2.length();
      while(i<len1 && j<len2)
      {
        ans+=word1.charAt(i);
        ans+=word2.charAt(j);
        i++;
      j++;

      }
      
        while(i<len1)
        {
            ans+=word1.charAt(i);
            i++;
        }
    
      
        while(j<len2)
        {
            ans+=word2.charAt(j);
            j++;
        }
      
      return ans;
    }
}