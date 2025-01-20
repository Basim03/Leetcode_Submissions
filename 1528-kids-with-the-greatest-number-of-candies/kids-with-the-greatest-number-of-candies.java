class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int m=0;
      for(int i=0;i<candies.length;i++)
      {
m=Math.max(candies[i],m);

      }
      for(int i=0;i<candies.length;i++)
      {
        if(candies[i]+extraCandies>=m)
         ans.add(true);
         else 
         ans.add(false);
      }
return ans;
    }
}