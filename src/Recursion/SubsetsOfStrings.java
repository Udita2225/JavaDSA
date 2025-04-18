package Recursion;

public class SubsetsOfStrings {
    public static void printSubsets(int i , String s, String ans){
        if(i==s.length()){
            System.out.print(ans+ " ");
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1,s,ans+ch);//take
        printSubsets(i+1,s,ans);//not take
        //Output
        //abc ab ac a bc b c

        //Agar upar wali dono statements ka order badal denge to output Hoga

        /*printSubsets(i+1,s,ans);//not take
        printSubsets(i+1,s,ans+ch);//take*/
        //Output
        // c b bc a ac ab abc
    }
    public static void main(String[] args) {
        String s =  "abc";
        printSubsets(0,s,"");
    }
}
