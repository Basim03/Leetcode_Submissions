class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count=0;
        int current=0;
        int rowno=0;
       for(int i=0;i<mat.length;i++)
       {
           for(int j=0;j<mat[0].length;j++)
           {
             if(mat[i][j]==1)
             {
                 current+=1;
             }
           }
           if(current>count)
           {
               count=current;
               rowno=i;
           }
           current=0;


       } 
       return new int[]{rowno,count};
    }
}