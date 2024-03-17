import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        
       
        int trimCount = (int) Math.ceil(arr.length * 0.05); // 5% trim
        
       
        double sum = 0;
        for (int i = trimCount; i < arr.length - trimCount; i++) {
            sum += arr[i];
        }
     
        return sum / (arr.length - 2 * trimCount);
    }
}
