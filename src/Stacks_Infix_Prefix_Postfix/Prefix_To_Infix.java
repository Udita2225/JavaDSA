package Stacks_Infix_Prefix_Postfix;
import java.util.*;
public class Prefix_To_Infix {
    public static void main(String[] args) {
        String st = "-9/*+5346";
        int n = st.length();
        Stack<String> val = new Stack<>();
        for(int i=n-1; i>=0; i--){
            char ch = st.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String x = "" + ch;
                val.push(x);
            }
            else{
                String v1 =val.pop();
                String v2 =val.pop();
                String y = '(' + v1+ ch +v2 +')';
                val.push(y);
            }
        }
        System.out.println(val.peek());
    }
}
