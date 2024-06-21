package Strings;
import java.util.*;
public class PerformanceOfStrings {
    public static void main(String[] args) {
        /*
    POOR PERFORMANCE - due to immutability
    Performance can be improved using StringBuilders
    String str = "a";
    str += 'b';
    str += 'c';
    //Time Complexity Increase ho rahi hai aur Space bhi jyada use ho raha hai
*/
        String str = "";
        for(int i =1; i<=10; i++){
            str = str + i;
        }
        // "" "1" "12"
        //Total Number Of Operations = n(n+1)/2
        System.out.println(str);
    }
}