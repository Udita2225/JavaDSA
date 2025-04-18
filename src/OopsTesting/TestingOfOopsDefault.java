package OopsTesting;

import OOPS.Student;

public class TestingOfOopsDefault {
    public static void main(String[] args) {
        Student s = new Student();
//        s.name = "Udita"; //name is not public in OOPS.Student; cannot be accessed from outside package
//        s.rno = 34;
//        s.percent = 98;
    //Error :-java: name is not public in OOPS.Student;
        // cannot be accessed from outside package

    }
}
