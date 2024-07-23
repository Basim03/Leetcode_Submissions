class Solution {
    public static int[] frequencySort(int[] nums) {
        int n = nums.length;

        // Step 1: Count the frequency of each element
        int[][] freqArr = new int[n][2]; // Each element is an array of [num, frequency]
        for (int i = 0; i < n; i++) {
            freqArr[i][0] = nums[i];
            freqArr[i][1] = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    freqArr[i][1]++;
                }
            }
        }

        // Step 2: Sort the array based on frequency and value
        Arrays.sort(freqArr, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]); // Sort by frequency
            } else {
                return Integer.compare(b[0], a[0]); // Sort by value in descending order
            }
        });

        // Step 3: Extract the sorted values
        int[] sortedNums = new int[n];
        for (int i = 0; i < n; i++) {
            sortedNums[i] = freqArr[i][0];
        }

        return sortedNums;
    }
}