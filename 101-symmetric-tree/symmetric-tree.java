/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
     return helper(root.left,root.right);
    }
    public boolean helper(TreeNode L,TreeNode R)
    {
        if(L==null && R==null)
        return true;
        else if(L==null || R==null)
        return false;
        return L.val==R.val && helper(L.left,R.right) && helper(L.right,R.left);
    }
}