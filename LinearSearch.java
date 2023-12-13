import java.util.*;

public class  LinearSearch{

    // Function For Search
    public static int linearSearch(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    
// Driver code
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5};
        int key =4;

        int index =linearSearch(arr,key);

        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            
            System.out.println("Found at index "+ index);
        }
    }
}

// output:
// Found at index 3
