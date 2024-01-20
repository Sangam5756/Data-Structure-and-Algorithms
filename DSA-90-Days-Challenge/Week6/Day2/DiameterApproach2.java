import java.util.*;

public class DiameterApproach2{

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
         public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight, rightheight) + 1;
    }

        public static void traverse(Node root){

            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            traverse(root.left);
            traverse(root.right);
        }



        // Function to find Diameter Of Tree
        public static int Diameter( Node root ){

            if(root == null){
                return 0;
            }
            int leftT =  Diameter(root.left);
            int leftH = height(root.left);
            
            int rightT = Diameter(root.right);
            int rightH = height(root.right);
            

            int selfdiam =  (leftH + rightH) + 1;
            return Math.max(selfdiam,Math.max(leftT,rightT));
        }
       


    public static void main(String args[]){

            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            Node root = buildTree(nodes);

            // Diameter(root);
            System.out.println(Diameter(root));

    }
}
