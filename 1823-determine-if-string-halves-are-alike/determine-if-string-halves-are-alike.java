class Solution {
    public boolean halvesAreAlike(String s) {
        String first = s.substring(0, s.length() / 2);
        String second = s.substring(s.length() / 2);

        int countFirst = countVowels(first);
        int countSecond = countVowels(second);

        return countFirst == countSecond;
    }

    private int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
