import java.util.*;

public class PrintNumDecreasingorder{

    public static void printNumDecreasingOrder(int number){

        if(number == 1){
            System.out.print(1 + " ");    
            return;
        }

        System.out.print(number + " ");

        printNumDecreasingOrder(number - 1);
    }

    public static void main(String args[]){

        printNumDecreasingOrder(10);

    }
}