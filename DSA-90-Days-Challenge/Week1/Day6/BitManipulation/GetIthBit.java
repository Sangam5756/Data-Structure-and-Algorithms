import java.util.*;

public class GetIthBit{

    public static int getIthBit(int n, int i){

        int bitmask = n<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        return 1;
    }

    public static void main(String args[]){

        System.out.println(getIthBit(5,1));


    }
}