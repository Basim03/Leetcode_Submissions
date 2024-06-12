class Solution {
    public void sortColors(int[] array) {
    // int n = array.length;
    //     boolean swapped;
    //     do {
    //         swapped = false;
    //         for (int i = 1; i < n; i++) {
    //             if (array[i - 1] > array[i]) {
    //                 // Swap array[i-1] and array[i]
    //                 int temp = array[i - 1];
    //                 array[i - 1] = array[i];
    //                 array[i] = temp;
    //                 // Set swapped flag to true
    //                 swapped = true;
    //             }
    //         }
    //         // Decrease the size of the unsorted portion of the array
    //         n--;
    //     } while (swapped);
    Arrays.sort(array);
    }
}