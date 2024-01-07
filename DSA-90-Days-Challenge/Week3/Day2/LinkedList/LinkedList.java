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
  public static int size;   //5.size of the linkedlist

  // 1.Add first Operation
  // Add Element at first position of linked list
  public static void addFirst(int data){
    Node newnode =new Node(data);   // Create the Newnode
    size++;
    if(head == null){
          head=tail=newnode;
          return;
      }
      newnode.next =head;        // newnodes next equals to head
      head = newnode;           // now head is newnode
    
  }

  // 2.ADD Last Operation 
  public void addLast(int data){
    Node newnode  = new Node(data);// 1.Create the newNode
    size++;
    if(head == null){           // case - head and tail are equal to null means linked list is empty
      head=tail= newnode;
      return;
    }
    tail.next = newnode;    // 2.tails next will newnode
    tail =newnode;          // 3.tail = newnode
    
  }

  // 3.Print The linked list
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

  // 4.Add in the Middle
  public void AddAtindex(int index, int data){
    if(index == 0){
      addFirst(data);
      return;
    }
    Node newnode = new Node(data);
    size++;
    Node temp = head;
    int i =0;
    while( i < (index-1)){
      temp =temp.next;
      i++;
    }
    newnode.next = temp.next;
    temp.next= newnode;
  }

   //6.Remove the First element from linked list
  public int removeFirst(){

    if(size == 0){
      System.out.println("Linkedlist is empty");
    }else if(size == 1){
      int val =head.data;
      head= tail =null;
      size =0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  //7.Remove last element 
  public int removeLast(){
     if(size == 0){
      System.out.println("Linkedlist is empty");
    }else if(size == 1){
      int val =head.data;
      head= tail =null;
      size =0;
      return val;
    }
  Node temp =head;
    for(int i=0;i<size-2;i++){
      temp =temp.next;
    }
    int val = tail.data;
    temp.next =null;
    tail =temp;
    size--;
    return val;

  }

   // 8.Search In the Linked list
  public static int search(int key){
    Node temp =head;  
    // method 1
    // for(int i =0; i<size; i++){
    //   if(temp.data == key){
    //     return i;
    //   }
    //   temp = temp.next;

    // }
    // return -1;
    // method 2
    int i =0;
    while(temp.next != null){
      if(temp.data == key){
        return i;
      }
      temp =temp.next;
      i++;
    }
    return -1;
    
  }

  public static void main(String args[]){
    LinkedList l1  = new LinkedList();
    // l1.head = new Node(1);
    // l1.head.next = new Node(2);
    l1.addFirst(2);
    l1.addFirst(1);
    l1.addLast(3);    
    l1.addLast(4);    
    l1.AddAtindex(1,5);
                   
    printList();
    l1.removeFirst();
    l1.removeLast();
    printList();
    
    System.out.println("Element found at index :"+l1.search(3));
    System.out.println("Size of the Linkedlist is :"+l1.size);
  }
}
