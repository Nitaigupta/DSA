package String;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int odd_count = Integer.MIN_VALUE;
        int even_count = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            char key = e.getKey();
            int val = e.getValue();
            if(val%2==0){
                even_count = Math.min(val,even_count);
            }
            if(val%2!=0){
                odd_count=Math.max(val,odd_count);
            }


        }
        return odd_count - even_count;
        
    }
}
