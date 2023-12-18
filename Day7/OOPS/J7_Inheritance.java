public class J1_Inheritance{

    public static void main(String args[]){

        Fish jelly =new Fish();
        jelly.eats();
        jelly.breathe();

    }
}

// SINGLE LEVEL Inheritance 
//  only one class is derived from base class

class Animal{

    void eats(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

class Fish extends Animal{

    int fins;
    
    void swim(){
        System.out.println("It can Swim");
    }
}