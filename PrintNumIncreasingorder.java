import java.util.*;

public class PrintNumIncreasingorder{

    public static void printNumIncreasingOrder(int number){
        if(number == 1){
        System.out.print(1 +" ");
        return;    
        }
        printNumIncreasingOrder(number - 1);
        System.out.print(number +" ");
    }

    public static void main(String args[]){
        printNumIncreasingOrder(10);

    }
}