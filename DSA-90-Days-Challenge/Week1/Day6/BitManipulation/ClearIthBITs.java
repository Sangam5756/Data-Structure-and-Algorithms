import java.util.*;


public class ClearIthBITs{

    public static int clearIthBitS(int n, int i){

        int bitmask = -1<<i;  // ~0
        return n& bitmask;
    }

    public static void main(String args[]){
        System.out.println(clearIthBitS(15,2));

    }
}