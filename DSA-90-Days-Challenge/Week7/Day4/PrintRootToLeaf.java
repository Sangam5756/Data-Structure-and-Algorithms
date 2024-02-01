import java.util.*;

public class J5printRootToLeaf {


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

    public static void printpath(ArrayList<Integer>list){
        for(int i=0; i<list.size() ; i++){
            System.out.print(list.get(i) +" ->");
        }
        System.out.println("null");
    }
  public static void printRootToLeaf(Node root ,ArrayList<Integer> list){

    if(root == null){
        return;
    }
    list.add(root.data);
    if(root.left == null && root.right == null){
         printpath(list);
    }

    printRootToLeaf(root.left,list);
    printRootToLeaf(root.right,list);

    list.remove(list.size() -1);

    
  }



  public static void main(String args[]) {
    int arr[] = { 8, 5, 3,1,4, 6, 10, 11,14 };
    Node root = null;

    for (int i = 0; i < arr.length; i++) {
      root = insertBst(root, arr[i]);
    }
    // inorder(root);

    printRootToLeaf(root,new ArrayList<>());
  }
}
