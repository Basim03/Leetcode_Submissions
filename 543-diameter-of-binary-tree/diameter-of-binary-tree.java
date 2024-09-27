class Solution {
    int max = 0; // Class-level variable

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max; // Return the updated max value
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = dfs(root.left);
            int right = dfs(root.right);
            max = Math.max(max, left + right); // Update max directly
            return 1 + Math.max(left, right); // Return height of the current node
        }
    }
}
