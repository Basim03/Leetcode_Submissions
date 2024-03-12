class Solution {

  public List<String> generateParenthesis(int n) {
    List<String> ans = new ArrayList<>();
    generateParentheses("", n, n, ans); // Changed function name to match
    return ans;
  }

  public static void generateParentheses(String processed, int openRemaining, int closeRemaining, List<String> result) {
    if (openRemaining == 0 && closeRemaining == 0) {
      result.add(processed);
      return;
    }

    if (openRemaining > 0) {
      generateParentheses(processed + "(", openRemaining - 1, closeRemaining, result);
    }

    if (openRemaining < closeRemaining) { // Ensure more openings than closings used so far
      generateParentheses(processed + ")", openRemaining, closeRemaining - 1, result);
    }
  }
}
