import java.util.*;
public class Anagram{

    public static void check(String s1, String s2){
        s1 =s1.toLowerCase();
        s2 =s2.toLowerCase();
        if(s1.length() == s2.length()){

            char str1[] =s1.toCharArray();
            char str2[] =s2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            boolean result =Arrays.equals(str1,str2);

            if(result){
                System.out.println(s1 +" and "+s2+" are anagrams of each other");
            }else{
                System.out.println(s1 +" and "+s2+" are Not anagrams of each other");
            }

        }
        else{
            System.out.println(s1 +" and "+s2+" are Not anagrams of each other");
        }
    }

    public static void main(String args[]){
            String s1 ="race";
            String s2 ="care";

            check(s1,s2);
    }
}
