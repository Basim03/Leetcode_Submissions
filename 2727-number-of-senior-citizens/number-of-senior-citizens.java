class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++)
        {
            String s=details[i];
            char third=s.charAt(s.length()-3);
            char fourth=s.charAt(s.length()-4);
            String f;
            f=String.valueOf(fourth)+String.valueOf(third);
            f=f.trim();
                    int age = Integer.parseInt(f);
                    System.out.println(age);

            
            if(age>60)
            count++;
        }
        return count;
    }
}