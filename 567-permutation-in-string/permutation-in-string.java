class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Edge case: if s1 is longer than s2, it's impossible for s2 to contain a permutation of s1
        if (s1.length() > s2.length()) {
            return false;
        }

        // Arrays to store the frequency count of characters
        int[] s1Count = new int[26]; // Frequency count of characters in s1
        int[] s2Count = new int[26]; // Frequency count of characters in current window of s2

        // Fill the frequency array for s1 and the first window in s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Now, slide the window over s2, checking at each step
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            // If the frequency counts match, we found a permutation
            if (matches(s1Count, s2Count)) {
                return true;
            }

            // Slide the window: add the next character in s2 to the current window
            s2Count[s2.charAt(i + s1.length()) - 'a']++;
            // Remove the first character of the previous window
            s2Count[s2.charAt(i) - 'a']--;
        }

        // Check the last window
        return matches(s1Count, s2Count);
    }

    // Helper method to compare two frequency count arrays
    private boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) {
                return false;
            }
        }
        return true;
    }
}
