class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null; // Base case: if the tree is empty, return null
        } 
        if (root.val == val) {
            return root; // Found the node with the value
        } 
        if (root.val > val) {
            return searchBST(root.left, val); // Search in the left subtree
        } else {
            return searchBST(root.right, val); // Search in the right subtree
        }
    }
}
