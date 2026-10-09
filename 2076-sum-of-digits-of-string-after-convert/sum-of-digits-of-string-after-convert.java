class Solution {
    public int getLucky(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           int num=ch-'a'+1;
           str+=num;
    }
    int sum=0;
    for(int i=0;i<k;i++){
        sum=0;
        for(int j=0;j<str.length();j++){
            sum+=str.charAt(j)-'0';
        }
        str=String.valueOf(sum);
    }
      return sum;
    }
}