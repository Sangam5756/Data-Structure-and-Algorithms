import java.util.*;

public class IsvalidBST {


  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }


  public static Node insertBst(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }

    if (val < root.data) {
      root.left = insertBst(root.left, val);
    }
    if (val > root.data) {
      root.right = insertBst(root.right, val);
    }
    return root;
}
public static boolean isValidBST(Node root, Node min, Node max) {
    if (root == null) {
        return true;
    }
    if (min != null && root.data <= min.data) {
        return false;
    } else if (max != null && root.data >= max.data) {
        return false;
    }

    return (isValidBST(root.left, min, root) && isValidBST(root.right, root, max));
}




  public static void main(String args[]) {
    // int arr[] = { 8, 5, 3,1,4, 6, 10, 11,14 };
    int arr[] = { 1,1,1 };
    Node root = null;

    for (int i = 0; i < arr.length; i++) {
      root = insertBst(root, arr[i]);
    }

    // inorder(root);
    if(isValidBST(root,null,null)){
        System.out.println("valid");
    }
    else{
        System.out.println("Not valid");
    }

  }
}
