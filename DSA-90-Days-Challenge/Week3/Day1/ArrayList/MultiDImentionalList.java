import java.util.*;

public class MultiDImentionalList{

    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(1); list1.add(2);
        mainlist.add(list1);

        // List 2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainlist.add(list2);

       
        for(int i =0; i<mainlist.size();i++){
            ArrayList<Integer> curr =mainlist.get(i);

            for(int j=0; j<mainlist.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);


        
    }
}