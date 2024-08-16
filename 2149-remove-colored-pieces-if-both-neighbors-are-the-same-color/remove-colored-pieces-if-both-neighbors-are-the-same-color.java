class Solution {
    public boolean winnerOfGame(String s) {
        if(s.length()<2)
        return false;
        
        int i=1;
        int A=0;
        int B=0;
        boolean ans=true;
        while(i!=s.length()-1)
        {
            
char ch=s.charAt(i);
char prev=s.charAt(i-1);
char next=s.charAt(i+1);

if(ch=='A'&& prev==ch && next==ch)
A++;
if(ch=='B' && prev==ch && next==ch)
B++;


   i++;
            }
          return (A>B);
        }
       
}