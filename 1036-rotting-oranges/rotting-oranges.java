import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int x, y, time;

    public Pair(int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int freshCount = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        Queue<Pair> queue = new LinkedList<>();

        // Initialize the queue with rotten oranges and count fresh oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Pair(i, j, 0));
                    visited[i][j] = 2;
                } else {
                    visited[i][j] = 0;
                }

                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // If there are no fresh oranges, return 0
        if (freshCount == 0) return 0;

        int timeElapsed = 0;
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, -1, 0, 1};

        // BFS to rot adjacent fresh oranges
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int row = p.x;
            int col = p.y;
            int time = p.time;

            timeElapsed = Math.max(timeElapsed, time);

            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];

                // Check boundaries and ensure fresh orange is present and unvisited
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n &&
                    grid[newRow][newCol] == 1 && visited[newRow][newCol] == 0) {
                    queue.add(new Pair(newRow, newCol, time + 1));
                    visited[newRow][newCol] = 2; // Mark as rotten
                    freshCount--;
                }
            }
        }

        // If there are fresh oranges left, return -1
        return freshCount == 0 ? timeElapsed : -1;
    }
}
