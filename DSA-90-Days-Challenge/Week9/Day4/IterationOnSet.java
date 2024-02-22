import java.util.*;

public class IterationOnSet{

    public static void main(String args[])
    {
        HashMap< String, Integer> hm = new HashMap<>(); // it is unordered data structure


        hm.put("india",150);
        hm.put("china",50);
        hm.put("us",5);
        hm.put("bhutan",10);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println(" key " +k+" , value =" + hm.get(k));

        }

    }
}
