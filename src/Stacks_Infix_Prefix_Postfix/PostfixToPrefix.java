package Stacks_Infix_Prefix_Postfix;
import java.util.*;
public class PostfixToPrefix {
    public static void main(String[] args) {
        String st = "953+4*6/-";
        int n = st.length();
        Stack<String> val = new Stack<>();
        for(int i =0; i<n; i++){
            char ch = st.charAt(i);
            int ascii =(int)ch;
            if(ascii>=48 && ascii<=57){
                String x = "" + ch;
                val.push(x);
            }
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                String t = ch+v1+v2;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
