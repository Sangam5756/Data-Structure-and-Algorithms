// inbuild pakages 
// pakages are group of similar type of class.,interface and subpakages
// Abstraction 

/*
        1. we can not create object of abstract class
        2.it can have the constructor 
     */
public class J12_Abstract{


        public static void main(String args[]){
                // Horse h = new Horse();
                // h.eat();
                // h.walk();
                // h.changeColor();
                // System.out.println(h.color);

                Mustang m =new Mustang();
                // Constructor call -  ANIMAL-->HORSE-->MUSTANG


        }
}

abstract class Animal {
        String color;
        Animal (){                
                // color ="Brown";
                System.out.println("This is Animals Constructor called");
        }

        void eat(){
                System.out.println("Animal Eats");
        }

        abstract void walk();    // all class derived from Animal Must have the method walk
}


class Horse extends Animal{
        void changeColor(){
                color =" Grey";
        }

        Horse(){
                System.out.println("This is Horse Constructor called");

        }
        void walk(){
                System.out.println("Horse can Walk on 4 legs");
        }
}

class Mustang extends Horse{
        Mustang(){
                System.out.println("This is Mustangs Constructor called");
        }
}

