package Stacks_Interview_Questions;
import java.util.Scanner;
import java.util.Stack;

public class MinBracketsToMakeStringBalanced {
    public static int RemoveMinBrackets(String s){
        Stack<Character> st = new Stack<>();
        int n =s.length();
        int count =0;
        for(int i=0; i<n; i++){
            char ch =s.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(st.size()==0) count++;
                else if(st.peek()=='(') st.pop();
            }
        }

        if(st.size()==0){
            return count;
        }
        else {
            while(st.size()!=0){
                st.pop();
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =RemoveMinBrackets(s);
        if(count==0){
            System.out.println("The String is Balanced");
        }
        System.out.println(count);
    }
}
