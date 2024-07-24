/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        List<List<Integer>> result=new ArrayList<>();

        if(root==null)
        {
            return root;
        }
        Queue<Node> queue=new LinkedList<>();
queue.offer(root);
 while(!queue.isEmpty())
 {
    int levelSize=queue.size();
    Node prev=null;
    // List<Integer> ans =new ArrayList<>(levelSize);
for(int i=0;i<levelSize;i++)
{
Node currentNode=queue.poll();
if(prev!=null)
{
    prev.next=currentNode;

}
prev=currentNode;
// ans.add(currentNode.val);
if(currentNode.left!=null)
{
//   currentNode.left.next=currentNode.right;

    queue.offer(currentNode.left);
}

if(currentNode.right!=null)
{
//   currentNode.right.next=currentNode.right;
   queue.offer(currentNode.right);
}

}
 
 }
 return root;
    }
}