class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        boolean check=true;
    
for(int i=0;i<candies.length;i++)
{
    int count=0;
                count=candies[i]+extraCandies;

    for(int j=0;j<candies.length;j++)
    {
        if(i==j)
        continue;
        else 
        {
          if(count<candies[j])
          {
          check=false;
break;
          }
          else 
          {
          check=true;
          }
         

        }
    }
    ans.add(check);
}
return ans;
    }
}