import java.util.*;

public class ThreeDimensionalList{

    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> mainlist =new ArrayList<>();
        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        ArrayList<Integer> list3 =new ArrayList<>();

        // list1.add(1);list1.add(2);list1.add(3);list1.add(4);
        // list2.add(2);list2.add(4);list2.add(6);list2.add(8);
        // list3.add(3);list3.add(6);list3.add(9);list3.add(15);
        for(int i=1; i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
System.out.println(mainlist);
        for(int i =0; i<mainlist.size();i++){
            ArrayList<Integer> curr =mainlist.get(i);
            for(int j=0; j<mainlist.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }



        

        


    }
}