class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int n = nums.length;
        double maxAverage = Double.NEGATIVE_INFINITY;

        // Iterate over each possible starting index of subarrays of length k
        for (int i = 0; i <= n - k; i++) {
            int currentSum = 0;

            // Calculate the sum of the subarray starting at index i
            for (int j = i; j < i + k; j++) {
                currentSum += nums[j];
            }

            // Calculate the average and update maxAverage if it's the highest we've seen
            double currentAverage = (double) currentSum / k;
           maxAverage=Math.max(maxAverage,currentAverage);
        }

        return maxAverage;
    }
}