class Solution {
    public int findLucky(int[] arr) {
        // Since the problem constraints specify 1 <= arr[i] <= 500,
        // we can use an array of size 501 to count occurrences.
        int[] count = new int[501];
        
        // Count occurrences of each number
        for (int num : arr) {
            count[num]++;
        }
        
        int ans = -1;
        // Find the largest lucky number
        for (int i = 1; i < count.length; i++) {
            if (count[i] == i) {
                ans = i;
            }
        }
        
        return ans;
    }
}
