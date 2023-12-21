import java.util.*;

public class ConsecutiveBinaryStringProblem{

    public static void consecutiveBinStr(int n, int lastplace,String str){

        if(n == 0){
            System.out.println(str);
            return;
        }
        
        consecutiveBinStr(n-1,0,str+"0");
        if( lastplace == 0){
            consecutiveBinStr(n-1,1,str+"1");
        }

    }

    public static void main(String args[]){
            consecutiveBinStr(3,0,"");
    }
}