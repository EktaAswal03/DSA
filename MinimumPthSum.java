import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int i = grid.length;
        int j = grid[0].length;

        int[][] dp = new int[i][j];
        for(int a=0; a<i; a++){
            for(int b=0; b<j; b++){
                dp[a][b]=-1;
            }
        }
        int sum = f(grid, i-1,j-1, dp );

        return sum;
    }

    public static int f(int[][] grid, int i, int j, int[][] dp ){
        if(i==0&&j==0){
            return grid[0][0];
        }
        

        if(i<0||j<0){
            return (int) Math.pow(10, 9); 
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int a= grid[i][j] + f(grid, i-1, j, dp);
        int b= grid[i][j] + f(grid, i, j-1, dp);

        return dp[i][j]= Math.min(a,b);
    }
}
