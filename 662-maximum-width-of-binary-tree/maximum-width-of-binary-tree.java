import java.util.*;

class Solution {
    // Define max as a class variable
    int max = 0;

    // Custom Pair class to hold the TreeNode and its index (num)
    class Pair {
        TreeNode node;
        long num;

        Pair(TreeNode node, long num) {
            this.node = node;
            this.num = num;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Queue to store pairs of TreeNode and its index
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        // While the queue is not empty
        while (!queue.isEmpty()) {
            int size = queue.size();
            long minn = queue.peek().num; // Get the first element's position in the level
            long first = 0, last = 0;

            // Traverse the current level
            for (int i = 0; i < size; i++) {
                Pair pair = queue.poll();
                TreeNode curr = pair.node;
                long cur = pair.num - minn; // Normalize current position based on the first element

                if (i == 0) first = cur;  // First node in the level
                if (i == size - 1) last = cur;  // Last node in the level

                // Add left child if it exists
                if (curr.left != null) {
                    queue.offer(new Pair(curr.left, 2 * cur + 1));
                }

                // Add right child if it exists
                if (curr.right != null) {
                    queue.offer(new Pair(curr.right, 2 * cur + 2));
                }
            }

            // Calculate the width of the current level and update max width
            max = Math.max(max, (int)(last - first + 1));
        }

        return max;
    }
}
