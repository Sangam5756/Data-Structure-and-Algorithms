import java.util.*;

public class Search_In_BST {

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  // Build tree
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

  public static boolean searchBST(Node root, int key) {
    if (root == null) {
      return false;
    }

    if (root.data == key) {
      return true;
    }
    
    if (root.data > key) {
      return searchBST(root.left, key);
    }
    else {
      return searchBST(root.right, key);
    }
  }
  

  public static void main(String args[]) {
    int arr[] = { 5, 1, 3, 4, 2, 7 };
    Node root = null;

    for (int i = 0; i < arr.length; i++) {
      root = insertBst(root, arr[i]);
    }
    if(searchBST(root, 4)){      
        System.out.println("Found");
      
    }else{
        System.out.println("Not Found");

    }
  }
}
