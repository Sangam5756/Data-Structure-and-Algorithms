import java.util.*;

public class FirstNonrepeatcharacter{

    public static  void nonRepeating(String str){

        int freq [] = new int[26];   // to store index of char a to z
        Queue<Character> q = new LinkedList<>();

        for(int i =0; i<str.length(); i++){

            char ch =str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;   // increase frequency

            while( !q.isEmpty()  && freq[q.peek() - 'a'] > 1){  // remove till find first non repeating  element
                q.remove();
            }
            if( q.isEmpty()){     // print -1 if stack is empty
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");  //print  char in stack
            }

        }
        System.out.println();
    }

    public static void main(String args[]){
        String str = "aabccxb";
        nonRepeating(str);

    }
}
