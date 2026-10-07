class Solution {
    public int countDigits(int num) {
        int a=num;
        int ans=0;
        while(a!=0){
            int d=a%10;
            if(num%d==0){
                ans++;
            }
            a=a/10;
        }
        return ans;
    }
}