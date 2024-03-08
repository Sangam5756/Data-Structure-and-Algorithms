import java.util.*;
public class CreateTrie{
// Here we created the triee 
  // create the children arra for the character 
  // initialized that with null
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
