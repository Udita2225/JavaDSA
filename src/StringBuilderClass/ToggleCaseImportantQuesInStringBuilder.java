package StringBuilderClass;
import java.util.*;
public class ToggleCaseImportantQuesInStringBuilder {
    public static void main(String[] args) {
        //Given a string, the task is to toggle all the characters of the string i.e to convert UpperCase to LowerCase and vice versa
        //Input - PhysICS
        //Output - pHYSics
        /*
        ASCII VALUE:-
        A-65    a-97    0-48
         Difference Between ASCII Value Of A and a = 32
     */
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        //Toggle
        //PHysiCs -> phYSIcS
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if(ch == ' ') continue;
//            int ascii = (int) ch;
//            boolean flag = true; //Capital
//            if (ascii >= 97) {
//                //small
//                flag = false;
//            }
//            if (flag == true) {
//                //boolean flag = true
//                ascii += 32;
//                char dh = (char) ascii;
//                str.setCharAt(i, dh);
//            } else {//flag==false
//                ascii -= 32;
//                char dh = (char)ascii;
//                str.setCharAt(i,dh);
//            }
//        }
//        System.out.println(str);
        //CODE TO IGNORE ALL THE CHARACTERS APART FROM ALPHABETS
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
                    str.setCharAt(i, dh);
                } else {//flag==false
                    ascii -= 32;
                    char dh = (char) ascii;
                    str.setCharAt(i, dh);
                }
            }
        }
            System.out.println(str);
    }
}