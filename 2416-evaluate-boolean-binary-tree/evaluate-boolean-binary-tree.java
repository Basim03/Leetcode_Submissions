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
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null || root.right==null)
        {
            if(root.val==0)
        return false;
        return true;
        }
   boolean leftNode=evaluateTree(root.left);
    boolean rightNode=evaluateTree(root.right);
 if(root.val==2)
 return leftNode || rightNode;
 else 
 return leftNode && rightNode;
    }
}