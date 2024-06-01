class Solution {
    public int scoreOfString(String s) {
        int ans=0;
int current=0;
int next=0;
        for(int i=0;i<s.length()-1;i++)
        {
            current=(int)(s.charAt(i));
            next=(int)(s.charAt(i+1));
            ans+=Math.abs(current-next);

        }
        return ans;
    }
}