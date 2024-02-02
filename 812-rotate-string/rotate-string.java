class Solution {
    public boolean rotateString(String s, String goal) {
      String arr[]=new String[s.length()];
      if(goal.length()!=s.length())
      return false;
      String f=goal+goal;
      return (f.indexOf(s)!=-1);



    }
}