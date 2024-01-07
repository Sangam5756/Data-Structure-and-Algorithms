public class LinkedList{

  public static  class Node {
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next =null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
  
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

    public static  boolean iscycle(){
        Node slow= head;
        Node fast =head;
        while( fast!=null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
     public static  void removeCycle(){
        Node slow= head;
        Node fast =head;
        boolean cycle =false;
        while( fast!=null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;

            if(slow == fast){
                cycle=true;
                break;
            }
            
        }
        if(cycle == false){
            return;
        }
        slow =head;
        Node prev= null;
        while(slow != fast){
            prev =fast;
            slow = slow.next;
            fast =fast.next;
        }
        prev.next =null;
        
    }
    private Node getMid(Node head){
        Node slow= head;
        Node fast =head;
        while( fast!=null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;

        }
        return slow;
    }
    private Node merge(Node leftpart, Node rightpart){
        Node mergedll =new Node(-1);
        Node temp= mergedll;
        
         while(leftpart !=null && rightpart != null){
            if(leftpart.data <= rightpart.data){
                temp.next = leftpart;
                leftpart = leftpart.next;
                temp = temp.next;
            }
            else{
                temp.next = rightpart;
                rightpart = rightpart.next;
                temp = temp.next;
            }
         }

         while(leftpart != null){
            temp.next = leftpart;
            temp = temp.next;
            leftpart = leftpart.next;
         }

         while(rightpart != null){
            temp.next = rightpart;
            rightpart =rightpart.next;
            temp = temp.next;
         }

        return mergedll.next;
    }

    // MergerSOrt
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        Node mid = getMid(head);

        // Split the list into two halves
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        // Recursively sort each half
        Node sortedLeft = mergeSort(left);
        Node sortedRight = mergeSort(right);

        // Merge the sorted halves
        return merge(sortedLeft, sortedRight);
    }

 
// Zig-Zag Linkedlist
    public void zigzag(){
        // find mid;

        Node slow= head;
        Node fast= head;
        while( fast != null && fast.next != null){
            slow = slow.next;        // +1
            fast = fast.next.next;  //+2
        }
        Node mid = slow;
        
        // separate left and right part
        Node curr = mid.next;
        mid.next =null;
        
        Node prev =null;
        Node next;
        // reverse
        while( curr!= null){
            next = curr.next;
            curr.next =prev;
            prev =curr;
            curr =next;
        }
        Node left = head;
        Node right =prev;
        Node nextL,nextR;
        
        // merge in alternate way
        while( left!= null && right!=null){
            nextL       = left.next;
            left.next   = right;
            nextR       = right.next;
            right.next  = nextL;

            left = nextL;
            right = nextR;
        }

    }

    

    public static void main(String args[]){

        // head =new Node(1);
        // head.next =new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next =head;
        // System.out.println(iscycle());

        // head =new Node(1);
        // Node temp =new Node(2);
        // head.next =temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(iscycle());
        // removeCycle();
        // System.out.println(iscycle());

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.printList();
         Node merge = ll.mergeSort(ll.head); // Corrected: Call mergeSort on ll.head
         ll.printlist(merge); // Print the sorted list
        System.out.print(merge);
        ll.zigzag();
        ll.printList();



    }
}
