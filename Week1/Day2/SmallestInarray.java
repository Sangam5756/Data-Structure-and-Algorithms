import java.util.*;

public class SmallestInarray{

    public static int smallestNum(int arr[]){
        int minimum = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] <minimum){
                minimum =arr[i];
            }
        }
        return minimum;
    }

    public static void main(String args[]){

        int arr[] ={2,4,5,77,1,9,10};
        System.out.println( smallestNum(arr) );

    }
}