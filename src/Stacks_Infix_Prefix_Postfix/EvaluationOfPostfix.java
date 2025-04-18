package Stacks_Infix_Prefix_Postfix;
import java.util.*;
public class EvaluationOfPostfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch == '+') val.push(v1+v2);
                else if(ch == '-') val.push(v1-v2);
                else if(ch == '*') val.push(v1*v2);
                else if(ch == '/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
