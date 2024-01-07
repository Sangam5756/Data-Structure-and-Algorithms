public class J11_Polymorphism{
    /*
        same name having different Defination called polymorphism
        TWO TYPE
        1.COMPILE TIME POLYMORPHISM(Static)
            1.1 Method Overloading
            

        2.RUN TIME POLYMORPHISM(Dynamic)
            2.1 Method Overriding
     */
    public static void main(String args[]){

        // FUNCTION OVERLOADING
       Calculator cal = new Calculator();
        System.out.println(cal.sum(2,3));
        System.out.println(cal.sum(2.5f,3.5f));
        System.out.println(cal.sum(1,2,3));


        // FUNCTION OVERRIDING 
        // Base class and derived class both contain same function same parameter but
        //    different defination called overriding

        Deer dr =new Deer();
        dr.eat();  //it called the child class function mean if we create base class object the it will called base class functin
        // means function called depends on the class object

    }
}



// OVERRIDING CLASS
class Animal{
    void eat(){
        System.out.println("Eat Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eat Grass");

    }
}

// OVERLOADING CLASS
class Calculator{

    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}