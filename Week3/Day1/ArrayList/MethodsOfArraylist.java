import java.util.*;

public class MethodsOfArraylist{

    public static void main(String args[]){

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        // To check the size of the arraylist
        System.out.println(l1.size());
        // Print list using loop
        for(int i =0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");

        }
        
    }
}