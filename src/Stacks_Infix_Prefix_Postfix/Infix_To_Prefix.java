package Stacks_Infix_Prefix_Postfix;
import java.util.*;
public class Infix_To_Prefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        //9-(5+3)*4/6
        //-9/*+5346
        System.out.println("Infix " + infix);
        Stack<String> val =new Stack<>();
        Stack<Character> op =new Stack<>();
        int n =infix.length();
        for(int i=0; i<n; i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){// 0 to 9
                String s = "" + ch;
                val.push(s);
            }
            else if(op.size()==0 || op.peek() == '(' || ch=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='(') {
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o+v1+v2;
                    val.push(t);
                }
                op.pop(); //'(' hata diya
            }
            else{
                if(ch=='+' || ch== '-'){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o+v1+v2;
                    val.push(t);
                    //push
                    op.push(ch);
                }
                else if(ch=='*'||ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        //push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o+v1+v2;
            val.push(t);
        }
        String prefix = val.pop();
        System.out.println("Prefix " + prefix);
    }
}
