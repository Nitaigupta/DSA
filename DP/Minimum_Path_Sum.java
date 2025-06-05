public class Minimum_Path_Sum{

public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }
        return func(grid,n,m,0,0,dp);

        
    }
    public int func(int [][]arr,int n , int m ,int i, int j,int [][] dp){
        if(i>=n || j>=m){
            return Integer.MAX_VALUE;
        }
        
        if(i==n-1 && j==m-1){
            return arr[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right = func(arr,n,m,i,j+1,dp);
        int down = func(arr,n,m,i+1,j,dp);
        dp[i][j]= Math.min(right,down)+arr[i][j];
        return dp[i][j];
    }
    
}