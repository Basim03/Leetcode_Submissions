class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {  // Use .equals() to check for empty string
            return 0;
        }
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {  // Correct the loop condition to use 'j'
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;  // Found the needle in the haystack
            }
        }
        
        return -1;  // Needle not found in haystack
    }
}
