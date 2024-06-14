class Solution {
  public int minIncrementForUnique(int[] nums) {
    Arrays.sort(nums);
int i = 0;
    int cnt = 0;

    for (int n : nums) {
      i = Math.max(i, n);

      cnt += i++ - n;
    }
    return cnt;
  }
}