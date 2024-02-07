class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(Integer.bitCount(arr[i]) > Integer.bitCount(arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (Integer.bitCount(arr[i]) == Integer.bitCount(arr[j]) && arr[i] > arr[j]) {
                    // If both have the same number of bits, sort by value if necessary.
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
