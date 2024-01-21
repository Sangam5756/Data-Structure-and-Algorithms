import java.util.*;

public class CheckSubtree {

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

  public static boolean isIdentical(Node root, Node subroot) {
    if (root == null && subroot == null) {
      return true;
    }else if (root == null || subroot == null || root.data != subroot.data) {
      return false;
    }

    if (!isIdentical(root.left, subroot.left)) {
      return false;
    }
    if (!isIdentical(root.right, subroot.right)) {
      return false;
    }

    return true;
  }

  public static boolean subtree(Node root, Node subroot) {
    if (root == null) {
      return false;
    }
    if (root.data == subroot.data) {
      if (isIdentical(root, subroot)) {
        return true;
      }
    }

    return subtree(root.left, subroot) || subtree(root.right, subroot);
  }

  public static void main(String args[]) {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);

    Node subroot = new Node(2);
    subroot.left = new Node(4);
    subroot.right = new Node(5);

    System.out.println(subtree(root,subroot));





  }
}
