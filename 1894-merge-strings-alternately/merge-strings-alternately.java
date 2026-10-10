class Solution {
    public String mergeAlternately(String word1, String word2) {
        String a[]=word1.split("");
        String b[]=word2.split("");
         String ans="";
          if(word1.length()==word2.length()){
         for(int i=0;i<word1.length();i++){
            ans+=a[i]+b[i];
         }
         }
       
          else{
            int i=0;
            while(i<word1.length()|| i<word2.length()){
              if(i<word1.length()){
                ans+=a[i];
              }
              if(i<word2.length()){
                ans+=b[i];
              }
              i++;
            }
         }
         return ans;
    }
}