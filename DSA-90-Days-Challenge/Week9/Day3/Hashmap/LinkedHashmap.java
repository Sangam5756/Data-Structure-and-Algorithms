import java.util.*;

public class J3_LinkedHashmap{

    public static void main(String args[]){

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
// Elements are insert in the order we give them
        lhm.put("india",100);
        lhm.put("china",50);
        lhm.put("us",5);
        lhm.put("bhutan",10);

        System.out.println(lhm);  
    }
}
