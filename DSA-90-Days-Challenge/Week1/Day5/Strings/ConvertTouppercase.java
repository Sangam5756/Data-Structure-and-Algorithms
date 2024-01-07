import java.util.*;

public class ConvertTouppercase{

    public static String convertTouppercase(String str){

        StringBuilder  str1 =new StringBuilder("");

        str1.append(Character.toUpperCase(str.charAt(0)));

        for(int i =1 ;i <str.length();i++){
                 if(str.charAt(i)==' ' && i<str.length()-1)
            {
                str1.append(str.charAt(i));
                i++;
                str1.append(Character.toUpperCase(str.charAt(i)));

            }
            else
            {
                str1.append(str.charAt(i));
            }
        }

        
       return str1.toString();
    }

    public static void main(String args[]){

         String str ="hi am sangam";
        System.out.println(convertTouppercase(str));

    }
}