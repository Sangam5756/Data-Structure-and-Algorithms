import java.util.*;

public class ImplementusingLinkedlist{
    static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static class Stack{
    static Node head = null;

    // Function to check stack is empty
    public boolean isEmpty(){
      return head == null;
    }
    // Push the data into stack
    public void push(int data){
      Node newnode = new Node(data);
      if(isEmpty()){
        head =newnode;
        return;
      }
      newnode.next = head;
      head = newnode;
    }

    // Pop element from the stack
    public int pop(){
      if(isEmpty()){
        return -1;
      }
      int top =head.data;
      head = head.next;
      return top;
    }
    // To get element from the stack
    public int peek(){
      if(isEmpty()){
        return -1;
      }
      return head.data;
    }
  }

  

    public static void main(String args[]){

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.pop();
      
        System.out.println(s.peek());


    }
}
