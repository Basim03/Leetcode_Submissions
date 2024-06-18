class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int local = 0;

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                local++;
            }
        }
        ans = local;

        // Slide the window from left to right
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                local++;
            }
            if (isVowel(s.charAt(i - k))) {
                local--;
            }
            ans = Math.max(ans, local);
        }

        return ans;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
