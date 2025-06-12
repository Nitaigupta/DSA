class Solution {
    public int lengthOfLIS(int[] nums) {
       return  lis(nums);
    }
    public int lis(int [] arr){
        int n = arr.length;
        int dp[] = new int[n];
        dp[0]=arr[0];
        int len =1;
        for(int i=1;i<n;i++){
            if(arr[i]>dp[len-1]){
                dp[len]=arr[i];
                len++;

            }
            else{
                int idx = search(dp,0,len-1,arr[i]);
                dp[idx]=arr[i];
        }
        }
        return len;
    }
    public int search(int [] arr , int i ,int j , int t){
        int ans =0;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>=t){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
}