package LOOPS;
import java.util.Scanner;
public class PrintingNumberseitherDivisibleby5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i =1; i<=100; i++){
            if(i%5==0 || i%3==0){
                System.out.println(i);
            }
        }


    }
}