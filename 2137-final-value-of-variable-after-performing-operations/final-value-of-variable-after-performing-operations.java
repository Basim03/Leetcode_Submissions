class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        int num=0;
        for(int i=0;i<operations.length;i++)
        {
            switch(operations[i])
            {
            case "X++":
            ++num;
            break;
             case "++X":
            num++;
            break;
            case "X--":
            num--;
            break;
            case "--X":
            --num;
            break;
           

        }
        }

        return num;
    }
}