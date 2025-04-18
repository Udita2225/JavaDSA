package Recursion;
import java.util.*;
public class powerlinear {
    public static int pow(int a, int b) { //Time Complexity is O(b)
        //As the number of operations/ calls is equal to b
        if (b == 0) return 1;
        return a * pow(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();
        if(a==0 && b==0){
            System.out.print("Not Defined");
        }
        else{
            System.out.println(a + " raised to the power " + b + " is " + pow(a, b));
        }
    }
}
