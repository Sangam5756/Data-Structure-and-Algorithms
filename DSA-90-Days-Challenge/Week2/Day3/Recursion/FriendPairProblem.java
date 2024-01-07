import java.util.*;

public class FriendPairProblem{

    public static int pairingWays(int n){
        // base 
        if( n == 1 || n == 2){
            return n;
        }
        // int fnm1 =pairingWays(n-1);
        // int fnm2 = fnm1 * pairingWays(n-2);

        // int totalways = fnm1 + fnm2;
        // return totalways;
        return pairingWays(n-1) + (n-1) * pairingWays(n-2);
    }

    public static void main(String args[]){
        int ways = pairingWays(3);
        System.out.println(ways);


        
    }
}