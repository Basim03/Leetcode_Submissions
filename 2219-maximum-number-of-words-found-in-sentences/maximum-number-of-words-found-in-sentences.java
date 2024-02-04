class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
     
        for(int i=0;i<sentences.length;i++)
        {
               int localMax=0;
            String s=sentences[i];
            
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(ch==' ')
                localMax+=1;
                 if(max<localMax)
            max=localMax;
            }
           
            
        
        }
        return max+1;
    }
}