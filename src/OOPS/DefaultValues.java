package OOPS;
import java.util.*;
public class DefaultValues {
    //We have accessed the data type Student from the user defined class in Student file.
    //Without using import statement i.e., import OOPS.Student;
    public static void main(String[] args) {
        //Default values whe we have not initialised the attributes of class
        Student s = new Student();
        System.out.println(s.name);//null
        System.out.println(s.rno);//0
        System.out.println(s.percent);//0.0
    }
}
