import java.util.Arrays;

public class Kadens {
   public static void main(String[] args) {
    int arr[] = {2, 3, -8, 7, -1, 2, 3};
    int sum =0;
    int ans = Integer.MIN_VALUE;
    int s =0;
    int as=-1;
    int ae=-1;
    for (int i = 0; i < arr.length; i++) {
        if (sum==0) {
            s=i;
        }
        sum+=arr[i];
        if (sum>ans) {
            ans=sum;
            as=s;
            ae=i;
        }
        if (sum<0) {
            sum=0;
        }
    }
    for (int i = as; i <= ae; i++) {
        System.out.println(arr[i]);
    }
   } 
}
