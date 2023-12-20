public class J10_HybridInheritance{

/*  ONLY ONE BASE class and then multiple class can derived from it;

 */

    public static void main(String args[]){
        System.out.println(" \nMAMMALS\n");
        Dog dog =new Dog();

        dog.eats();
        dog.breathe();
        dog.sound();
        dog.walk();
System.out.println("\n CAT\n");
        Cat cat =new Cat();

        cat.eats();
        cat.breathe();
        cat.sound();
        cat.walk();

System.out.println("\n human\n");
        Human human =new Human();

        human.eats();
        human.breathe();
        human.sound();
        human.walk();

System.out.println("\n FISH\n");
        Shark shark = new Shark();
        shark.eats();
        shark.breathe();
        shark.swim();
        shark.big();

    System.out.println("\n BIRD\n");

        Parrot parrot = new Parrot();
        parrot.eats();
        parrot.breathe();
        parrot.fly();
        parrot.food();


        






        

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

class Mammals extends Animal{
    void walk(){
        System.out.println("WALK");
    }
}

class Dog extends Mammals{
    void sound(){
        System.out.println("BHOOO - BHOOO");
    }
}
class Cat extends Mammals{
    void sound(){

        System.out.println("Mau -mau");
    }
}
class Human extends Mammals{

    void sound(){
        System.out.println("Speak English");
    }
}



class Fish extends Animal{

    void swim(){
        System.out.println("Swim");
    }
}

class Shark extends Fish{
    void big(){
        System.out.println("VERY BIG");
    }
}



class Bird extends Animal{

    void fly(){
        System.out.println("fly");    
    }
}

class Parrot extends Bird{

    void food(){
        System.out.println("spicey");
    }
}

