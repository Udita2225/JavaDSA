package OopsTesting;

import OOPS.StaticKeyword;

public class TestingOfOopsStatic {
    public static void main(String[] args) {
//        Since the NumberOfStudents variable is a shared variable and a varible of class not of objects .
//        So it can be printed without the initialization of objects.
//        But this also creates a problem the value of the variable NumberOfStudents can easily be manipulated.
//        So in order to tackle the problem we use private keyword and to access its value we make a getter function.
//        int x=  StaticKeyword.NumberOfStudents; private keyword likhte hi ab ye yaha par access nahi ho payega .Ise access karne ke liye getter function banana parega
//        System.out.println(x); //Output =0
          System.out.println(StaticKeyword.getNumberOfStudents());//iske liye hume getter function ko bhi static banana parega tabhi wo class se access ho payega


//        System.out.println(StaticKeyword.name); ERROR :-non-static variable name cannot be referenced from a static context
        StaticKeyword s1 = new StaticKeyword(10, "Udita", 99);
        System.out.println(s1.getNumberOfStudents());
        StaticKeyword s2 = new StaticKeyword(15, "Abhinav", 98);
        System.out.println(s2.getNumberOfStudents());
        System.out.println(s1.getNumberOfStudents());
        System.out.println(s2.getNumberOfStudents());
    }
}
/*
FINAL OUTPUT:-
0
1
2
2
2
 */