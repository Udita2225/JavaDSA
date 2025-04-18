package Stacks_Interview_Questions;
import java.util.Scanner;
import java.util.Stack;
public class BalancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st =  new Stack<>();
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else {//ch ==')'
                if(st.size()==0) return false;
                else if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       //sc.next -It takes string input uptill spacebar only ||  sc.nextLine -It takes input of the whole string.
        System.out.println(isBalanced(str));
    }
}
