import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // Sort the array to handle duplicates
        backtrack(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }
    
    private void backtrack(List<List<Integer>> ans, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return; // If the remaining sum is negative, stop the recursion
        else if (remain == 0) ans.add(new ArrayList<>(tempList)); // If the remaining sum is 0, add the current combination to the result
        else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue; // Skip duplicates
                tempList.add(candidates[i]);
                backtrack(ans, tempList, candidates, remain - candidates[i], i + 1); // Move to the next element
                tempList.remove(tempList.size() - 1); // Backtrack by removing the last added element
            }
        }
    }
}
