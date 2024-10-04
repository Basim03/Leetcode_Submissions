/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> path1=new ArrayList<>();
        List<Integer> path2=new ArrayList<>();
        getPath(root,p.val,path1);
        getPath(root,q.val,path2);
List<Integer> commonPath = getCommonPath(path1, path2);
int lastCommonValue = commonPath.get(commonPath.size() - 1);

// Traverse the binary tree to find the node with the last common value
TreeNode current = root;
Queue<TreeNode> queue = new LinkedList<>();
queue.add(current);

while (!queue.isEmpty()) {
    current = queue.poll();

    if (current.val == lastCommonValue) {
        return current;  // Return the TreeNode when the value matches
    }

    // Add the left and right children to the queue if they exist
    if (current.left != null) {
        queue.add(current.left);
    }

    if (current.right != null) {
        queue.add(current.right);
    }
}

return null;  // Return null if the node is not found
// null if the node is not found

    }
    
    public static boolean getPath(TreeNode root, int target, List<Integer> path) {
        if (root == null) {
            return false; // Base case: if the node is null, return false
        }

        // Add the current node's value to the path
        path.add(root.val);

        // If the current node is the target node, return true
        if (root.val == target) {
            return true;
        }

        // Recursively check the left and right subtrees
        if (getPath(root.left, target, path) || getPath(root.right, target, path)) {
            return true;
        }

        // If the target node is not found in this path, remove the node's value (backtracking)
        path.remove(path.size() - 1);

        return false; // Return false if the target is not found
    }


     public static List<Integer> getCommonPath(List<Integer> path1, List<Integer> path2) {
        List<Integer> commonPath = new ArrayList<>();
        int i = 0;
        
        // Iterate through both lists while the elements are the same
        while (i < path1.size() && i < path2.size()) {
            if (path1.get(i).equals(path2.get(i))) {
                commonPath.add(path1.get(i));
            } else {
                break; // Paths diverge
            }
            i++;
        }
        
        return commonPath;
    }

}
    
