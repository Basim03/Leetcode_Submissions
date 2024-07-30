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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int ans=0;
        Queue<TreeNode> queue=new LinkedList<>();
queue.offer(root);
 while(!queue.isEmpty())
 {
    int levelSize=queue.size();
for(int i=0;i<levelSize;i++)
{
TreeNode currentNode=queue.poll();
if(currentNode.left!=null)
{
    queue.offer(currentNode.left);
    if(currentNode.left.left==null && currentNode.left.right==null)
    ans+=currentNode.left.val;
}
if(currentNode.right!=null)
{
    queue.offer(currentNode.right);
}
}

 }
 return ans;
    }
}