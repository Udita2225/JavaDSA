package Strings;
import java.util.*;
public class ToggleCaseInStrings {
    public static void main(String[] args) {
        String str = "PhYSics";
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                boolean flag = true; //Capital
                if (ascii >= 97 && ascii <= 122) {
                    //small
                    flag = false;
                }
                if (flag == true) {
                    //boolean flag = true
                    ascii += 32;
                    char dh = (char) ascii;
                    str = str.substring(0,i) + dh + str.substring(i+1);

                } else {//flag==false
                    ascii -= 32;
                    char dh = (char) ascii;
                    str = str.substring(0,i) + dh + str.substring(i+1);

                }
            }
        }
        System.out.println(str);

    }

}
//THis is a very bad code beacuse its Time Complexity is very large
//Instead we can use
/*
Convert String into StringBuilder
StringBuilder sb = new StringBuilder(str);
Write the exact code
anD AT LAST CONVERT THE STRING BUILDER into String

 */
