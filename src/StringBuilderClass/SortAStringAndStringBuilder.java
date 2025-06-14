package StringBuilderClass;
import java.util.*;
public class SortAStringAndStringBuilder {
    public static void main(String[] args) {
        char[] ch = {'z','g','b', 'y' };
        for(char ele: ch){
            System.out.print(ele);//zgby
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele: ch){
            System.out.print(ele);//bgyz
        }
        System.out.println();

        //Sorting A String
        String s ="raghav";
        char[] ch1 = s.toCharArray();
        for(char ele:ch1){
            System.out.print(ele);//raghav
        }
        System.out.println();
        Arrays.sort(ch1);
        for(char ele:ch1){
            System.out.print(ele);//aaghrv
        }
        System.out.println();
        //Sort a StringBuilder
        //It is also Not Possible. No Built-In Function is available
        //Convert StringBuider->String->Character Array(ch)->Arrays.sort(ch)
        StringBuilder sb = new StringBuilder("garg");
        char[] ch2 = sb.toString().toCharArray();
        for(char ele: ch2){
            System.out.print(ele);//garg
        }
        System.out.println();
        Arrays.sort(ch2);
        for(char ele: ch2){
            System.out.print(ele);//aggr
        }
    }
}
