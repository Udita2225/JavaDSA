package OOPS;
//Classes are Pass By Reference
public class ClassOutsideMainFunction {
    //yaha par humne main method ke bahar class banai hai
    //When classes are made outside the main function. They are accessible ad can be
    // updated in the built-in function
        public static class Student{
        String name;
        int rno;
        double percent;
    }
public static void change(Student x){
    x.name = "Udita";
    return;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Raghav";
        s1.rno = 76;
        s1.percent = 92.5;
        System.out.println(s1.name);//Raghav
        //updation
        s1.name = "Rahul";
        System.out.println(s1.name);//Rahul
        change(s1);
        System.out.println(s1.name);//Udita
    }
}
