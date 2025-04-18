package JavaInput;
import java.util.Scanner;

public class FindingRemainderInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Dividend : ");
        int x = sc.nextInt();
        System.out.println("Enter Divisor : ");
        int y = sc.nextInt();
        int q = x/y;
        int r = x - (q*y);
        System.out.println("The remainder when "+x+" is divided by "+y+" is: "+r);

    }
}
