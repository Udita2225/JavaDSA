package Stacks_Infix_Prefix_Postfix;
import java.util.*;

public class Infix_To_Postfix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6" ; //Infix Expression
        System.out.println("InFix " + str);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int n = str.length();
        for(int i =0; i<n; i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String x =  ""+ ch;
                val.push(x);
            }
            else if(op.size()==0 || op.peek() =='(' || ch =='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    String v2 =val.pop();
                    String v1 =val.pop();
                    char o = op.pop();
                    String t = v1+v2+o;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if(ch == '+' || ch== '-'){
                    //work
                    String v2 =val.pop();
                    String v1 =val.pop();
                    char o = op.pop();
                    String t = v1+v2+o;
                    val.push(t);
                    op.push(ch);
                }
                else if(ch =='*' || ch =='/'){
                    if(op.peek()=='*' || op.peek() =='/'){
                        String v2 =val.pop();
                        String v1 =val.pop();
                        char o= op.pop();
                        String t = v1+v2+o;
                        val.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2 =val.pop();
            String v1 =val.pop();
            char o = op.pop();
            String t = v1+v2+o;
            val.push(t);
        }
        String ans = val.peek();
        System.out.println("PostFix "+ ans);
    }
}
