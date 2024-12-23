class Demo {

    static void Swap1(int a,int b){
        int temp =a;
            a=b;
            b=temp;

        System.out.println("After Swapping a = "+a+" and b = "+b);
    }

    static void Swap2(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping a = "+a+" and b = "+b);
    }

    static void Swap3(int a,int b){
        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After Swapping a = "+a+" and b = "+b);
    }

    static void Swap4(int a,int b){
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After Swapping a = "+a+" and b = "+b);
    }
    static void Swap5(int a,int b){
        
        a = (a+b) - (b = a);

        System.out.println("After Swapping a = "+a+" and b = "+b);
    }
}


public class swap{
        
    public static void main(String args[]){
        int a= 10;
        int b=15;
        System.out.println();
        System.out.println("SWAP USING TEMP VARIABLE");
        System.out.println("Before Swapping a = "+a+" and b = "+b);
            Demo.Swap1(a,b);

        System.out.println();
        System.out.println("SWAP USING ADD AND SUB");
        System.out.println("Before Swapping a = "+a+" and b = "+b);
            Demo.Swap2(a,b);

        System.out.println();
        System.out.println("SWAP USING MUL AND DIV");
        System.out.println("Before Swapping a = "+a+" and b = "+b);
            Demo.Swap3(a,b);

        System.out.println();
        System.out.println("SWAP USING OR");
        System.out.println("Before Swapping a = "+a+" and b = "+b);
            Demo.Swap4(a,b);

        System.out.println();
        System.out.println("INLINE SWAP");
        System.out.println("Before Swapping a = "+a+" and b = "+b);
            Demo.Swap4(a,b);
            

    }
}