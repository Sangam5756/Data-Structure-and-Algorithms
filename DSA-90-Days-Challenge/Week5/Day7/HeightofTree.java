import java.util.*;

public class J6_HeightofTree{

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
    static int  idx =-1;
    public static Node Bulidtree(int nodes[]){
        idx++;

        if( nodes[idx] == -1){
            return null;
        }
        Node newnode = new Node(nodes[idx]);
        newnode.left = Bulidtree(nodes);
        newnode.right = Bulidtree(nodes);
        return newnode;
        
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight, rightheight) + 1;
    }

    public static void traverse(Node root){
        if( root == null){
            return;
        }
        System.out.print(root.data+" ");
        traverse(root.left);
        traverse(root.right);
    }
    

    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = Bulidtree(nodes);

        traverse(root);
        int h = height(root);
        System.out.println();

        System.out.println("Height of Tree is "+h);
        
        
    }
}
