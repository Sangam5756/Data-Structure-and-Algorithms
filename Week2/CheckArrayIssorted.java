import java.util.*;


public class CheckArrayIssorted{

    public static boolean Issorted(int arr[],int i){
        
        if(i == arr.length){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return Issorted(arr,i+1);
        
        

    }

     public static void main(String args[]){
        int arr[] = {1,2,55,4,5};
        System.out.println(Issorted(arr,0));

     }
}