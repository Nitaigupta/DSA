import java.util.*;;
class Solution {
    public int change(int amount, int[] coins) {
         int n = coins.length;
        int dp[][] = new int[n+1][amount+1];
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        return func(coins,amount,0,0,dp);
    }
     public static int func(int arr[] , int t , int i , int sum , int[][] dp){
        if (sum==t){
            return 1;
        }
        if (sum>t || i>=arr.length){
            return 0;
        }
        if(dp[i][sum]!=-1){
            return dp[i][sum];
        }
        int pick = func(arr,t,i,sum+arr[i],dp);
        int notpick = func(arr,t,i+1,sum,dp);

        return dp[i][sum]=pick+notpick;
    }
}