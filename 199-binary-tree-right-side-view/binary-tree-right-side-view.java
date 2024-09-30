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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
        return ans;
        else 
        {
            int curr;
queue.offer(root);
// ans.add(root.val);
while(queue.isEmpty()==false)
{
    int LevelSize=queue.size();
List<Integer> result=new ArrayList<>(LevelSize);
         curr=0;
   for(int i=0;i<LevelSize;i++){
    
    // List<Integer>
    TreeNode current=queue.poll();
     curr=current.val;
    if(current.left!=null)
    {
        queue.offer(current.left);

    }
    if(current.right!=null)
    {
        queue.offer(current.right);
       
    }
    result.add(current.val);
    
   }
   ans.add(result.get(result.size()-1));
}
return ans;
        } 
    }
}