// Stack is a data structure which can be implemented using multiple data structure
// like  array , arraylist, Linkedlist etc
// We see One by one implementation of the Stack using these above ,method 

import java.util.*;
public class J1_stack{
   static class Stack{

        ArrayList<Integer> list = new ArrayList<>();
        
        public  boolean isEmpty(){
            return list.size() ==0;
        }

        public  void push(int data){
            list.add(data);

        }

        public  int pop(){
            int top = list.get(list.size() -1);
            list.remove(list.size()-1);
            return top;
        }

        public void peek(){
            int top =list.get(list.size() -1);
            return top;
        }

    }

    public static void main(String args[]){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.pop();
        s.peek();

    }
}
