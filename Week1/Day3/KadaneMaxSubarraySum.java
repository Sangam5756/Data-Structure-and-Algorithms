import java.util.*;


public class KadaneMaxSubarraySum{

    public static void maxSubarraySum(int arr[]){
       int maxsum = Integer.MIN_VALUE;
        int sum =0;
        int check =-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] >0){
                check++;
            }
            
        }

        if(check == -1){
        System.out.println("Array Elements are Negative:"+check);}
        
        
        if(check != -1){for(int i =0;  i<arr.length;i++){
            sum = sum+arr[i];
            if(sum <0){
                sum =0;
            }
            maxsum =Math.max(sum, maxsum);
            
        }
        System.out.println("Max Subarray Sum is :"+maxsum);}
    }

    public static void main(String args[]){
        int arr[] ={-2,-3,4,-1,-2,1,5,-3};
        // int arr[] ={-2,-3};

        maxSubarraySum(arr);


    }
}