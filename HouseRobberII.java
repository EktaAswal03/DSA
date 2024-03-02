class Solution {
    public int rob(int[] nums) {
         int n = nums.length;
        
        if(n==1){
            return nums[0];
        }
        int[] a = new int[n-1];
         int[] b = new int[n-1];
        
        for(int i =0; i<n-1 ; i++){
            a[i]= nums[i];
        }
         for(int i =1; i<n ; i++){
            b[i-1]= nums[i];
        }
        
        return Math.max(answer(a), answer(b));
        
        
    }
    
    public int answer(int [] nums){
        
        int n = nums.length;
        int curr=0;
        int p=nums[0];
        int p2=0;
        
        
        for(int i =1; i<n; i++){
            int take= nums[i];
            if(i>1) take += p2;
            
            int nottake= p;
            
            curr= Math.max(take,nottake);
            p2=p;
            p=curr;
        }
        
        return p;
    }
}//leetcode
