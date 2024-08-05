class Solution {
    public String kthDistinct(String[] arr, int k) {
      Map<String,Boolean> map=new HashMap<>();
      for(int i=0;i<arr.length;i++)
      {
        if(map.containsKey(arr[i]))
        {
            map.put(arr[i],false);
        }
        else 
        {
            map.put(arr[i],true);
        }
      } 
      int count=0; 
    for(String item:arr)
      {
if(map.get(item)==true)

{
    count++;
}
if(count==k){
    return item;
}

      }
      return "";
    }
}