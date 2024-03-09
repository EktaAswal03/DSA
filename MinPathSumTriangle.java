import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minimumPathSum(int[][] triangle, int n) {
        // Write your code here.
        int dp[][] = new int[n][n];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return f(0, 0, triangle, n, dp);
    }

    public static int f (int i, int j,int[][] triangle, int n, int dp[][] ){
        if(i==n-1){
            return triangle[n-1][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int d= triangle[i][j]+ f(i+1, j, triangle, n, dp);
        int dg= triangle[i][j]+ f(i+1, j+1, triangle, n, dp);

        return  dp[i][j]= Math.min(d,dg);

            }
}
