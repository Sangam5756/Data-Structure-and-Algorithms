import java.util.*;

public class FibbonacciSeries{

    public static int Fibbonacci(int number ){

        if(number ==0 || number ==1){
            return number;
        }

        int fnm1 = Fibbonacci(number-1);
        int fnm2 = Fibbonacci(number-2);
        int fib =fnm1 +fnm2;
        return fib;
    }

    public static void main(String args[]){
        int n = Fibbonacci(5);
        System.out.println(n);
        
    }
}