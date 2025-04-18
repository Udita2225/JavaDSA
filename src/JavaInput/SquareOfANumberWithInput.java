package JavaInput;
import java.util.Scanner;
public class SquareOfANumberWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double x = sc.nextDouble();
        double y = x*x;
        System.out.println("The square of the number x is : "+y);

    }
}
