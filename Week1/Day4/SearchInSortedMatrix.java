import java.util.*;

public class SearchInSortedMatrix{

    public static boolean staircase(int arr[][], int key){

        int row= 0;
        int col =arr[0].length-1;
        
        while( row < arr.length && col >=0){

            if(arr[row][col] == key){
                System.out.println(" Found At index ("+row+","+col+")");
                return true;
            }

            if( key < arr[row][col]){
                col--;
            }else
            {
                row++;
            }
        }
        return false;
    }
    

    public static void main(String args[]){
        int arr[][] ={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        staircase(arr,39);


    }
}