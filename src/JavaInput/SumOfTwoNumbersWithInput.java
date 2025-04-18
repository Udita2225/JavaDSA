package JavaInput; //JavaInput ka folder hai jiske andar ye file hai
import java.util.Scanner; //input lene ke liye humesha likhna hi hota hai
public class SumOfTwoNumbersWithInput { //file ka naam
    public static void main(String[] args) { //main function
        Scanner sc = new Scanner(System.in);//scanner ban diya
        System.out.print("Enter First Number : ");//seedha "" commas ke andar wala output de rahe hain
        int x = sc.nextInt();//x ka integer wala dabba banaya, jism eiput value scan huwi
        System.out.print("Enter Second Number : ");//ye print huwa output scree me
        int y= sc.nextInt();//ab y dabbe me input value scan huwi
        int sum=x+y;//sum dabbe x+y store ho gaya
        System.out.println("The sum is : " +sum);//the sum is print huwa aur sum ki value calculate
                                                  // hokar output screen par print ho gayi

    }
}
