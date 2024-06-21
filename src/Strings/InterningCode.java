package Strings;

public class InterningCode {
    public static void main(String[] args) {
        //Technically ek hi string bani hai aur s aur t dono use point kar rahe hain
        String s = "Hello";
        String t = "Hello";
        t = "Mello";//Agar ye array hota to array s me bhi changes reflect hote but since it is String yaha par esa nahi hota
        System.out.println(s);
        System.out.println(t);
        /*
        Memory me sabse pehle ek string s Hello bana jise ek address mil gaya
        t bhi ise hi point kar raha hai
        But jab humne t ="Mello" kiya tab it doesn't mean ki existing String "Hello" me koi change aaya hai because
        STRINGS ARE IMMUTABLE
        It just shows that t ab "Mello" ko point kar raha hai
         */
    }
}
