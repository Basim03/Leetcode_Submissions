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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue <TreeNode> queue=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        int j=1;
        queue.offer(root);
        while(!queue.isEmpty())
        {
             int LevelSize=queue.size();
            List<Integer> ans=new ArrayList<>(LevelSize);
           
            for(int i=0;i<LevelSize;i++)
            {
                TreeNode currentNode=queue.poll();
                   ans.add(currentNode.val);
            


            if(currentNode.left!=null)
{
    queue.offer(currentNode.left);
}
if(currentNode.right!=null)
{
    queue.offer(currentNode.right);
}
            }
if(j%2==0)
{
Collections.reverse(ans);
}
result.add(ans);
j++;
}

return result;
 }

        }

    