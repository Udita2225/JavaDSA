package OOPS;
import java.util.*;
public class PassByValue {
    public static void change(int x){
        x =7;
        return;
    }
    public static void main(String[] args) {
        int x =5;
        System.out.println(x);//5
        change(x);
        System.out.println(x);//5 No change in the value of x as it is passed by value
        //Arrays and classes are passed by reference.
    }
}
