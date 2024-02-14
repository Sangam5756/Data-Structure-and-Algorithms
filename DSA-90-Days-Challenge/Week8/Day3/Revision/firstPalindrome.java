class Solution {
    public String firstPalindrome(String[] words) {
        
        String ans = "";
        for(int i=0; i<words.length;i++){
            String str =  words[i];

            if(ispalindrome(str)){
                ans = str;
                break;
            }

        }
        return ans;
    }
    public boolean ispalindrome(String str){

        int start = 0;
        int last = str.length()-1;
        while(start < last){

            if(str.charAt(start) != str.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}
