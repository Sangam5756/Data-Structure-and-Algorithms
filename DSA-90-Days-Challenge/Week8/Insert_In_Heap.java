import java.util.*;


public class J2_Insert_In_Heap{

    static class Heap{

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(x)){
                // swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                
            }
        }
    }
    public static void main(String args[]){

    }
}
