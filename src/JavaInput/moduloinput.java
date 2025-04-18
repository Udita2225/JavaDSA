package JavaInput;
import java.util.Scanner;
public class moduloinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend : ");
        int x = sc.nextInt();
        System.out.println("Enter Divisor : ");
        int y = sc.nextInt();
        int r = x%y; //% is teh modulus operator
        System.out.println("The remainder when "+x+" is divided by "+y+" is: "+r);
        //Modulo Operator
        //a%b=a if(a<b);
        //a%-b =a%b;
    }
}
