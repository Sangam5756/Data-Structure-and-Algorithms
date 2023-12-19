import java.util.*;

// Time complexity  O(logn);
public class XtoPowernOptimized{

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        int halfpower = power(x, n/2) * power(x, n/2);

        if(n % 2 != 0){
            halfpower =x * halfpower;
        }

        return halfpower;
    }
    public static void main(String[] args){
        int n = power(2,5);
        System.out.println(n);
    }
}