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
        public  List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return ans;
        }
      dfs(root,targetSum,new ArrayList<>());
      return ans;
    }
    public void dfs(TreeNode root,int targetSum,List<Integer> path)
    {
        // List<Integer> path=new ArrayList<>();
        targetSum-=root.val;
        path.add(root.val);
        if(targetSum==0 && root.left==null && root.right==null) {
            ans.add(new ArrayList<>(path));
        }
        else 
        {
            if(root.right!=null)
            {
                dfs(root.right,targetSum,path);
            }
              if(root.left!=null)
            {
                dfs(root.left,targetSum,path);
            }
        }
        path.remove(path.size()-1);

    }
}