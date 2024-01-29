import java.util.*;

public class Delete_Node {

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

  public static Node inorderSuccessor(Node root){

    while(root.left != null){
        root =root.left;
    }
    return root;
  }

  public static Node delete(Node root, int val) {
    if(root.data < val) {        
      root.right = delete(root.right, val);
    } 
    else if (root.data > val) {
      root.left = delete(root.left, val);
    } else {
      
    //   case 1 - leaf node
      if (root.left == null && root.right == null) {
        return null;
      }
    //   case2 children
    if(root.left == null){
        return root.right;
    }
    else if(root.right== null){
        return root.left;
    }

    // case 3  both children
    Node IS = inorderSuccessor(root.right);
    root.data =IS.data;
    root.right =delete(root.right,IS.data);

    }
    return root;
  }
  public static void inorder(Node root){

        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

  public static void main(String args[]) {
    int arr[] = { 5, 1, 3, 4, 2, 7 };
    Node root = null;

    for (int i = 0; i < arr.length; i++) {
      root = insertBst(root, arr[i]);
    }
 inorder(root);
    root = delete(root,5);
    System.out.println();
    inorder(root);
    System.out.println();
  }
}
