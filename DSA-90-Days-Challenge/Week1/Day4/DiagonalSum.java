import java.util.*;

public class DiagonalSum{

    public static void diagonalSum(int arr[][]){
        int sum =0;
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] ){
                    sum += arr[i][j];
                }
                if(i+j == arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
            System.out.println(sum);
    }

    public static void main(String args[]){
        int arr[][] ={ 
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};
            diagonalSum(arr);

    }
}