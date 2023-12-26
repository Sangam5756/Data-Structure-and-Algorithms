public class LinkedList{
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data =data;
      this.next= null;
    }
  }

  public static Node head;
  public static Node tail;
    
  public static void main(String args[]){
    LinkedList l1  = new LinkedList();
    l1.head = new Node(1);
    l1.head.next = new Node(2);
  }
}
