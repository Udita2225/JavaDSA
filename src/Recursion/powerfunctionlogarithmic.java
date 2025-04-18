package Recursion;
import java.util.*;

public class powerfunctionlogarithmic {
    //Time Complexity is O(log b) which is much much smaller than O(b)

    public static int pow(int a, int b){
        if(b==0) return 1;
        int ans = pow(a, b/2);
        if(b%2==0){
            return ans*ans;
        }
        else return ans*ans*a;
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
