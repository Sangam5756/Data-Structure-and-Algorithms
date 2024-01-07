import java.util.*;


public class FactorialOfN{

    public static int factorial(int number){
        if(number ==0){
            return 1;
        }
      int  fnm1 =factorial(number-1);
        int fact = number * fnm1;

        return fact;
    }

    public static void main(String args[]){
        int n = factorial(5);

        System.out.println(n);

    }
}