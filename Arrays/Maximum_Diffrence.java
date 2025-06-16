package Arrays;
import java.util.*;
// LeetCode Problem: https://leetcode.com/problems/maximum-difference-between-increasing-elements/
class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){
                    ans=Math.max(ans,nums[j]-nums[i]);

                }
            }
        }
        return ans==Integer.MIN_VALUE?-1:ans;
    }
}