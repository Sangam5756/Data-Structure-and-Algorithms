import java.util.*;


public class J2_FindSubset{

    // 2^n subset
    // n is no of character

    public static void findSubset(String str, String ans, int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{

            System.out.println(ans);}
            
            return;
        }
        // YES
        findSubset(str, ans + str.charAt(i), i+1);

        // NO
        findSubset(str, ans, i+1);
    }

    public static void main(String args[]){

        String str ="abc";

        findSubset(str ,"", 0);


    }
}