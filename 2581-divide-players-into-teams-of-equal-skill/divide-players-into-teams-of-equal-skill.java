class Solution {
    public long dividePlayers(int[] skill) {
        int arr[]=new int[1001];//in this array we will store how many times a certain skill is occuring that means the frequency of the skills
        int total=0;
        for(int x:skill)
        {
arr[x]++;
total+=x;
        }
        if(total%(skill.length/2)!=0)
        {
            return -1;
        }
        int perTeamSkill=total/(skill.length/2);//this is so because the sum of each team has to be total/skill.length/2 because team will be made of two people

    long chemistry=0;

    for(int x:skill)
    {
        int partnerVal=perTeamSkill-x;
        if(arr[partnerVal]==0)//this is so because we need to check if there exist a skill for the partner so that they add upto the perteamskill
        return -1;
        chemistry+=(long)x*(long)partnerVal;
        arr[partnerVal]--;
    }
    return chemistry/2;
    }
}