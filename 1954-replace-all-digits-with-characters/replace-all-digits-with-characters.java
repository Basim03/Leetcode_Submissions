class Solution {
    public String replaceDigits(String s) {
        char prev=s.charAt(0);
        char[] ans = s.toCharArray();
        for(int i=1;i<s.length();i+=2)
        {
          char c=(char)(s.charAt(i-1)+s.charAt(i)-'0');
         ans[i]=c;
        }
        return new String(ans);
    }
    public static char Shift(char c,int n)
    {
        return (char)(c+n);
    }
}