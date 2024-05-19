package LOOPS;
import java.util.Scanner;
public class PrintingTaableOf19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for(int i =19; i<=190; i++){
//            if(i%19==0){
//                System.out.println(i);
                //There is a problem in this code
                //Isme 19 se lekar 190 tak saare numbers check honge, i ki values bhot baar check hongi
                //i=19,20,21,22,23,24,25.....
                //Almost 171 rounds chal rahe hain loop ke
                //Print to sirf 10 cheeze karni hai, 170 baar loop chalane ka koi use nahi
                //i++ = i+1 = i=i+1 = i+=1
                //i++ ki jagah i+=19 , tab if condition lagane ki bhi jarurat nahi
        for(int i=19; i<=190; i+=19){
            System.out.println(i);

            }//ye loop bas 10 baar chal raha hai
        //i ki value ko hi badha kar 19 ke table me likh rahe hain
        }
    }

