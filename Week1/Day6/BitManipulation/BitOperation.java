import java.util.*;

public class BitOperation{

    public static void main(String args[]){

        // Binaray AND operator &
        // Binaray OR operator |
        // Binaray XOR operator ^
        // Binaray Not(1's Compliment) operator ~

        System.out.println(5 & 6);  // 101 & 110 -> 4
        System.out.println(5 | 6);  // 101 & 110 -> 7
        System.out.println(5 ^ 6);  // 101 & 110 -> 3
        System.out.println( ~1);  //     ~01   -> -2  //for positive number take 2's compliment of this

        // Binaray Left Shift
        System.out.println(5 << 2); // -->20    formula -> result = a * 2^b 

        // Binary Right Shift
        System.out.println(5 >> 2); // -->1     formula -> result = a / 2^b 
        

        

    }
}
