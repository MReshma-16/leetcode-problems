class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int pdt=1;
           int ans=n;
        while(ans>0){
            int d=ans%10;
            pdt*=d;
            ans=ans/10;
        }
        if(pdt%t==0){
            return n;
        }
        n++;
        }
    }
}