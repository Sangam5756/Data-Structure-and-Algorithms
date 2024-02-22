import java.util.*;

public class J4_TreeMap{

    public static void main(String args[]){

        TreeMap<String, Integer> tm = new TreeMap<>();  // sorting based on the key
// Elements are insert in the order we give them
        tm.put("india",100);
        tm.put("china",50);
        tm.put("us",5);
        tm.put("bhutan",10);

        System.out.println(tm);  
    }
}
