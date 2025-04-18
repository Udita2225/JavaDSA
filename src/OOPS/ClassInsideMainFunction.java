package OOPS;

public class ClassInsideMainFunction {
    /*
    public static void fun(Student x){
    System.out.println(x.name);
    }*/
    //This will not access s1 because the scope of class Student is limited inside the main function only
    public static void fun(String x){
        System.out.println(x);
        return;
    }
    public static void main(String[] args) {
        //Ye class humne main function ke andar banai hai
        //When we write class inside main function , the updating and accessing the values
        //from an extra function will not be possible.
        class Student {
            String name;
            int rno;
            double percent;
        }
        String s ="Udita";
        fun(s);
        Student s1 = new Student();
        s1.name = "Raghav";
        s1.rno = 76;
        s1.percent = 92.5;
        //fun(s1); Not valid
    }
}