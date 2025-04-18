package JavaInput;//JavaInput naam ke ek folder me hum apna code likh rahe hain

import java.util.Scanner;    //sab kuch small me hai except scanner ka 'S'
public class AreaOfCircleWithInput { //file ka name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //import aur scanner wali line likhni hi likhni hoti hai
        //isi line ki wajah se hum input le paate hain
        //sc ki jagah koi dusra naam bhi de sakte the eg-s, udita ,raghav, x etc but usually "sc" hi use hta hota hai ;
        //"Scanner" hume input lene ke liye allow karta hai
        //new Scanner ka matlab hai hum ek scanner bana rahe hain;
        //"System.in" matlab jo bhi hum keyboard ya mouse se denge input;
        //".in" yani input
        //"System.out" yani output;
        System.out.print("ENTER RADIUS ");
        int radius;            //input lene ke liye sabse pehle ek dabba banao int, ya double ka
        radius = sc.nextInt(); //radius dabbe ke andar scanner(sc.) scan karo ek value ko jo ki integer hai(int dabba
                               //liya hai)
                               //value enter karte hi radius dabbe me value scan (chali) jaati hai
        double pi= 3.1415;     //pi ka ek dabba jisme 3.1415 aa gaya
        double area=pi*radius*radius; //area ka dabba , jisme calculate hokar value chali gayi
        System.out.println("The area of the circle is "+ area);




    }
}
