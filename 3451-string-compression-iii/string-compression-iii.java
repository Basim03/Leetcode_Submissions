class Solution {
    public String compressedString(String word) {
        String ans = "";
        int count = 1; // Start count from 1 as we are counting occurrences

        for (int i = 0; i < word.length() - 1; i++) {
            char ch = word.charAt(i);
            char next = word.charAt(i + 1);

            if (ch == next) {
                count++;
                if (count == 9) { // If count reaches 9, add it to ans and reset count
                    ans += count + "" + ch;
                    count = 0; // Reset count so it skips appending "0a"
                }
            } else {
                if (count > 0) { // Append count and character only if count > 0
                    ans += count + "" + ch;
                }
                count = 1; // Reset count to 1 for the next character sequence
            }
        }

        // Add the final character count to the result
        if (count > 0) {
            ans += count + "" + word.charAt(word.length() - 1);
        }

        return ans;
    }
}
