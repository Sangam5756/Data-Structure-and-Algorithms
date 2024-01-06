import java.util.*;

public class  ReversetheQueue{

    public static void reverse(Queue<Integer> q){
        Stack <Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());   //add queue element into stack
        }
        while(!s.isEmpty()){
            q.add(s.pop());  // again add element into queue according to stack define element will added in reverse order
        }
    }

    public static void main(String args[]){
         Queue <Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+ " ");
            q.remove();
        }

    }
}
