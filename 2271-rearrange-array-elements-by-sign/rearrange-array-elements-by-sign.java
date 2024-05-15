class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n1=0;
        int n2=0;
        ArrayList<Integer> v1=new ArrayList<>();
         ArrayList<Integer> v2=new ArrayList<>();
          ArrayList<Integer> v3=new ArrayList<>();
        

            for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
           v1.add(arr[i]);
           else
          v2.add(arr[i]);
        }
      
      int nums[]=new int[arr.length];
    
    for (int i = 0; i < v1.size(); i++) {
            v3.add(v1.get(i));
            v3.add(v2.get(i));
        }

        return v3.stream().mapToInt(Integer::intValue).toArray();

}
}