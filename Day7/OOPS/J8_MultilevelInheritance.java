public class J8_MultilevelInheritance{

    public static void main(String args[]){

        Dog bruno=new Dog();
        bruno.eats();
        bruno.breathe();
        bruno.sound ="bhoo-bhoo";
        System.out.println(bruno.sound);

    }
}

// Multilevel Inheritance
        //Base class of Derived2    base class of Derived3
//base       -->Derived -->          Derived2     -->       Derived3 ....
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
