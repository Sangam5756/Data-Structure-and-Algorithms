/*   
Encapsulation - 
            Wrapping a data and method into a single unit called encapsulation.
            it also implements data hiding

            is hides the data which are useless or sensitive

 */

/*
        Constructors

        it is the special method which are invoked automatically when
            object is created
        
        1. same name as class name
        2.doesn't have the return type
        3.it only called once at object creation
        4.memory is allocated when constructor is called


    There are Differents type of constructor
    1. Parameterized 
    2.Non-Parameterized  // DEFAULT CONSTRUCTOR
    3.Copy Constructor


 */

public class J3_Constructors{

    public static void main(String args[]){

        Student s1  = new Student();
        Student s2  = new Student("Sangam");
        Student s3  = new Student(12);


    }
}


class Student{

    String name;
    int roll;

    Student(){    //Non Parameterized Constructor  // If we not create it then s1 object throw error because java 
    // create the default constructor if there is no other constructor  is present
    
        System.out.println("Constructor is called ..");
    }

/*  here we can see the concept of constructor overloading where constructor is
     called when the parameter match to the specific constructor */

    Student(String name){    //Parameterized Constructor
        this.name =name;
    }

    Student(int roll){    //Parameterized Constructor
        this.roll=roll;
    }
}
