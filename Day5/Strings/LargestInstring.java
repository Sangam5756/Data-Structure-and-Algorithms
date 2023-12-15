import java.util.*;

public class LargestInstring{

    public static String largest(String str[]){

        String largest ="";
        for(int i =1; i<str.length;i++){
            if(largest.compareTo(str[i]) <0 ){
                largest =str[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){

        String str[] ={"pink", "blue", "red"};

        System.out.println(largest(str));

    }
}