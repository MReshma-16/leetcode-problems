class Solution {
    public String largestEven(String s) {
      int i=s.length()-1;
      while(i>=0){
        int d=s.charAt(i)-'0';
        if(d%2==0){
            return s.substring(0,i+1);
        }
        else{
            i--;
        }
      }
      return "";
        }
}