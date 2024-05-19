package LOOPS;
import java.util.Scanner;
public class PrintingHelloWorldNTimes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();//n is user input
        for(int i =1; i<=n; i++){
            System.out.println("Hello World");
        }
    }
}
//How LOOP works
/* for(int i =1; i<=n; i++){         //int i -Initialisation    //i<=n - Condition //i++ - Increment
 System.out.println("hello world); body of the loop

 }
 */
/*Steps
1. Initialisation
2. Condition Check> (Condition if true)Go Inside Loop>Increment //ye steps repeat hote rahenge
//When the condition is False, the loop breaks;
i ki value ye decide kar rahi hai ki loop kitni baar chalega
 */