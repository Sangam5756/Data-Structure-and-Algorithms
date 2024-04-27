import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {

        int n1 = a.length;
        int n2 = b.length;
        int i=0;
        int j=0;
        ArrayList<Integer> union = new ArrayList<>();

        while(i < n1  && j <n2){

            if( a[i] < b[j]){

                if(union.size() == 0 || union.get(union.size()-1)!= a[i] ){
                    union.add(a[i]);
                }
                i++;
            }
              
            else{
                 if(union.size() == 0 || union.get(union.size()-1) !=b[j] ){
                    union.add(b[j]);
                }
                j++;
                
            }
        }

        // remaining elements in a
        while( i < n1){
              if(union.get(union.size()-1)!= a[i] ){
                    union.add(a[i]);
                }
                i++;

        }

        // remaining elements in the b
        while(j < n2){
               if(union.get(union.size()-1) !=b[j] ){
                    union.add(b[j]);
                }
                j++;

        }

        return union;



        
    }
}
