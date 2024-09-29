import java.util.*;

class Solution {
    // Helper function to traverse the tree
    private void helper(TreeNode root, List<int[]> mts, int position, int level) {
        if (root == null) {
            return;
        }
        
        mts.add(new int[] { position, level, root.val });
        
        helper(root.left, mts, position - 1, level + 1);
        helper(root.right, mts, position + 1, level + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> mts = new ArrayList<>();
        helper(root, mts, 0, 0);

        // Sort mts list based on position, level, and value
        Collections.sort(mts, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[2], b[2]);
        });

        // Grouping elements by their vertical position
        List<List<Integer>> output = new ArrayList<>();
        int i = 0;
        while (i < mts.size()) {
            List<Integer> temp = new ArrayList<>();
            temp.add(mts.get(i)[2]);
            i++;

            while (i < mts.size() && mts.get(i)[0] == mts.get(i - 1)[0]) {
                temp.add(mts.get(i)[2]);
                i++;
            }

            output.add(temp);
        }

        return output;
    }
}
