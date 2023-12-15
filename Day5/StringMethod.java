import java.util.*;

public class StringMethod{

    public static void  main(String args[]){

        String str1 = "sangam";
        String str2 = "sangam";
        String str3 =new String("sangam");

        if(str1 == str2){
            System.out.println("String are equal");
        }else{
             
            System.out.println("String are not equal");
        }
        if(str1 == str3){
            System.out.println("String are equal");
        }else{
             
            System.out.println("String are not equal");
        }
//  s3 string are create using new keyword thats whys it have the different space in memory
// s1 and s2 are created using regular method and s1 created in memory
//  but s2 string not create new memory it will point to s1 beacause content is same
//  so using .equal it will check actual content and using (==) check memor address
// it also called interning

        if(str1.equals(str3)){
            System.out.println("String are equal");
        }else{
             
            System.out.println("String are not equal");
        }




        System.out.println("\nSTRING BUILDER ");

        StringBuilder str = new StringBuilder("");
        for(char i='a'; i<='z';i++){
            str.append(i);

        }
        System.out.println(str);
        

    }
}