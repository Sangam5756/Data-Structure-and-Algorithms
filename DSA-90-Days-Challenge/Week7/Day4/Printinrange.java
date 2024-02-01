import java.util.*;

public class Printinrange {

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

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  // PRINTINRANGE
  public static void printrange(Node root, int k1, int k2) {
    if (root == null) {
      return;
    }
    if (root.data >= k1 && root.data <= k2) {
      printrange(root.left, k1, k2);
      System.out.print(root.data + " ");
      printrange(root.right, k1, k2);
    } else if (root.data < k1) {
      printrange(root.right, k1, k2);
    } else {
      printrange(root.left, k1, k2);
    }
  }

  public static void main(String args[]) {
    int arr[] = { 5, 1, 3, 4, 2, 7 };
    Node root = null;

    for (int i = 0; i < arr.length; i++) {
      root = insertBst(root, arr[i]);
    }
    // inorder(root);

    printrange(root,1,5);
  }
}
