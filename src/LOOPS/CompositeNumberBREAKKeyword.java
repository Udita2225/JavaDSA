package LOOPS;
import java.util.Scanner;
public class CompositeNumberBREAKKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int x =0; // 0 means prime {on/off }state
        for(int i=2; i<=n-1; i++){
            if(n%i==0){//i is a factor of n
                System.out.println(n + " is a Composite Number");
                x =1; //1 means composite;
                break;}
               }
            //is code me ek mistake hai
            //Agar hum break nahi lagate hain to printing utni baar hogi jitni baar i 'n' ka factor aayega
            //For eg- if n=24 ...to 2 se 23 tk ek loop chalaya gaya..
            //to 2,3,4,6 har time 24 i se divisible hai isliye  6 baar printing hogi jo ki galat hai
            //Agar hume 2 par hi pata chal jaaye ki 24 2  se divisible hai yaani given
            // number ke factors 1, n aur 2 hogaye.. yaani ye ek composite number hai ..to usi time loop
            // toot jaana chahiye..
            //jaise ehi ek statement true ho jaaye loop toot jaana chahiye ..
            //iske liye break statement ka use kiya jaata hai
            //break lagane se loop bich me hi toot jaata hai
        if(n==1) System.out.println("Neither PRIME nor COMPOSITE");
        else if(x==0){ System.out.println("Prime number");}

    }
}
