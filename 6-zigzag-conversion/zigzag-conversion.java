class Solution {
  public String convert(String s, int numRows) {
    if (numRows == 1) return s;

    StringBuilder result = new StringBuilder();
    int cycle = 2 * numRows - 2; // Full cycle length (down and up)

    for (int i = 0; i < numRows; i++) {
      for (int j = i; j < s.length(); j += cycle) {
        result.append(s.charAt(j));

        // Add character on the way back up (if applicable)
        if (i > 0 && i < numRows - 1 && j + cycle - 2 * i < s.length()) {
          result.append(s.charAt(j + cycle - 2 * i));
        }
      }
    }

    return result.toString();
  }
}
