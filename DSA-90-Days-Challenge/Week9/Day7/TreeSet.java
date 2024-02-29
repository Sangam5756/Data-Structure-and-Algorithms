
import java.util.*;
public class TreeSet{

    public static void main(String args[]){
        
        HashSet<String> set  = new HashSet<>();
        // Insertion is unordered
        set.add("mumbai");
        set.add("Pune");
        set.add("Delhi");
        set.add("germany");
        set.add("America");

        
        System.out.println(set);
          LinkedHashSet<String> set1  = new LinkedHashSet<>();
        // Insertion is ordered
        set1.add("Mumbai");
        set1.add("Pune");
        set1.add("Delhi");
        set1.add("Germany");
        set1.add("America");
        System.out.println(set1);
// Sorted in ascending order
// Tree map
// self balance tree
// Null values is not allowed in tree set
// operation are in O(logn) compared to hashset
        
        TreeSet<String> ts = new TreeSet<>();
        // Alphabetical sorting
        ts.add("Mumbai");
        ts.add("Pune");
        ts.add("Delhi");
        ts.add("Germany");
        ts.add("America");
        System.out.println(ts);


    }
}
