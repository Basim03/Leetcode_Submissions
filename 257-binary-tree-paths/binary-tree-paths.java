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
    List<String> ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,"");
        return ans;
    }
    public void helper(TreeNode root,String anss)
    {
        if(root==null)
        {
            return;
        }
        anss+=root.val;

        if(root.left==null && root.right==null)
        ans.add(anss);

        helper(root.left,anss+"->");
        helper(root.right,anss+"->");

        
    }
}