class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        
        if(n==1){
            return nums[0];
        }
        int p = nums[0];
        int p2=0;
        
        for(int i =1; i<n ; i++){
            int t= nums[i];
            if(i>1)t += p2;
            
            int not = p;
            
            int curr= Math.max(t,not);
            p2=p;
            p=curr;
        }
        return p;
        
    }
}
