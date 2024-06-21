package Strings;
import java.util.*;
public class SubstringijAndSubstringiFunction {
    public static void main(String[] args) {
        /*
        subset/subsequences:-
        String str = "abcd";
        {{}, {a},{c},{b}, {d},{a,b},{a,c}, {a,d}, {b,c},{b,d} , {c,d}, {a,b,c}, {a,b,d}, {a,c,d}, {b,c,d}, {a,b,c,d}}
        Difference between subset/subsequence and substring
        substring - Continuous part of String (Ek sequence  me hi hona chahiye/ order aage peeche nahi hona chahiye
        Eg -
        **substring(i,j) [FIRST INDEX AND LAST INDEX]
        a, ab, abc, abcd, b, bc, bcd, c ,cd, d
        String s = "abcd"
        s.substring(0,3) - 0th index to (3-1)th index
               0 = included  3 = Excluded
        s.substring(0,0) = Nothing will be printed

        **substring(i) [ONLY FIRST INDEX] Given Index ke aage ka sab kuchh print ho jayega
        String s = "abcd"
        s.substring(1) = bcd
*/
        String str = "abcde";
        System.out.println(str.substring(0,3)); //abc
        System.out.println(str.substring(2)); //cde
        String s ="physics";
        for(int j=2; j<4; j++){
            System.out.print(s.substring(j));//ysicssics
        }
        System.out.println();
        //Printing All SubStrings
        /*
        a
        a b       b
        a b c     b c       c
        a b c d   b c d     c d    d
         */
        /*
        Input t ="abcd"
        Output a ab abc abcd b bc bcd c cd d
       */
        String t = "abcd";
        for(int i =0; i<=3; i++){
            for(int j=i+1; j<=4; j++)
            System.out.print(t.substring(i,j)+ " ");
        }

    }
}
