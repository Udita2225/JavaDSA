package LOOPS;
import java.util.Scanner;
public class PrintingEvenNumbersfrom1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for(int i =1; i<=100; i++){
//            if(i%2==0){ //iski help se table bhi print kar sakte hain
//                System.out.println(i);
//            }
        //yaha par sir 50 rounds hain but loops 100 baar chal rahe hain
        for(int i =2; i<=100; i+=2){
            System.out.println(i);
        }//agar humne i=1 kar diya to saare odd numbers print ho jaaenge
        }
    }

//Rounds/Iterations - No of times 'i' changes its value