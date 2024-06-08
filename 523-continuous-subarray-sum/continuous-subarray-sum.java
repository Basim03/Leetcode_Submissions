import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Create a HashMap to store (modulus, index) pairs
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize with modulus 0 at index -1 to handle cases where the subarray starts from index 0
        map.put(0, -1);
        
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            int mod = runningSum % k;
            
            // Ensure the modulus is non-negative
            if (mod < 0) {
                mod += k;
            }
            
            if (map.containsKey(mod)) {
                if (i - map.get(mod) > 1) {
                    return true;
                }
            } else {
                map.put(mod, i);
            }
        }
        
        return false;
    }
}
