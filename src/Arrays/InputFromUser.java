package Arrays;
import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr = new int[n];
        //input -> loop
        for(int i =0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        //output -> loop
        for(int i =0; i<=n-1; i++){
            System.out.println(arr[i]);
        }
    }
}
