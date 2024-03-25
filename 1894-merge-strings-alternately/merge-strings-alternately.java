class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int i=0;
        int j=0;
        
        while(i<word1.length() && i<word2.length())
        {
        ans=ans+word1.charAt(i);
       
        ans+=word2.charAt(i);
        i++;
        }
        if(i<word1.length())
        {
            for(int a=i;a<word1.length();a++)
                   ans=ans+word1.charAt(a);
        }
        if(i<word2.length())
         {
            for(int a=i;a<word2.length();a++)
                   ans=ans+word2.charAt(a);
        }

        System.out.println(ans);
        return ans;

    }
}