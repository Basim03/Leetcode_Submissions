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
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> ans=new ArrayList<>();
        Inorder(ans,root);
        return ans;
    }
    public static void Inorder(List<Integer> ans,TreeNode root)
    {

        if(root==null)
        {
            return;
        }
        Inorder(ans,root.left);
        
        Inorder(ans,root.right);
        ans.add(root.val);
        }
}