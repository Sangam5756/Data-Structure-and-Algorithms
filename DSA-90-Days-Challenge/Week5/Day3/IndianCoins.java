import java.util.*;

public class IndianCoins{


    public static void main(String args[]){

        Integer arr[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(arr, Comparator.reverseOrder());

        ArrayList<Integer> list = new ArrayList<>();

        int amount = 590;
        int count =0;

        for(int i=0; i< arr.length; i++){

            if(arr[i] <= amount){
                while( arr[i] <= amount){
                    count++;
                    list.add(arr[i]);
                    amount -= arr[i];
                }

            }
        }
    System.out.println(count+" ");
        for(int i=0; i<list.size(); i++){

            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}