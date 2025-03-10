class Solution {
    public boolean isAnagram(String s, String t) {
 char c[]=s.toCharArray();
 char []b=t.toCharArray();   
 Arrays.sort(c);
 
 Arrays.sort(b);
return Arrays.equals(c,b);

  }
}