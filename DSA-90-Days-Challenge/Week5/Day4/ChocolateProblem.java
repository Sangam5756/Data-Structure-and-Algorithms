import java.util.*;


public class ChocolateProblem{

    public static void main(String args[]){

        int n = 4;
        int m = 6;

        Integer costVer[] = {2, 1, 3, 1, 4}; // vertical cost
        Integer costHor[] ={ 4,1,2}; // horizontal Cost

        Arrays.sort(costVer,  Collections.reverseOrder());
        Arrays.sort(costHor,  Collections.reverseOrder());

         int h=0 , v =0;    // Horizonatal and vertical count
         int hp=0, vp =0;   // vertical and horizontal pieces
         int cost= 0;

         while( h <= costHor.length && v < costVer.length ){

            // vertical cost is less than horizontal cost
            if(costVer[v] < costHor[h]){
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }else{
                cost +=(costVer[v] * hp);
                    vp++;
                    v++;
            }
         }

        //  remaining vertical cuts
        while( v < costVer.length){
            cost+= (costVer[v] * hp);
            vp++;
            v++;
        }
        while( h < costHor.length){
            cost+= (costHor[h] * vp);
            hp++;
            h++;
        }

        System.out.println("Min Cost is "+cost);


    }
}