package BasicOfJava;

public class MultipleVariables {
    public static void main(String[] args) {
        /*way1
        int x=5;
        int y=6;
        int z=7;*/
        /*way 2
        int x,y,z; teen dabbe create ho gaye
        x=5;
        y=6;
        z=89;*/
        //way 3
        int x=5, y=8, z=9;
        System.out.print("The value of x is:");

        System.out.println(x);
        System.out.print("The value of y is ");
        System.out.println(y+100);
        System.out.print("The value of z is ");
        z=10;
        z=7;
        z=x; // z dabbe me x ki value daal do
        System.out.println(z);
        z = x+y; //x+y ki value z me daal do
        System.out.println(z);
        z = x/y;
        System.out.println(z);//z=0
        //why to waste two three lines for  a single variable
        System.out.println("The value of x is "+ x );//printing text with number in a single line
        System.out.println("The value of y is " + y);//kabhi bhi text ke saath + hota hai koi
                                                     // number to, number pehle text me convert hota hai
        System.out.println("The value of z is " + z);
        System.out.println(x+y+z); //as numbers print ho raha hai
        System.out.println("mast cheez " +x+y+z); //yaha par as numbers print nahi  huwa(x+y+z)
        //kisi bhi number eke saath agar ek text  ya double quotes bhi aa jaye to wo bhi text ban jaata hai
        //"mast cheez" + "5" +"8"+ "0"
        System.out.println(x+y+""+z);//computer me cheeze let to right chalti hain, pehle x+y add
                                     // huwa fir integer +text = text
        System.out.println("hello pw"+ "hello cw");//+ aane ki wajah se do text single text me badal jaate hain




    }
}
