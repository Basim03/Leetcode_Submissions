class Solution {
        public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}