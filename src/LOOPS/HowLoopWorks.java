package LOOPS;
import java.util.Scanner;
public class HowLoopWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for(i =10; i<=14; i++){//loop se pehle bhi declaration kar sakte hain
            System.out.println("hi");
        }
        System.out.println(i);
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