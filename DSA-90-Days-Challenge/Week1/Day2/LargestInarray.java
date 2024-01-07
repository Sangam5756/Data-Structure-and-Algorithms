import java.util.*;

public class LargestInarray{

    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] >largest){
                largest =arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){

        int arr[] ={2,4,5,77,9,10};
        System.out.println( largestNum(arr) );

    }
}