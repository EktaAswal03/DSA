import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {

        
         int[] dp= new int[n];
         for(int i=0; i<n; i++){
             dp[i]=-1;
         }
        dfs(n-1, heights,dp);
        return dp[n-1];
    }

    public static int dfs(int a, int heights[], int[] dp){
        if(a==0){
            return 0;
        }
        if(dp[a]!=-1){
            return dp[a];
        }

        int left=dfs(a-1, heights,dp)+ Math.abs(heights[a]-heights[a-1]);

        int right=Integer.MAX_VALUE;

        if(a>1){
            right=dfs(a-2, heights,dp)+ Math.abs(heights[a]-heights[a-2]);
        }
        dp[a]= Math.min(left, right);
        return dp[a];
    }

}
