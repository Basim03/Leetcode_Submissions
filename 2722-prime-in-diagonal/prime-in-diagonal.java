class Solution {
    public int diagonalPrime(int[][] nums) {
        int current=nums[0][0];
        int max=nums[0][0];
        int arr[]=new int[nums.length*2];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            
                    current=nums[i][i];
                   if(isPrime(current))
                   {
                       arr[k]=current;
                       k++;
                   }
                }
            
        
        System.out.println(max);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
 
                // Condition for secondary diagonal
                if ((i + j) == (nums[0].length - 1)) {
                 current=nums[i][j];
                  if(isPrime(current))
                   {
                       arr[k]=current;
                       k++;
                   }
                }
            }
             
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-1];
    }
       
    public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    if (number <= 3) {
        return true;
    }
    if (number % 2 == 0 || number % 3 == 0) {
        return false;
    }
    for (int i = 5; i * i <= number; i += 6) {
        if (number % i == 0 || number % (i + 2) == 0) {
            return false;
        }
    }
    return true;
}
    }
