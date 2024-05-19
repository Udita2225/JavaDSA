package PatternPrinting;
import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i =1; i<n; i++){
            for(int j =1; j<=i; j++){
                System.out.print((char)(i + 64)+ " ");

            }
            System.out.println();
        }
    }

}
