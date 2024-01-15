import java.util.*;

public class CountOfNodes{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }   
        static int idx = -1;
        public static Node buildTree(int nodes[]){
           
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;

            
        }
        public static void traverse(Node root){

            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            traverse(root.left);
            traverse(root.right);
        }

        // Function to count no of nodes
        public static int count( Node root ){

            if(root == null){
                return 0;
            }
            int leftNode = count(root.left);
            int rightNode = count(root.right);

            return (leftNode + rightNode) + 1;
        }


    public static void main(String args[]){

            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            Node root = buildTree(nodes);
            traverse(root);
            int h = count(root);
            System.out.println();

        System.out.println("Count of Node is "+h);
        

    }
}
