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
    Node newnode =new Node(data);   // Create the Newnode
    if(head == null){
          head=tail=newnode;
          return;
      }
      newnode.next =head;        // newnodes next equals to head
      head = newnode;           // now head is newnode
    
  }

  // ADD Last Operation 
  public void addLast(int data){
    Node newnode  = new Node(data);// 1.Create the newNode
    if(head == null){           // case - head and tail are equal to null means linked list is empty
      head=tail= newnode;
      return;
    }
    tail.next = newnode;    // 2.tails next will newnode
    tail =newnode;          // 3.tail = newnode
    
  }

  // Print The linked list
  public static void printList(){
    if(head == null){
      System.out.println("Linkedlist is Empty");
      return;
    }
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+"->");
      temp =temp.next;
    }
    System.out.println("null");


  }

  public static void main(String args[]){
    LinkedList l1  = new LinkedList();
    // l1.head = new Node(1);
    // l1.head.next = new Node(2);
    printList();
    l1.addFirst(2);
    printList();

    l1.addFirst(1);
    printList();

    l1.addLast(3);
    printList();
    
    l1.addLast(4);
    printList();
  }
}
