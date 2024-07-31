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
    public int getMinimumDifference(TreeNode root) {
      List<Integer> ans=new ArrayList<>();
      if(root==null)
      {
        return 0;
      }  
      Queue<TreeNode> queue=new LinkedList<>();
      queue.offer(root);
      while(!queue.isEmpty())
{
    TreeNode currentNode=queue.poll();
// queue.offer(currentNode);
ans.add(currentNode.val);
if(currentNode.left!=null)
    {
        queue.offer(currentNode.left);
        // ans.add(currentNode.left.val);
    }
    if  (currentNode.right!=null)
    {
        queue.offer(currentNode.right);
        // ans.add(currentNode.right.val);
    }
    
}
int anss=Integer.MAX_VALUE;
ans.sort(Integer::compareTo);

      
        for (int i = 1; i < ans.size(); i++) {
            anss = Math.min(anss, ans.get(i) - ans.get(i - 1));
        }   
return anss;

    }
}