import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] count = new int[nums.length];
        int[] indexes = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indexes[i] = i;
        }
        mergeSort(nums, indexes, count, 0, nums.length - 1);
        for (int i : count) {
            result.add(i);
        }
        return result;
    }
    
    private void mergeSort(int[] nums, int[] indexes, int[] count, int start, int end) {
        if (start >= end) return;
        int mid = start + (end - start) / 2;
        mergeSort(nums, indexes, count, start, mid);
        mergeSort(nums, indexes, count, mid + 1, end);
        merge(nums, indexes, count, start, mid, end);
    }
    
    private void merge(int[] nums, int[] indexes, int[] count, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int mergedIndex = 0;
        int rightCount = 0;
        
        while (left <= mid && right <= end) {
            if (nums[indexes[right]] < nums[indexes[left]]) {
                merged[mergedIndex] = indexes[right];
                rightCount++;
                right++;
            } else {
                merged[mergedIndex] = indexes[left];
                count[indexes[left]] += rightCount;
                left++;
            }
            mergedIndex++;
        }
        
        while (left <= mid) {
            merged[mergedIndex] = indexes[left];
            count[indexes[left]] += rightCount;
            left++;
            mergedIndex++;
        }
        
        while (right <= end) {
            merged[mergedIndex] = indexes[right];
            right++;
            mergedIndex++;
        }
        
        System.arraycopy(merged, 0, indexes, start, merged.length);
    }
}
