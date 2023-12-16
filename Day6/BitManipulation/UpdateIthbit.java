import java.util.*;


public class UpdateIthbit{

    public static int clearIthBit(int n, int i){

        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int setIthbit(int n, int i){
        int bitmask  = 1<<i;
        return n|bitmask;
    }

    public static int updateIthBit(int n, int i, int newbit){
        if(newbit ==0){
            return clearIthBit(n,i);
        }else{
            return setIthbit(n,i);
        }
    }

    public static void main(String args[]){

        System.out.println(updateIthBit(10,2,1));

    }
}