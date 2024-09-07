class Solution {
    public List<List<Integer>> combine(int n, int k) {
List<Integer> result=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        findCombo(1,n,k,ans,result);
        return ans;

    }
    public void findCombo(int upper,int n,int k,List<List<Integer>> ans,List<Integer> result)
    {
        if(result.size()==k)
        {
            ans.add(new ArrayList<>(result));
            return;
        }
        for(int i=upper;i<=n;i++)
        {
            result.add(i);
            findCombo(i+1,n,k,ans,result);
            result.remove(result.size()-1);

        }
    }
}