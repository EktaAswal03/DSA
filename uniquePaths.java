public class Solution {
	public static int uniquePaths(int m, int n) {
		// Write your code here.

		int [][] dp = new int[m][n];

		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

	  return f(m-1, n-1, dp);
        
        
        
    }
    
    public static int  f(int a,int b, int[][] dp){
        
        if(a==0 && b==0){
            return 1;
        }
        if(a<0||b<0){
            return 0;
        }

		if(dp[a][b]!=-1){
			return dp[a][b];
		}
        
        int up= f(a-1,b, dp);
        int left=f(a,b-1, dp);
        
        return  dp[a][b]=up + left;
    
	}
}
