import java.util.*;


public class ArrayListOperation{


    public static void main(String args[]){
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        System.out.println(l1);     

        //this add take linear time to add beacause it travels from start to given index by user
        // l1.add(5,6);
        // System.out.println(l1);     


        // Get Operation on the Arraylist  
        // Constant time O(1)
        // System.out.println(l1.get(3));

        // Remove Operation
        // Constant Time O(1)
        // System.out.println(l1.remove(3));
        
        // Set Operation 
        // set the element  in ArrayList
        // l1.set(4,2);   //set(index, updated Element)
        // System.out.println(l1);    

        // Check Elemet is present or not
        // .contains()
        // System.out.println(l1.contains(3));



    }
}
