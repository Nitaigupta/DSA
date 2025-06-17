class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] arr, int t) {
        int n = arr.length;
        int dp[][] = new int[n+1][t+1];
        for(int a[] :dp){
            Arrays.fill(a,-1);
        }
        return (func(arr,t,0,0,dp));
    }
     public static int func(int arr[] , int t , int sum , int i ,int [][] dp ){
        if (i==arr.length){
            return sum==t?1:0;
        }
        if (sum>t || i>=arr.length){
            return 0;
        }
        if (dp[i][sum]!=-1){
            return dp[i][sum];
        }
        int p = func(arr,t,sum+arr[i],i+1,dp);
        int np = func(arr,t,sum,i+1,dp);
        dp[i][sum]= p+np;
        return dp[i][sum];

    }
}