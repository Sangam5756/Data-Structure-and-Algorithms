import java.util.*;

public class BruetforceMaxSubarraySum{

    public static void subArraySum(int arr[]){
        
        int sum =0;
        int maxsum =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                sum =0;
                for(int k =i; k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];

                }
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

        subArraySum(arr);


    }
}