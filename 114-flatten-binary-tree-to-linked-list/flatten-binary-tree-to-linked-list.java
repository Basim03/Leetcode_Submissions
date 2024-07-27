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
            List<TreeNode> ans=new ArrayList<>();

    public void flatten(TreeNode root) {
        if(root==null)
        {
            return ;
        }
    //    ans.add(root); 
            Pre(root);

       for (int i = 0; i < ans.size() - 1; i++) {
            TreeNode current = ans.get(i);
            TreeNode next = ans.get(i + 1);
            current.left = null;
            current.right = next;
    }
    }

    public void Pre(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
    ans.add(root);
    Pre(root.left);
    Pre(root.right);
    }
}