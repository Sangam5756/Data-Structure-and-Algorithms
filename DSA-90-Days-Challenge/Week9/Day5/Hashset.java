import java.util.*;

public class Hashset{
    
    public static void main(String args[]){
//   it is used to store distinct elements
// set operation are done in constant time O(1)
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2); 
        set.add(3);
        set.add(1);
        set.add(2); 

        System.out.println(set.size());
        set.remove(2);
        System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.contains(1));
        System.out.println(set.size());



    }
}
