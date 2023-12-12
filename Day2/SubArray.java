import java.util.*;

public class SubArray{ 
  
public static void subarr(int arr[]){
    int ts= 0; // total pair counter initialize to 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0; // sum for every subarray 
               for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");  // print subarray
                    sum+=arr[k]; //add subarray to sum
                    
                }
                ts++;
                System.out.println("Sum: " + sum);  //print sum
            }
            System.out.println();
        }       
                System.out.println("Total pair is :"+ts); //print total pair counter
 
    }
   

       // Driver code
    public static void main(String args[]){
      
        int arr[] ={2,4,6,8,10};      
        pair(arr);

    }
}

output:
2 Sum: 2
2 4 Sum: 6
2 4 6 Sum: 12
2 4 6 8 Sum: 20
2 4 6 8 10 Sum: 30

4 Sum: 4
4 6 Sum: 10
4 6 8 Sum: 18
4 6 8 10 Sum: 28

6 Sum: 6
6 8 Sum: 14
6 8 10 Sum: 24

8 Sum: 8
8 10 Sum: 18

10 Sum: 10

Total pair is :15
