import java.util.*;

public class ReverseStack{

    public static void pushAtbottom(Stack<Integer> s, int data){

        // when empty push new element at bottom
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // Pop elements
        int top = s.pop();
        // call for function
        pushAtbottom(s,data);
        // push element in stack
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }
        int top =s.pop();
        reverseStack(s);
        pushAtbottom(s,top);

    }
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void main(String args[]){

        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(2);
        s.push(1);
        //123
        print(s);
        reverseStack(s);
        print(s);

        
    }
}
