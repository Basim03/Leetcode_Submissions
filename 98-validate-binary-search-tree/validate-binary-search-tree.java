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
    List<Integer> ans=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
       Inorder(root);
       boolean a=true;
       for(int i=1;i<ans.size();i++ )
       {
        if(ans.get(i)<=ans.get(i-1))
        {
return false;
        }
       }
       return true;
    }
    public void Inorder(TreeNode root)
    {
        if(root==null)
        return;
        Inorder(root.left);
        ans.add(root.val);
        Inorder(root.right);
    }
}