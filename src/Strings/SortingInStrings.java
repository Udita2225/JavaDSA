package Strings;
import java.util.Arrays;
public class SortingInStrings {
    public static void main(String[] args) {
        //Character Array can be sorted
        char[] ch = {'u', 'd', 'i', 't', 'a'};
        Arrays.sort(ch);
        System.out.println(ch);
        String str = "raghav";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(str);
        System.out.println(arr);

        //There are no built-in options to sort String or StringBuilder
        StringBuilder sb = new StringBuilder("garg");
//        String y = sb.toString();
        char[] x = sb.toString().toCharArray();
        Arrays.sort(x);
        System.out.println(x);
    }
}
