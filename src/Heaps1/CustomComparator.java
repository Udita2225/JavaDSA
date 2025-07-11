package Heaps1;
import java.util.Arrays;
class Student implements Comparable<Student>{
    int rno;
    double percentage;
    String name;
    Student(int rno, double percentage, String name){
        this.rno = rno;
        this.percentage = percentage;
        this.name = name;
    }
    public int compareTo(Student s){
    return this.rno - s.rno;//Sorting ab rno ke basis par hogi
    /*
    13 95.8 Amritanshu
    76 89.5 Raghav
    83 50.3 Himanshu
    88 78.1 Prachi
    */
    /*On the basis of percentage which is in double
    return (int)(this.percentage - s.percentage);
    83 50.3 Himanshu
    88 78.1 Prachi
    76 89.5 Raghav
    13 95.8 Amritanshu
     */

        /*On the basis of name
    return this.name.charAt(0) - s.name.charAt(0);
    13 95.8 Amritanshu
    83 50.3 Himanshu
    88 78.1 Prachi
    76 89.5 Raghav
      */
    }
}
public class CustomComparator {
    public static void print(Student[] s){
       for(int i=0; i<s.length; i++){
           System.out.print(s[i].rno + " ");
           System.out.print(s[i].percentage+ " ");
           System.out.println(s[i].name);
       }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(76,89.5,"Raghav");
        s[1] = new Student(88,78.1,"Prachi" );
        s[2] = new Student(13,95.8,"Amritanshu");
        s[3] = new Student(83,50.3,"Himanshu");
        print(s);
//        Arrays.sort(s);
//        print(s); It will give error as Arrays.sort() cannot decide on the basis of which variable it should sort s as s is an object.
        Arrays.sort(s);
        print(s);
    }
}
