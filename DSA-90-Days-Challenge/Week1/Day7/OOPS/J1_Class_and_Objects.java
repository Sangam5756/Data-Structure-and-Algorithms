public class J1_Class_and_Objects{

//  class - it is group of entities
// object -- entities in the real world

    public static void main(String args[]){

        Pen p = new Pen();

        p.setColor("Blue");
        System.out.println(p.color);
        p.setTip(4);
        System.out.println(p.tip);


    }

}

class Pen{

    String color;
    int tip;

    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}
