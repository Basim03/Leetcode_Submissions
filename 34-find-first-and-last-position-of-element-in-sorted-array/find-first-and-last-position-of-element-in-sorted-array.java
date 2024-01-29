class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findPosition(nums, target, true);
        ans[1] = findPosition(nums, target, false);
        return ans;
    }

    private int findPosition(int[] nums, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target || (findFirst && nums[mid] == target)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) {
                ans = mid;
            }
        }
        return ans;
    }
}