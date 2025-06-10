package String;

class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        lower=lower.toLowerCase().replaceAll("[^a-z0-9]","");
        
        return checkPalindrome(lower);
    }
    public boolean checkPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
