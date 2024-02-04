public class Solution{
public int countValidWords(String sentence) {
    
    if(sentence.length()==0) return 0;
    
    String[] str = sentence.strip().split("\\s+");  //Dont forget to use strip function to remove extra spaces at starting and end and then split about spaces
    int count = 0;
    
	for(String s : str){                      //Check for each token if its valid
        if(isValid(s))  count++;
    }
    
    return count;
}

public boolean isValid(String s){
    
    int hyphen = 0;
    
    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
            
        if(Character.isDigit(ch)) return false;      //Digits are not allowed
        
        if(Character.isLowerCase(ch)) continue;     //if lower case alphabet present then nothing to do
        
        if (ch == '-') {
            if (++hyphen > 1) return false;      //more than one hyphen is invalid
            
            if (i - 1 < 0 || !Character.isLowerCase(s.charAt(i-1)) || i + 1 >= s.length() 
                || !Character.isLowerCase(s.charAt(i+1))) return false;    //hyphen should be sorrounded by lower case alphabets
        }
        else if (i != s.length() - 1) return false;    //punctuation mark is allowed only at the end of token
    }
    
    return true;   //all the conditions satisfied
}
}