import java.util.*;

public class LinkedHashSet{

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
    }
}
