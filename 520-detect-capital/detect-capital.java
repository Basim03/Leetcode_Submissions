class Solution {
    public boolean detectCapitalUse(String word) {
if(word.length()==1)
{
    return true;
}
        boolean ans;
char first=word.charAt(0);
char second=word.charAt(1);

if(Character.isLowerCase(first))
{
        for(int i=1;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch))
            return false;
        
        }
}

 else if(Character.isUpperCase(second))
        for(int i=2;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch))
            return false;
        
        }
         else{
                for(int i=1; i<word.length(); i++){
                    if(word.charAt(i) - 'A' < 32) return false;
                }
            }

return true;
    }
}