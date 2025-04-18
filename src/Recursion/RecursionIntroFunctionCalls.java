package Recursion;
import java.util.*;
public class RecursionIntroFunctionCalls {
    public static void mango(){
        System.out.println("I am in mango");
    }
    public static void banana(){
        mango();
        System.out.println("I am in banana");

    }
    public static void apple() {
        banana();
        System.out.println("Hi I am in apple");
        mango();
    }
    public static void main(String[] args) {
    //FUNCTION CALLS
        System.out.println("Hi, I am in main method");
        apple();
    }
}