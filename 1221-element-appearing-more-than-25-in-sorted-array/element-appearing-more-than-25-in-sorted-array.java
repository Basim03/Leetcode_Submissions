class Solution {
    public int findSpecialInteger(int[] arr) {
    //     double percent=0.25*arr.length;
    //     int no=0;
    //    int count=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
              
    //         no=arr[i];
    //         for(int j=0;j<arr.length;j++)
    //         {
    //             if(arr[j]==no)
    //             count++;

    //         }
    //         if(((count/arr.length)*arr.length)>percent)
    //         {           
    //             no=arr[i];
    //         break;
    //         }

    //     }
    //     return no;



    int window=arr.length/4;
    int ans=0;
    for(int i=0;i<arr.length-window;i++)
{
    if(arr[i]==arr[i+window])
    {
       ans=arr[i];
    }
    }
    return ans;

    }
}