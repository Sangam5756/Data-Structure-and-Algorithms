import java.util.*;


public class K_Level_Tree{

    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = left;
            this.right= right;
        }

    }

    public static void klvl(Node root, int level, int k){

        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data+" ");
            return;
        }

        klvl(root.left, level+1, k);
        klvl(root.right, level+1, k);

    }

    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        klvl(root,1,2);
    }
}
