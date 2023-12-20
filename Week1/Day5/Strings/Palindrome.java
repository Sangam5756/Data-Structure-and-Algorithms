import java.util.*;


public class Palindrome{

    public static boolean palindromeCheck(String str){

        int n =str.length();
        
        for(int i=0; i<str.length()/2; i++){
          if(str.charAt(i) == str.charAt(n-1-i)){
          
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){

        String str = "madams";
        System.out.println(palindromeCheck(str));

    }
}