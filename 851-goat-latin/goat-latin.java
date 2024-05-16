import java.util.Arrays;

class Solution {
    public String toGoatLatin(String sentence) {
        String[] str = sentence.split(" ");
        StringBuilder finalans = new StringBuilder();
        
        for (int i = 0; i < str.length; i++) {
            int k = 0;
            String word = str[i];
            char first = Character.toLowerCase(word.charAt(0));

            if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
                word += "ma";
            } else {
                word = word.substring(1) + word.charAt(0) + "ma";
            }
            
            while (k <= i) {
                word += "a";
                k++;
            }
            
            finalans.append(word).append(" ");
        }
        
        return finalans.toString().trim();
    }
}
