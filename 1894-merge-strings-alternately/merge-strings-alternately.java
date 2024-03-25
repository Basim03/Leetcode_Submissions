class Solution {
  public String mergeAlternately(String word1, String word2) {
    String ans = "";
    int i = 0;
    int j = 0;

    while (i < word1.length() && i < word2.length()) {
      ans += word1.charAt(i);
      ans += word2.charAt(i);
      i++;
    }

    if (i < word1.length()) {
      for (; i < word1.length(); i++) {
        ans += word1.charAt(i);
      }
    }

    if (i < word2.length()) {
      for (; i < word2.length(); i++) {
        ans += word2.charAt(i);
      }
    }

    return ans;
  }
}
