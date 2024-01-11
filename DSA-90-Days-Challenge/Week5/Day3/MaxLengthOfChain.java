import java.util.*;


public class MaxLengthOfChain{

    public static void main(String args[]){   //O(nlogn)

        int arr[][] = {{5,24}, {39,90}, {5,28}, {27,40}, {50,90},};

        Arrays.sort(arr, Comparator.comparingDouble( o -> o[1]));

        int chainlen =1;
        int pairend =  arr[0][1]; // last selected pair // chain end

        for(int i=1; i<arr.length; i++){
            if(arr[i][0] > pairend){
                chainlen++;
                pairend =arr[i][1];


            }
        }
        System.out.println("Max chain pair length will be :"+chainlen);
    }
}