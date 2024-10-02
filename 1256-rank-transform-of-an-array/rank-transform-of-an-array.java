class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        Set<Integer> hashset=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
         hashset.add(arr[i]);
        }
    int j=0;
    int arr1[]=new int[hashset.size()];
 for(Integer element:hashset)
    {
        arr1[j]=element;
        j++;
    }
    Arrays.sort(arr1);
    for(int i=0;i<arr1.length;i++)
    {
        mp.put(arr1[i],i+1);
    }
    // System.out.println(Arrays.toString(arr1));
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=mp.get(arr[i]);
    }

    return arr;
}
}