import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {1,3,2,4};
      Stack<Integer> st = new Stack<>();
      int n = arr.length;
      int ans[] = new int[n];
      for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && arr[i]>st.peek()){
          st.pop();
        }
        if(st.isEmpty()){
          ans[i]=-1;
        }
        else{
          ans[i]=st.peek();
        }
        st.push(arr[i]);
      }
     System.out.println(Arrays.toString(ans));
  }
}