import java.util.*;

public class SubArray{ 
 public static void subArray(int arr[]){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum =0;

            for(int j=i;j<arr.length;j++){
                                sum =0;

                for(int k =i; k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                  System.out.print("="+sum);
                  System.out.println();
            }
            System.out.println();
        }

    }

    public static int subArrayMaxSum(int arr[]){
        int sum =0;
        int max =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum =0;

            for(int j=i;j<arr.length;j++){
                                sum =0;

                for(int k =i; k<=j;k++){
                    sum+=arr[k];
                }
                if(sum > max){
                    max =sum;
                }
            }
            
        }
        return max;

    }
    public static int totalPairs(int arr[]){
        int total =0;
        for(int i=0; i<arr.length; i++){

            for(int j=i;j<arr.length;j++){
                total++;
            }
        }
        return total;

    }

       // Driver code
    public static void main(String args[]){
      
        int arr[] ={2,4,6,8,10};      
         subArray(arr);
        System.out.print(subArrayMaxSum(arr));
        System.out.print(totalPairs(arr));


    }
}

output:1 =1
1 2 =3
1 2 3 =6
1 2 3 4 =10
1 2 3 4 5 =15

2 =2
2 3 =5
2 3 4 =9
2 3 4 5 =14

3 =3
3 4 =7
3 4 5 =12

4 =4
4 5 =9

5 =5
Total pair is :15
Max sum is : 15
