class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        int num=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("++X") || operations[i].equals("X++"))
            {
                num++;
            }
            else 
            {
                num--;
            }
            System.out.println(num);
        }
        return num;
    }
}