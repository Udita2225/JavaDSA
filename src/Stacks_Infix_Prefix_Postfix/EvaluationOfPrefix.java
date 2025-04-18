package Stacks_Infix_Prefix_Postfix;
import java.util.*;
public class EvaluationOfPrefix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        int n = str.length();
        Stack<Integer> val = new Stack<>();
        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch== '+') val.push(v1+v2);
                else if(ch== '-') val.push(v1-v2);
                else if(ch== '*') val.push(v1*v2);
                else if(ch== '/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }

}
