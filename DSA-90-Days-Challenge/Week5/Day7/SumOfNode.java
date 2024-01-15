import java.util.*;

public class SumOfNode{

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

        // Function to sum of nodes
        public static int sumOfNode( Node root ){

            if(root == null){
                return 0;
            }
            int leftSum  =  sumOfNode(root.left);
            int rightSum = sumOfNode(root.right);

            return (leftSum + rightSum) + root.data;
        }
        public static void order(Node root){

            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data+" ");
                    if(curr.left!= null){
                        q.add(curr.left);
                    }
                    if(curr.right!= null){
                        q.add(curr.right);
                    }
                }
            }
        }


    public static void main(String args[]){

            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            Node root = buildTree(nodes);
            // traverse(root);
            order(root);
            int h = sumOfNode(root);

        System.out.println("Count of Node is "+h);
        

    }
}
