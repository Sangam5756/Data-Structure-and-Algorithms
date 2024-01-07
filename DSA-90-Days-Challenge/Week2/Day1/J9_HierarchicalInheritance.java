public class J9_HierarchicalInheritance{

/*  ONLY ONE BASE class and then multiple class can derived from it;

 */

    public static void main(String args[]){

        Mammels mammels =new Mammels();
        mammels.eats();
        mammels.walk();

        Fish fish =new Fish();
        fish.eats();
        fish.swim();

        Bird bird =new Bird();
        bird.eats();
        bird.fly();

    }
}

class Animal{

    void eats(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

class Mammels extends Animal{
    void walk(){
        System.out.println("WALK");
    }
}

class Fish extends Animal{

    void swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal{

    void fly(){
        System.out.println("fly");    
    }
}

