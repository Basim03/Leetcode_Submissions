class Solution {
    public int heightChecker(int[] heights) {
        int ans=0;
        int expected[]=Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=expected[i])
            ans++;
        }
        return ans;
    }
}