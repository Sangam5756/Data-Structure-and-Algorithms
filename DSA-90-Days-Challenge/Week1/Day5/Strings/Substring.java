import java.util.*;
public class Substring{

    public static String subString(String str , int si, int ei){
        String substr ="";

        for(int i=si; i<=ei; i++){
            substr+= str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]){
        String str ="sangam";
        System.out.println(subString(str, 4 ,5));

    }
}