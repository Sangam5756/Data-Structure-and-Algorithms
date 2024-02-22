import java.util.*;
public class CreateHashmapCrudOperation{

//  it perform insert,delete,get, in constant time
    public static void main(String args[]){

        HashMap< String, Integer> hm = new HashMap<>(); // it is unordered data structure

//      insert O(1)
        hm.put("India",150);
        hm.put("china",50);
        hm.put("bhutan",10);

        System.out.println(hm);

        // Get O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // // contains key O(1)
        // System.out.println(hm.containsKey("india"));
        // System.out.println(hm.containsKey("India"));

        // // RemoveOperation O(1)
        // System.out.println(hm.remove("china"));
        
        // System.out.println(hm);

        // SIZE
        System.out.println(hm.size());

        // Is Empty
        System.out.println(hm.isEmpty());

        // CLear function - all data get deleted from map and it become empty
        hm.clear();
        System.out.println(hm.isEmpty());





    }

}
