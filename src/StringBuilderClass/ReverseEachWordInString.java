package StringBuilderClass;
import java.util.*;
public class ReverseEachWordInString {
    public static void main(String[] args) {
        //Write a Java Program to reverse each word in String
         /*
         Input - I am an Educator
         Output - I ma na rotacude
          */
        /*
        Algorithm-
        In this question, first of all make an extra Empty String "" for ans
        and an extra Empty StringBuilder sb
        Yaha par space ki wajah se words alag alag ho rahe hain
        Sabse pehle hum string me travel karenge
        Agar hamara sbse pehla character space nahi huwa to hum use Stringbuilder me daal denge .
        Uske baad jab space encounter hoga to us existing stringbuilder ko reverse kar denge
        uske baad use hum string ans me daal denge
        Fir stringbuilder ko khali kar denge aur usme next character daal denge aur ek space de denge and so on
        Jab Hum last word par pahuchenge to wo stringbuilder me to add ho jayega but kyoki uske baad koi space nahi hai to wo reverse nahi
        Hoga.
        Iske liye hume use last me reverse karke ans string me add karna hoga
         */
        //Code
        String str = "I am an Online Educator";
        String ans ="";
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            } else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans+= sb;
        System.out.println(ans);
    }
}
