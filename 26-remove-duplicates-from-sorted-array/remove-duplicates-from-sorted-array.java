class Solution {
   public int removeDuplicates(int[] nums) {
       if (nums.length == 0) return 0;

       int j = 0;  // Pointer for the position of the last unique element

       for (int i = 1; i < nums.length; i++) {
           if (nums[i] != nums[j]) { // If current element is unique
               j++;                 // Move the `j` pointer
               nums[j] = nums[i];    // Update the position with the unique element
           }
       }

       return j + 1;  // Return the length of the array with unique elements
   }
}
