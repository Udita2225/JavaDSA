package OOPS;

public class StaticKeyword {
    public int rno;
    public String name;
    public double percent;
    private static int NumberOfStudents;
    public StaticKeyword(){

    }
    public StaticKeyword(int rno, String name, double percent){
        this.rno = rno;
        this.name = name;
        this.percent = percent;
        NumberOfStudents++;
    }
    public static int getNumberOfStudents(){
        return NumberOfStudents;
    }
}

