import java.util.*;

public class MaxInArraylist{

    public static void main(String args[]){

         ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        System.out.println(l1);

        int  max = Integer.MIN_VALUE;
        
        for(int i=0; i<l1.size();i++){

            if(max < l1.get(i)){
                max =l1.get(i);
            }
        }
        System.out.println(max);


    }
}