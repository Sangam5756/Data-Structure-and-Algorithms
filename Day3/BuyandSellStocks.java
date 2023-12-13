import java.util.*;

public class BuyandSellStocks{

    public static int byandSellStock(int arr[]){

        int BP = Integer.MAX_VALUE;
        int Maxprofit =0;
        

        for(int i =0; i< arr.length;i++){
            if(BP < arr[i] ){
                int profit =arr[i] - BP;
                Maxprofit =Math.max(Maxprofit, profit);
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