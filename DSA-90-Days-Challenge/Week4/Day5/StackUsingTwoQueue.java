import java.util.*;

public class StackUsingTwoqueue{

    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty()  && q2.isEmpty(); 
        }

        public static void push(int value){
            if(!q1.isEmpty()){
                q1.add(value);
            }else{
                q2.add(value);
            }
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                return -1;
            }
            int top = -1;

            // case1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }else{
               while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }

            }
            return top;
        }
        
    }
    public static void  main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
