import java.util.*;


class Demo {

    static ArrayList<Integer>getFibbonacciNums(int n){
        int a,b,c,i
        ArrayList<Integer> al = new ArrayList<Integer>();
        a=0;
        b=1;
        al.add(a);
        al.add(b);

        for(int i=1;i<=n-1;i++){
            
        }
    }
}

public class Program{


    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max = Math.max((Math.max(n1,n2)),n3);
        System.out.println(max);

    }
}