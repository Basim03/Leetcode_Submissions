class Solution {
    public String reversePrefix(String word, char ch) {
        int pos=-1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
pos=i;
break;
            }
           
        }
         if(pos==-1)
            return word;
        String reversedPrefix = Reverse(word, 0, pos);
        return reversedPrefix + word.substring(pos + 1);
    }
    public static String Reverse(String word, int start, int end) {
        StringBuilder sb = new StringBuilder();

        // Add the reversed prefix to StringBuilder
        for (int i = end; i >= start; i--) {
            sb.append(word.charAt(i));
        }

        // Return the reversed prefix as a string
        return sb.toString();
    }
}