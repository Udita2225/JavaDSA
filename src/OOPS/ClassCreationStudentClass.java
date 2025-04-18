package OOPS;
import java.util.*;
public class ClassCreationStudentClass {
    //Creating a new data type with multiple attributes
    public static class Student{    //ye ek blueprint ban gaya hai
        String name; //Student is like a data type int/char/double
        int rno;
        double percent;
    }
    public static void main(String[] args) {
        //Memory allocate ho gayi integer values ko store karne ke liye
        int x ; //Declaration x naam ka ek dabba ban gaya hai
        x =5; //Initialisation x dabbe me 5 value store ki

        Student s = new Student();//s naam ka  ek bada daaba banaya
        s.name = "Raghav";//s dabbe me humne name, roll number aur percent store kar diya
        s.rno = 76;       //Basically We have initialised s variable of the Student Object  using "." dot operator
        s.percent = 92.5;
        //Printing s
        // "." operator is a must
        System.out.println(s.name);
        System.out.println(s.rno);
        System.out.println(s.percent);
        System.out.println(s.percent + 8);//100.5

        Student t = new Student();
        t.name = "Abhinav";
        t.percent = 97.2;
        t.rno = 3;

    }
}
