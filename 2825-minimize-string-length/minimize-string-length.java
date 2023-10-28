class Solution {
    public int minimizedStringLength(String s) {
         HashSet<String> set=new HashSet(); 
         for(int i=0;i<s.length();i++)
         {
             String ch=s.charAt(i)+"";
             ch=ch.trim();
             set.add(ch);
         } 
         return set.size();
    }
}