class Solution {
    public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
        int[] diffCity = new int[boxes.length+1];
        int[] weights = new int[boxes.length+1];
        
        //check if the ports change hence the diffCity Array is incremented and weights are adjusted accordingly 
        for (int i = 0; i < boxes.length; i++) {
            diffCity[i+1] = diffCity[i] + ((i != 0 && boxes[i][0] == boxes[i-1][0]) ? 0 : 1);
            weights[i+1] = weights[i] + boxes[i][1];
        }
        //initialize a dp array
        int[] dp = new int[boxes.length+1];
        //fill the array with max value because its uncomputed
        Arrays.fill(dp, Integer.MAX_VALUE);
        //initialize the Deque
        Deque<int[]> dq = new ArrayDeque<>();
        //oadd the array to it and initialize so that zero trips are needed to carry zero boxes
        dq.offer(new int[] {0, -1});
        for (int i = 1; i <= boxes.length; i++) {
            while (!dq.isEmpty() && (i - dq.peek()[0] > maxBoxes || weights[i] - weights[dq.peek()[0]] > maxWeight)) { // filter values no longer can be used.
                dq.poll();
            }
            //if the values of the weight exceed the constraints then it is no longer needed and hence poll it 
            
            dp[i] = dq.peek()[1] + diffCity[i] + 2;
            if (i != boxes.length) {
                //update the dp array 
                //the minimun no of trips required are calculated using the front of the Dequeue
                while (dq.peekLast()[1] >= dp[i] - diffCity[i+1]) { 
                    dq.pollLast();
                }
                dq.offer(new int[] {i, dp[i] - diffCity[i+1]});
            }
            
   
    }
         return dp[boxes.length];
    }
}