public class J14_Super_Keyword{

    public static void main(String args[]){

        // it is a keywork used to called parent function,constructor,properties etc
        Horse h = new  Horse();
        System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("This is Animal Class Constructor");
    }
}
class Horse extends Animal{
    Horse(){
        super.color ="Grey";
        System.out.println("This is Horse Class Constructor");
    }
}
