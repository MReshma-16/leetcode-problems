class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
       
        int val=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                val=i;
            }
        }
        if(val==0 || val==arr.length-1){
            return false;
        }
        
        for(int i=1;i<=val;i++){
            if(arr[i-1]>=arr[i]){
                return false;
            }
        }
        
        for(int i=val;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
             return false;
            }
        }
         return true;  
         
    }
}