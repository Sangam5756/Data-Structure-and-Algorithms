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


// Add first Operation
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

  // ADD Last Operation 
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

  // Print The linked list
  public static void printList(){
    if(head == null){
      System.out.println("null");
      return;
    }
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+"->");
      temp =temp.next;
    }
    System.out.println("null");


  }

  // Add element at index 
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
  // 9. Search linkedlist recursively
public static int help(Node head,int key){
  
  if(head.next == null){
    return -1;
  }
  if(head.data == key){
    return 0;
  }
   int idx =help(head.next,key);
   if(idx == -1){
    return -1;
   }
  return idx+1;
}  
public static int searchRecursive(int key){
  return help(head,key);
}
//10. Reverse the linked list
public static void reverseLinkedlist(){
  Node prev =null;
  Node curr =tail =head;
  Node next;  
  while(curr!=null){
    next = curr.next;
    curr.next= prev;
    prev =curr;
    curr =next;
  }
  head = prev;
}
// 11.Delete the nth node from end 
  public static void deleteNthnodeFromend(int n){
    int sz =0;
    Node temp =head;
    while(temp != null){
      temp = temp.next; 
      sz++;
    }
    // to delete the head
    if( n == sz){
      head= head.next;
      return;
    }

    int i =1;
    int tofind =sz -n;
    Node prev =head;
    while( i< tofind){
      prev=prev.next;
      i++;
    }
    prev.next = prev.next.next;
    size--;
    return;
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
    reverseLinkedlist();
    deleteNthnodeFromend(3);
    printList();
    // System.out.println("Element found at index :"+l1.searchRecursive(3));
    System.out.println("Size of the Linkedlist is :"+l1.size);
  }
}
