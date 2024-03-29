import java.util.*;


public class Insert_In_MinHeap{

    static class Heap{

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){
                // swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                
                x= par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public void heapify(int i) {
    int leftChild = 2 * i + 1;
    int rightChild = 2 * i + 2;
    int minIdx = i;

    if (leftChild < arr.size() && arr.get(leftChild) < arr.get(minIdx)) {
        minIdx = leftChild;
    }

    if (rightChild < arr.size() && arr.get(rightChild) < arr.get(minIdx)) {
        minIdx = rightChild;
    }

    if (minIdx != i) {
        // swap
        int temp = arr.get(i);
        arr.set(i, arr.get(minIdx));
        arr.set(minIdx, temp);

        // again call if heap is unbalanced
        heapify(minIdx);
    }
}


        public int remove() {
    if (arr.isEmpty()) {
        throw new NoSuchElementException("Heap is empty");
    }

    int data = arr.get(0);

    // Replace the root with the last element
    arr.set(0, arr.get(arr.size() - 1));
    arr.remove(arr.size() - 1);

    // Heapify to maintain the heap property
    heapify(0);

    return data;
}
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String args[]){
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
