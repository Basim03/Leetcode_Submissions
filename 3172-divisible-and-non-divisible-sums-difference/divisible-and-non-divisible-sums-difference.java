class Solution {
  public int differenceOfSums(int n, int m) {
    int difference = 0;
    
    for (int i = 1; i <= n; i++) {
        if (i % m == 0) {
            difference -= i;  // Subtracting i if divisible by m
        } else {
            difference += i;  // Adding i if not divisible by m
        }
    }
    
    return difference;

    }
}