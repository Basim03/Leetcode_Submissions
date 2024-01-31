import java.util.Arrays;
class Solution {
    public String sortSentence(String s) {
                String[] wordsArray = s.split(" ");
                String newArray[]=new String[wordsArray.length];
           for(String words : wordsArray)
              {
                int length=words.length();
                char ch=words.charAt(length-1);
                int pos=ch-'0';
                pos-=1;
                               

                newArray[pos]= words.substring(0, words.length() - 1);;
                

              }
              s="";

              for(int i=0;i<newArray.length;i++)
              {
                  s+=newArray[i]+" ";
              }
              s=s.trim();
              return s;
    }

}