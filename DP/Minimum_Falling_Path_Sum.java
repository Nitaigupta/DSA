public class Minimum_Falling_Path_Sum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int ans = Integer.MAX_VALUE;
        int dp[][] = new int[n+1][n+1];
        for(int a[]:dp){
            Arrays.fill(a,10000);
        }
      for(int i=0;i<n;i++){
        ans=Math.min(ans,func(matrix,n,0,i,dp));
      }
        return ans;
    }
    public int func(int [][] arr , int n , int i , int j,int [][] dp){
        if(i>=n || i<0 || j>=n || j<0){
            return Integer.MAX_VALUE;
        }
        if(i==n-1){
            return arr[i][j];
        }
        if(dp[i][j]!=10000){
            return dp[i][j];
        }
        int d = func(arr,n,i+1,j,dp);
        int ld = func(arr,n,i+1,j-1,dp);
        int rd = func(arr,n,i+1,j+1,dp);
        dp[i][j]=Math.min(d,Math.min(ld,rd))+arr[i][j];
        return dp[i][j];


    }
    
}
