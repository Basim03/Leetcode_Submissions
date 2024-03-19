class Solution {
    public int maxDepth(TreeNode root) {
        int max1 = TraversalRight(root, 0);
        int max2 = TraversalLeft(root, 0);
        
        return Math.max(max1, max2);
    }
    
    public static int TraversalRight(TreeNode root, int size) {
        if (root == null) {
            return size;
        }
        return Math.max(TraversalRight(root.right, size + 1), TraversalRight(root.left, size + 1));
    }
    
    public static int TraversalLeft(TreeNode root, int size) {
        if (root == null) {
            return size;
        }
        return Math.max(TraversalLeft(root.right, size + 1), TraversalLeft(root.left, size + 1));
    }
}
