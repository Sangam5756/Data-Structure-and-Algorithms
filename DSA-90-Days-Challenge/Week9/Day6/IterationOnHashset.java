import java.util.*;

public class IterationOnHashset{

    public static void main(String args[]){

        HashSet<String> set = new HashSet<>();

        set.add("mumbai");
        set.add("Pune");
        set.add("Delhi");
        set.add("germany");
        set.add("America");

        Iterator it = set.iterator();
//          using iterator
        while(it.hasNext()){
            System.out.println(it.next() );
        }

        // using for each
        for(String city : set){
            System.out.println(city );
        }



    }
}
