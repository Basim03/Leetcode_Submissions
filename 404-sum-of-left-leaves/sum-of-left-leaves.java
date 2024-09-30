class Solution {
        int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
  if(root==null)
  {
    return 0;

  }
  helper(root,false);
  return sum;
    }
    public void helper(TreeNode root,boolean isLeft)
    {
        if(root==null)
        return ;
        else 
        {
            if(root.left==null && root.right==null && isLeft)
            {
                sum+=root.val;
            }
            helper(root.left,true);
            helper(root.right,false);
        }
    }
}