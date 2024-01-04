import java.util.*;
public class QueueUsingLinkedlist{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
 static class Queue{

        static Node head = null;
        static Node tail = null;

       

        public static  boolean isEmpty(){
            return head == null && tail == null;
        }
        
        public static void add(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = tail =newnode;
            }

            tail.next=  newnode;
            tail = newnode;
        }

        public static int remove(){

            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1; 
            }
           int front = head.data;
           if(tail == head ){
            tail= head = null;
           }else{
            
                head = head.next;
           }
           return front;
            
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
            
        }

    }

    public static void main(String args[]){
        Queue q = new Queue();

        q.isEmpty();  // true
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.isEmpty();
        
        q.isEmpty();  // false


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    


    }
}
