/*
    Getter and setters
    
    Getters - it is used in class when the info we want are declared private there is no
                direct acces to them so we create the method get to access the info in main class
    
    Setters - used for the setting the new value to attrubutes

    in below code the password is declare private  so we cant access it direct through the object
    so we created the method getpassword to return password to the main function

 */
public class J3_GetterandSetters{

    public static void  main(String args[]){

        Bank b1 = new Bank();
        b1.username ="username";
        b1.setPassword("password");
        System.out.println(b1.getUsername());
        System.out.println(b1.getPassword());




    }
}

class Bank{
    public String username;
    private String password;

    void setPassword(String password){
        this.password =password;
    }

    String getPassword(){
        return this.password;
    }

    String getUsername(){
        return this.username;
    }
}