class Solution {
    public int subtractProductAndSum(int n) {
       int sum=0;
       int pdt=1;
       if(n<0){
        return 0;
       }
        while(n!=0){
            int d=n%10;
            sum+=d;
            pdt*=d;
            n=n/10;
             }
             int ans=pdt-sum;
             return ans;
    }
}