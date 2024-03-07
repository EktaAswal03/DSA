import java.util.ArrayList;
import java.util.List;

public class Solution {
    static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        // Write your code here.
        
        int[][] dp = new int[n][m];

        for(int i =0; i<n ; i++){
            for(int j =0; j<m; j++){
                dp[i][j]=-1;
            }


       }
        return f(n-1,m-1,mat, dp);
    }

    static int f(int n , int m, ArrayList<ArrayList<Integer>> mat , int[][] dp){
        //base
        int MOD = 1000000007;
        if(n==0&&m==0){
            return 1;
        }
        if(n<0||m<0){
            return 0;
        }

        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(  n>=0 && m>=0 && mat.get(n).get(m)==-1){
            return 0;
        }
        else{
            int a= f(n-1,m,mat, dp);
            int b = f(n,m-1,mat, dp);

            return dp[n][m] = (a+b)%MOD;
        }
    }

}
