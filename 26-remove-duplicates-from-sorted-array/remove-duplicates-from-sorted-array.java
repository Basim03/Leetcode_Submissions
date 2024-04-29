class Solution {
   public int removeDuplicates(int[] nums) {
    int n=nums.length;

    Set<Integer> a = new HashSet<Integer>();
    int count=0;
    int j=0;
    for(int i=0;i<nums.length;i++)
    {
      a.add(nums[i]);

    }
    int nums1[]=new int[a.size()];

  // for(int i=0;i<a.size();i++)
  // {
  //   int element=a.remove(i);
  //   System.out.println(elements);
  //     }
  for(int element: a)
  {
    nums1[j]=element;
    j++;
  }
  Arrays.sort(nums1);
  for(int i=0;i<a.size();i++)
    {
     nums[i]=nums1[i];

    }
  return a.size();
   }
}