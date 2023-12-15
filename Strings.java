import java.util.*;

public class Strings{

    public static void printletters(String str){

        for(int i =0 ; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){

        // Input in the string
        String name;
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the Name  :");
        name=sc.nextLine();
        System.out.println(name);
        
        // Find out the length of the string
        System.out.println(name.length());

        // Concatenation in the String
        System.out.print("Enter first name :");
        String firstName =sc.next();
        System.out.print("Enter Last name :");
        String lastName =sc.next();

        String fullName = firstName +" "+ lastName;

        System.out.println(fullName);

        // print each character of string
        // Method chatAt()
        printletters(fullName);



    }
}