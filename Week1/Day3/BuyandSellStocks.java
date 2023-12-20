import java.util.*;

public class BuyandSellStocks{

    public static int byandSellStock(int arr[]){

        int BP = Integer.MAX_VALUE;  // buying price
        int Maxprofit =0;
        

        for(int i =0; i< arr.length;i++){
            if(BP < arr[i] ){
                int profit =arr[i] - BP;  //calculate profit
                Maxprofit =Math.max(Maxprofit, profit);  // maximum profit
            }
            else{
                BP =arr[i];
            }
        }
        return Maxprofit;
    }

    public static void main(String args[]){

        int arr[] = { 7,1,5,3,6,4};
        System.out.println(byandSellStock(arr));


    }
}


// output:
// 5
