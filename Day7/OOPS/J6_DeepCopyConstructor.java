public class J6_DeepCopyConstructor{

    public static void main(String args[]){


        Student s1 =new Student();
        s1.name ="sangam";
        s1.roll = 91;
        s1.password ="abc";

        s1.marks[0] = 100;
        s1.marks[1] = 300;
        s1.marks[2] = 200;
    /* we create the array store the marks so we copied s1 to s2 after copying we made 
    changes in marks at s1 so that changes will not reflect in s2 even if we copied the data before and 
    changes made  later
    it happens because the s2 object create the array and copy every item of s1 one by one
    so there is no refernce so no change will reflect
      it called Deep (No change) copy
    
    and also there is another deep copy in that we create new array for marks any changes that made in s1 not reflect in the s2*/


        Student s2 =new Student(s1);
        s2.password ="xyz";

        s1.marks[1] =500;
       

        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);


         for(int i=0; i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{

    String name;
    int roll;
    String password;
    int marks[]=new int[3];

    Student(){}

    


    // Deep copy Constructor 
    
    Student( Student s1){
        marks =new int[3];
        this.name =s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] =s1.marks[i];
        }
    }

}
