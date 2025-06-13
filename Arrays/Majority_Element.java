package Arrays;
import java.util.*;
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans= new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int key = e.getKey();
            int value = e.getValue();
            if(value>n/3){
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}

