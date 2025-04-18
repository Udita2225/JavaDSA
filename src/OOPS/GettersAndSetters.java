package OOPS;
import java.util.*;
public class GettersAndSetters {
    public String name;
    private int rno;//private ki cheez dot operator se access nahi ki jaa sakti hai
    public double percent;
    //This is a function
    //getter
    public int getRno(){
        return rno;//same class ke andar hum private cheez to use kar sakte hain
    }
   //Now we can access this function using dot operator

    //Setter
    public void setRno(int roll){//setter
        rno = roll;
    }
}
