import java.util.*;

public class ReverseString{
    public static String reverseString(String str){
            Stack<Character> s = new Stack<>();
            int idx =0;

            // To push into stack
            while( idx < str.length()){
                s.push(str.charAt(idx));
                idx++;
            }
            // newstring to store the element of stack while poping
            StringBuilder newstr =new StringBuilder("");
            while(!s.isEmpty()){
                char curr = s.pop();
                newstr.append(curr);
            }

            return newstr.toString();

    }

    public static void reverseNumber(int n){
        Stack<Integer> s = new Stack<>();
        int idx=0;
        while(n > 0){
            s.push(n);
        }
    }

    public static void main(String args[]){
        String str = "abc";
        System.out.println(reverseString(str));
        
    }
}
