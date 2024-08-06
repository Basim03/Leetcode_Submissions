import java.util.HashMap;
import java.util.Map;

class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        // This map will store the cumulative sum up to each node
        Map<Long, Integer> prefixSumCount = new HashMap<>();
        // Initialize with sum 0 having one count (base case)
        prefixSumCount.put(0L, 1);
        return dfs(root, 0, targetSum, prefixSumCount);
    }
    
    private int dfs(TreeNode node, long currSum, int targetSum, Map<Long, Integer> prefixSumCount) {
        if (node == null) {
            return 0;
        }
        
        // Include current node's value in the current sum
        currSum += node.val;
        
        // Get the number of ways to have a subpath (from any ancestor node) that sums to targetSum
        int count = prefixSumCount.getOrDefault(currSum - targetSum, 0);
        
        // Update the map with the current sum
        prefixSumCount.put(currSum, prefixSumCount.getOrDefault(currSum, 0) + 1);
        
        // Recurse on the left and right children
        count += dfs(node.left, currSum, targetSum, prefixSumCount);
        count += dfs(node.right, currSum, targetSum, prefixSumCount);
        
        // Remove the current sum from the map after returning from recursion
        // to prevent counting the same path again
        prefixSumCount.put(currSum, prefixSumCount.get(currSum) - 1);
        
        return count;
    }
}
