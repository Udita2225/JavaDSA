package OOPS;

public class Constructor {
    public String name;
    public int rno;
    public double percent;
    public Constructor(){

    }
    //Default constructor
    //It is very necessary because this allows us to either pass the values in
    //the Constructor function or write them line by line separately.
    //If we don't build default constructor then we will have to pass the value in the function.
    //Constructor c = new Constructor(); The brackets can't be empty without default constructor
    public Constructor(String name, int rno, double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
    }
}
