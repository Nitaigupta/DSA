class Solution {
    int smallestDivisor(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
       for(int i:arr){
           max=Math.max(max,i);
       }
        int r =binarySearch(arr,k,max);
       return r;
        
    }
      public static  int binarySearch(int [] arr , int k , int max){
        int i=1;
        int j=max;
        int ans=0;
        while (i<=j){
            int mid = i+(j-i)/2;
           // System.out.println(mid);
            if (check(arr,mid,k)==true){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
    private static boolean check(int[] arr, int mid, int k) {
        int ans =0;
        for(int i=0;i<arr.length;i++){
            ans+=((arr[i]+mid-1)/mid);

        }
        //System.out.println(ans);
        if (ans<=k){
            return true;
        }
        return false;
    }
}