package Stacks_Infix_Prefix_Postfix;

import java.util.Stack;

public class EvaluationOfInfix {
    public static void main(String[] args) {
        int x = 9 -(5 + 3)* 4 / 6;
        System.out.println(x);
        String str = "9-(5+3)*4/6";//Now we have to evaluate this
        //6
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);//ch = '9'
            int ascii = (int) ch;// ascii = 57
            //'0' -> 48 and '9'-> 57
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            }
            else if (op.size() == 0 || ch=='(' || op.peek()=='(') {
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    int v2 =val.pop();
                    int v1 =val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    else if(op.peek()=='+') val.push(v1+v2);
                    else if(op.peek()=='*') val.push(v1*v2);
                    else if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop(); // '(' hata diya
            }
            else {
                if (ch == '+' || ch == '-') {
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-') val.push(v1 - v2);
                    else if (op.peek() == '+') val.push(v1 + v2);
                    else if (op.peek() == '*') val.push(v1 * v2);
                    else if (op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                    //push
                    op.push(ch);
                }
                else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        //work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '*') val.push(v1 * v2);
                        else if (op.peek() == '/') val.push(v1 / v2);
                        op.pop();
                        //push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        //Here the iteration through the string finishes.
        //val stack size -> 1
        while(val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            else if(op.peek()=='+') val.push(v1+v2);
            else if(op.peek()=='*') val.push(v1*v2);
            else if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}

