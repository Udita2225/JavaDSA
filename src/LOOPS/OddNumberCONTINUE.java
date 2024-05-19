package LOOPS;
import java.util.Scanner;
public class OddNumberCONTINUE {
    //CONTINUE Keyword - Kuchh particular iterations ko skip kardo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=100; i++){
            if(i%2!=0) {
                System.out.print(i+ " ");
            }
        }
    //50 iterations
        for(int i=1; i<=100; i+=2){
            System.out.println(i);
        }
        //Using continue statement
        for(int i =1; i<=100; i++){
            if(i%2==0){ continue; }//ye continue if statement ka part hai
            System.out.println(i);//ye line if statement ka part nahi
            // hai because continue ke baad terminator aa gaya..
        }

    }


}