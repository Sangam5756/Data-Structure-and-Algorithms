import java.util.*;


public class Checknispoweroftwo{

    public static boolean checknispoweroftwo(int n){
        return (n &(n-1)) == 0;
    }

    public static void main(String args[]){
        System.out.println(checknispoweroftwo(16));

    }
}