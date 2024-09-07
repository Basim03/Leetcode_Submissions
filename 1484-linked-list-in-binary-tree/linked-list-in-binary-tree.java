class Solution {
    List<TreeNode> storingList=new ArrayList<>();
    public boolean isSubPath(ListNode head, TreeNode root) {
        StoreToList(head,root);
        for(TreeNode element : storingList)
        {
            if(check(head,element))
            return true;
        }
        return false;
    }
public void StoreToList(ListNode head,TreeNode root)
{
    if(head==null || root==null)
    
        return;
    
    
        if(head.val==root.val)
        {
         storingList.add(root);
    
        }
        StoreToList(head,root.left);
           StoreToList(head,root.right);

}
  public boolean check(ListNode head, TreeNode node) {
    if (head == null) return true; // If we've matched the entire linked list, return true.
    if (node == null) return false; // If the tree ends before the list, return false.
    if (head.val == node.val) {
        return (check(head.next, node.left) || check(head.next, node.right));
    }
    return false;
}

}