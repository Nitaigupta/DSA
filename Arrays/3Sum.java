import java.util.*;

public class Main {
    public static void main(String[] args) {
      List<List<Integer>> ans = new ArrayList<>();
      int arr[] = {-1,0,1,2,-1,-4};
      Arrays.sort(arr);
      int n = arr.length;
      for(int i=0;i<n;i++){
        if(i>0 && arr[i]==arr[i-1]){
          continue;
        }
        int j=i+1;
        int k = n-1;
        while(j<k){
          int sum =arr[i]+arr[j]+arr[k];
          
          if(sum>0){
            k--;
          }
          if(sum<0){
            j++;
          }
          if(sum==0){
            List<Integer> temp = Arrays.asList(i,j,k);
            ans.add(temp);
            j++;
            k--;
            while(j<k && arr[j]==arr[j-1]){
              j++;
            }
            while(j<k && arr[k]==arr[k+1]){
              k--;
            }
          }
         
        }
         
      }
      System.out.println(ans);
  }
}