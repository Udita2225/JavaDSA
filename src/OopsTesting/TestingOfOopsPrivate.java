package OopsTesting;

import OOPS.AccessModifiersPrivate.Children;


public class TestingOfOopsPrivate {
    public static void main(String[] args) {
        Children c = new Children();
        c.name = "Gola"; //This is public
//        c.rno = 1;     //This is private
        c.percent = 98;//This is public
//        System.out.println(c.rno); This shows error
        //rno has private access in OOPS.AccessModifiersPrivate.Children



    }
}
