import java.util.*;
import java.util.LinkedList;

public class LinkedlistCollectionFrameworkuse{

    public static void main(String args[]){

        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(1);//addLast
        ll.addLast(2);//addLast

        ll.addFirst(0);  //addFirst
        System.out.println(ll.contains(2)); // check element is present or not
        ll.removeFirst();  // Remove the first element 
        ll.removeLast(); // Remove the last element
        
        System.out.println(ll);
    }
}
