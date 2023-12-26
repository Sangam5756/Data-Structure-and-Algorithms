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

  // Add first Operation
  // Add Element at first position of linked list
  public static void addFirst(int data){
    // Create the Newnode
    Node newnode =new Node(data);

    if(head == null){
      head=tail=newnode;
      return;
    }
    // assign nodes next equals to head
    newnode.next =head;
    head = newnode;
    
  }

  public static void main(String args[]){
    LinkedList l1  = new LinkedList();
    // l1.head = new Node(1);
    // l1.head.next = new Node(2);
    l1.addFirst(1);
    l1.addFirst(2);
  }
}
