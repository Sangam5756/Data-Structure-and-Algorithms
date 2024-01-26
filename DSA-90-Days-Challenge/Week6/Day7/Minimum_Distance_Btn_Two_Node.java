import java.util.*;

public class Minimum_Distance_Btn_Two_Node {

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static Node lCA(Node root, int n1, int n2) {
    if (root == null || root.data == n1 || root.data == n2) {
      return root;
    }

    Node leftlca = lCA(root.left, n1, n2);
    Node rightlca = lCA(root.right, n1, n2);

    if (rightlca == null) {
      return leftlca;
    }

    if (leftlca == null) {
      return rightlca;
    }

    return root;
  }

    public static int lcadist(Node root, int n){

        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftlca = lcadist(root.left,n);
        int rightlca = lcadist(root.right,n);

        if(leftlca == -1  && rightlca == -1){
            return -1;
        }else if(leftlca == -1){
            return rightlca+1;
        }else{
            return leftlca+1;
        }



    }

  public static int  minDist(Node root, int n1, int n2){

    Node lca  = lCA(root,n1,n2);
    int d1 = lcadist(lca,n1);
    int d2 = lcadist(lca,n2);

    return d1+d2;
  }

  public static void main(String args[]) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    int n1 = 4;
    int n2 = 5;
    System.out.println(minDist(root, n1, n2));
  }
}
