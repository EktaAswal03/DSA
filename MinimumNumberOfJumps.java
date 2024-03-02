class Solution{
    static int minJumps(int[] arr){
        // your code here
        
        
        int n = arr.length;
        
        if(n==1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int max = 0; 
        int maxRange=0;
        int jump=0;
        
        for(int i=0; i<n; i++){
            max= Math.max(max, i+arr[i]);
            if(maxRange==i){
                maxRange=max;
                jump++;
                if(maxRange>=n-1){
                    return jump;
                }
            }
        }
        return -1;
        
        
    }
}//gfg greedy
