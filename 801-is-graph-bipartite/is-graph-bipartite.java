class Solution {
    public boolean check(int node,int [][]graph,int color[])
{
    Queue<Integer> q=new LinkedList<>();
color[node]=0;
q.add(node);
while(!q.isEmpty())
{
    int curr=q.peek();
    q.remove();
    for(int i=0;i<graph[curr].length;i++)
    {
        int adj=graph[curr][i];
        if(color[adj]==-1)
        {
            color[adj]=1-color[curr];
            q.add(adj);
           
        }
         else if(color[curr]==color[adj])
            return false;
    }
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
            if(check(i,graph,colors)==false)
            return false;
            
        }
      }
      return true;
    }
}