import java.util.*;

public class ContainerWithMostWaterBruetforce{

    public static int mostWater(ArrayList<Integer> height){
        int maxwater =0;
        for(int i=0; i<height.size(); i++){

            for(int j =i+1; j<height.size();j++){
                int ht =Math.min(height.get(i),height.get(j));
                int width = j-1;
                int currwater = ht * width;
                maxwater =Math.max(maxwater, currwater);

            }
        }
    return maxwater;
    }

    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(mostWater(list));

        
    }
}