class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> ans=new ArrayList<>();
  int sum=0;
int max=0;
  for(int i=0;i<candies.length;i++)
  {
   if(max<candies[i])
   max=candies[i];
   else 
   max=max;
  }


  for(int i=0;i<candies.length;i++)
  {
      sum=candies[i]+extraCandies;
      ans.add(sum>=max);
  }

return ans;
}
}
   
