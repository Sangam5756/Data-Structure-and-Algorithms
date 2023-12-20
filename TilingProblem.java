import java.util.*;

public class TilingProblem{

    public static int tilingProblem(int n){
        
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = tilingProblem(n-1);
        int fnm2 =tilingProblem(n-2);
        

        return (fnm1+fnm2);
    }

    public static void main(String args[]){

        int Ways =tilingProblem(66);
        System.out.println(Ways);

    }
}