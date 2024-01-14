import java.util.*;

public class PostOrder{

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

    // Binary tree
    public static class BinaryTree{

        // Idx taken to track nodes
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if( nodes[idx] == -1){
                return null;
            }

            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        }

        public static void postOrder(Node root){

            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

    }

    public static void main(String args[]){
           int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

           BinaryTree tree = new BinaryTree();

           Node root = tree.buildTree(nodes);

           tree.postOrder(root);

    }
}