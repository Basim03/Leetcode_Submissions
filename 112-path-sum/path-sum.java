class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false; // If root is null, there's no path to check
        }
        // Check if it's a leaf node and if the target sum matches
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        // Recursively check left and right subtrees with updated target sum
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
