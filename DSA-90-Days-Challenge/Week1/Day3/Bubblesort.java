import java.util.*;

public class Bubblesort{
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){

        for(int i=0; i<arr.length; i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] =arr[i];
                    arr[i] =temp;

                }
            }
        }
    }

    public static void main(String args[]){

        int arr[] ={5,4,3,2,1};
        print(arr);
        bubbleSort(arr);
        print(arr);

    }
}