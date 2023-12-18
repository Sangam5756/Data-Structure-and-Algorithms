public class J8_MultilevelInheritance{

    public static void main(String args[]){

        Dog bruno=new Dog();
        bruno.eats();
        bruno.breathe();
        bruno.sound ="bhoo- bhoo";
        System.out.println(bruno.sound);

    }
}

// Multilevel Inheritance
        //Base class of derive2    base class of derived3
//base       -->Derived -->          dervice2     -->       dervied3 ....
class Animal{

    void eats(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

class Mammels extends Animal{
    int legs;
}

class Dog extends Mammels{

    String sound;
}