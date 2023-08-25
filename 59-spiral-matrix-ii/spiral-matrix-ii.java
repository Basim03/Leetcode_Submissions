class Solution {
    public int[][] generateMatrix(int n) {
 {
        int matrix[][] = new int[n][n];
//        List<Integer> result = new ArrayList<>();
//        if (matrix == null || matrix.length == 0) {
//            return result;
//        }
        int arr[] = new int[n*n];
        for (int i = 0; i < n*n; i++) {
            arr[i] = i + 1;
        }

        int k = 0;

        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = cols - 1, top = 0, bottom = rows - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = arr[k];
                k++;
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = arr[k];
                k++;
            }

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = arr[k];
                    k++;
                }
//                k++;
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = arr[k];
                    k++;
                }

                left++;
            }
        }

     return matrix;
     
    }
}
}