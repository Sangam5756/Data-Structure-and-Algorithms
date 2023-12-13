import java.util.*;

public class PrefixMaxSubarraySum{


    public static void maxSumSubArray(int arr[]){

        int prefix[] =new int [arr.length-1];

        prefix[0] =arr[0];
        for(int i=0;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

         int sum =0;
        int maxsum =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                sum =0;
               
               maxsum = i ==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(sum > maxsum){
                    maxsum =sum;
                }
                System.out.println();
            }
        }
            System.out.println("Subarray max sum is :"+maxsum);
    
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};

        maxSumSubArray(arr);

    }
}