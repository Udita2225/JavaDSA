package StringBuilderClass;
import java.util.*;
public class StringBuilderBasics {
    //Declaration
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        //We can't add anything to a stringBuilder like Strings
        //Important Function- str.append() It is useful to add Some String/Integer/Character To a StringBuilder
        str.append("World");
        System.out.println(str);
    }

}