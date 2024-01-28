class Solution {
    public int minMoves(int target, int maxDoubles) {
        int counter=0;

        while(target>1)
        {
            if(target%2==0 && maxDoubles>0)
            {
                target/=2;
                counter++;
                maxDoubles-=1;
                continue;
            }
            if(maxDoubles==0)
            {
                counter+=target-1;
                break;
            }
            else
            {
                target-=1;
                counter+=1;
            }
          
            
        }
        return counter;
    }
}