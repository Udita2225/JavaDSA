package FunctionsAndMethodsInJava;
import java.util.Scanner;
public class NeedOfFunctionsOrMethods {
    /* Function in  class is called METHOD in Java
    Function is a block of code
  Q:-  Taking input of two numbers and printing the sum
  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a =sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b =sc.nextInt();
        double sum= a+b;
        System.out.println("The sum of two numbers is  "+ sum);
    }
}
/*
If we will have to repeat the same task again and again then
merely copy pasting will not help us.
For that reason we use FUNCTIONS;
DRY
Don't Repeat Yourself
 */