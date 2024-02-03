import java.util.*;

public class SmallestInarray{

    public static int smallestInArray(int arr[]){
        int small = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        return small;
    }


    public static void main(String args[]){

        int arr[] ={2,4,5,77,1,9,10};
        System.out.println( smallestInArray(arr) );

    }
}
