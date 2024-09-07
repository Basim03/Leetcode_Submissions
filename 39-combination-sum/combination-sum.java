class Solution {
   
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates==null)
        {
            return null;
        }
 List<List<Integer>> ans=new ArrayList<>();
 findCombinations(candidates,0,target,ans,new ArrayList<>());
 return ans;

    }
    public void findCombinations(int [] candidates,int index,int target, List<List<Integer>> ans,List<Integer> innerList)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(innerList));
            return ;
        }
        for(int i=index;i<candidates.length;i++)
        {
            if(candidates[i]<=target)
            {
            innerList.add(candidates[i]);
                findCombinations(candidates, i, target - candidates[i], ans, innerList);  // Explore further with reduced target
         innerList.remove(new Integer(candidates[i])); 
            }
        }
    }
}