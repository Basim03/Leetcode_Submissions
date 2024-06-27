class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length; // Number of edges
        int[] count = new int[n + 2]; // Array to count occurrences of each node

        // Iterate through the edges
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                count[edges[i][j]]++;
            }
        }

        // Find the node that appears in all edges
        for (int i = 1; i < count.length; i++) {
            if (count[i] == n) {
                return i;
            }
        }

        return -1; // This line should never be reached for a valid star graph
    }
}
