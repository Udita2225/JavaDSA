package Strings;
import java.util.*;
public class AddingIntCharOrStringToAString {
    public static void main(String[] args) {
        //String + Int/Char/String
        Scanner sc = new Scanner(System.in);
        //When we add int /char to string then they are first converted to string and then gets added to the String
        String str  = "abc"; //abc
        str += "xyz" ; //abcxyz
        str += 'r' ;  //abcxyzr
        str += 10;    //abcxyzr10
        System.out.println(str);
        System.out.println(str+ "abc" + 'b'+ 10);//abcxyzr10abcb10
        System.out.println("abc" + "xyz" + 'r' + 10);//abcxyzr10
        System.out.println("abc"+ 10+20);//abc1020
        //As Operators run left to Right
        System.out.println(10+20+"abc"); //30abc
        System.out.println("abc"+(10+20));//abc30 (Brackets have more precedence
    }
}



