class Solution {
    public boolean check(int node,int col,int [][]graph,int color[])
{
  
color[node]=col;

            

 
 
    for(int i=0;i<graph[node].length;i++)
    {
        int adj=graph[node][i];
        if(color[adj]==-1)
        {
           if(check(adj,1-col,graph,color)==false)
           return false;
        }
         else if(color[adj]==col)
            return false;
    }

return true;

}


    public boolean isBipartite(int[][] graph) {

      int []colors=new int[graph.length];
      Arrays.fill(colors,-1);
      for(int i=0;i<graph.length;i++)
      {
        if(colors[i]==-1)
        {
            if(check(i,0,graph,colors)==false)
            return false;
            
        }
      }
      return true;
    }
}