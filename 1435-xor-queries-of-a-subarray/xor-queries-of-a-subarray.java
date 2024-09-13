class Solution {
    public int[] xorQueries(int[] arr1, int[][] queries) {
     int arr[]=new int[queries.length];  
     for(int i=0;i<queries.length;i++)
     {
        int ans=0;
        int first=queries[i][0];
        int second=queries[i][1];
       for(int j=first;j<=second;j++)
       {
        ans^=arr1[j];
       }
       arr[i]=ans;
     } 
     return arr;
    }
}