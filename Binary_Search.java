import java.util.*;

public class  Binary_Search{

    // Function For Search
    public static int binarySearch(int arr[] , int key){
        int start =0; 
        int end =arr.length-1;

        while(start <= end){
            int mid = (start + end ) /2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start =mid +1;
            }
            else{
                end =mid - 1;
            }
        }
        return -1;
    }

// Driver code
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5};
        int key =4;

        int index =binarySearch(arr,key);

        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            
            System.out.println("Found at index "+ index);
        }

       



    }
}