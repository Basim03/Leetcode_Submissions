class Solution {
    public int numberOfSteps(int num) {
        int counter=0;
        while(num!=0)
        {
            if(num%2==0)
            {
                num/=2;
                counter++;
            }
            else if(num%2!=0)
            {
                num-=1;
                counter++;
            }
            else if(num<0)
            {
                counter=0;
            break;
            }
            

        }
        return counter;
    }
}