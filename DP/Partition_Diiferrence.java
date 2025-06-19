
class Solution {
    int countPartitions(int[] arr, int d) {
        int n = arr.length;
        int arr_sum =0;
        for(int i:arr){
            arr_sum+=i;
        }
        if((arr_sum+d)%2!=0){
            return 0;
        }
        int t = (arr_sum+d)/2;
         int [][]dp = new int[n+1][t+1];
         for(int [] a:dp){
             Arrays.fill(a,-1);
         }
        return func(arr,t,0,0,dp);
        
    }
    public static int func(int arr[] , int t , int i , int sum ,int [][] dp){
        if (i==arr.length){
            if(sum==t){
                return 1;
            }
        }
        if (sum>t || i>=arr.length){
            return 0;
        }
        if(dp[i][sum]!=-1){
            return dp[i][sum];
        }
        int pick = func(arr,t,i+1,sum+arr[i],dp);
        int notpick = func(arr,t,i+1,sum,dp);

        dp[i][sum]=pick+notpick;
        return dp[i][sum];
    }
}
