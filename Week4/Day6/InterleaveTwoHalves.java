import java.util.*;

public class interleave2halves{
    public static void interLeaves(Queue<Integer> q){

        Queue<Integer> q1 = new LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2; i++){
            q1.add(q.remove());   // half elemet into q1

        }
        while(!q1.isEmpty()){
            q.add(q1.remove());  // add these half to q1 to q
            q.add(q.remove());// add these remaining q element to q after q1// one q1,one q2 like that


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

        interLeaves(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+ " ");
            q.remove();
        }


        
    }
}
