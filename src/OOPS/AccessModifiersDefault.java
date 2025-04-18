package OOPS;
import java.util.*;
public class AccessModifiersDefault {
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    public static void main(String[] args) {
    Student s = new Student();
    s.name = "Udita";
    s.rno = 11;
    s.percent = 92.8;
        System.out.println(s.name);
    }
}
