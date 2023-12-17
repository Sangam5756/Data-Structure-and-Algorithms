/*
    private     only within class
    default     within class and package 
    public      within class  package outside of class
    protected   within class and package  and outside using subclass
 */
public class J2_AccessSpecifier{

    public static void  main(String args[]){

        Bank b1 = new Bank();
        b1.username ="sangam";
        b1.setPassword("sangam");



    }
}

class Bank{
    public String username;
    private String password;

    void setPassword(String password){
        this.password =password;
    }
}