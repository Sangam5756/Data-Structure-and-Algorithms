import java.util.*;

public class Activityselection{

    public static int activities(int start[], int end[]){

        int maxAct =1;
        int lastend =end[0];

        for(int i=0; i<end.length; i++){
            if(start[i] > lastend ){
                maxAct++;
                lastend = end[i];
            }
        }
        return maxAct;
    }

    public static void main(String args[]){

        int start[] = {1, 3, 0, 5, 8,5};
        int end  [] ={2, 4, 6, 7, 9, 9};

        System.out.println(activities(start,end));
//         // EndTime Basis Sorted
//         int maxAct = 0;  //maximum activities
//         ArrayList<Integer> ans = new ArrayList<>();

//         // first activity
//         maxAct = 1; 
//         ans.add(0);
//         int lastend =end[0];
//         for(int i=1; i< end.length;i++ ){
//             if( start[i] >= lastend){
//                 maxAct++;
//                 ans.add(i);
//                 lastend =end[i];
//             }

//         }
//         System.out.println("Maximum Activities is "+maxAct);
//        for (int i = 0; i < ans.size(); i++) {
//     System.out.print("A"+ans.get(i) + " ");
// }



    }
}