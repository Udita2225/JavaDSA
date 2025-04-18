package OOPS;
import java.util.*;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int x = sc.nextInt();
      //Here Scanner is an in-Built Class
      //sc is the name of the Object
      //x is a dabba jisme input store hoga
        Student s = new Student();
        s.name = "Udita";
        System.out.println(s.name);
    }
}
