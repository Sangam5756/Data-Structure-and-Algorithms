import java.util.*;

public class ArrayPairs{

  //function for the Pairs
public static void pairs(int arr[]){
  for(int i=0; i<arr.length; i++){
    for(int j = i+1; j<arr.length; j++){
      System.out.print("("+ arr[i]+ ","+ arr[j] + ")" );
    }
    System.out.println();
  }
}

  //driver code
  public static void main(String args[]){
    int arr[] ={2,4,6,8,10};
   
     pairs(arr); //function call
    
  }
}

//output:
// (2,4) (2,6) (2,8) (2,10) 
// (4,6) (4,8) (4,10) 
// (6,8) (6,10) 
// (8,10) 
// Total pair is :10
