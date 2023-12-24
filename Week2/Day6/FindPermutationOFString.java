import java.util.*;

public class FindPermutationOFString{
    // TC = O(n * n! )
    // formula n! n factorial subset of string  n is total character in string
    public static void findPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String str2 =str.substring(0, i) + str.substring(i+1);
            
        findPermutation(str2,ans+curr);
        }
    }

    public static void main(String args[]){

        String str ="abc";
        findPermutation(str, "");

    }
}
