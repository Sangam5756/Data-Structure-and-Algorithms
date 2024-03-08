import java.util.*;
public class CreateTriee{

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i=0; i< 26; i++){
                children[i] = null;
            }
        }

    }
    public static Node root = new Node();


    public static void  main(String args[]){
        String word[] = {"the","a","there","their","any","thee"};

      

    }
}
