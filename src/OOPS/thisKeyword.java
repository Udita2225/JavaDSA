package OOPS;

public class thisKeyword {
    public String name;
    private int rno;
    double percent;
    public int getRno(){
        return rno;
    }
    /* Method 1 By using different name for the parameter
    public void setRno(int x){
      rno = x;
    }
    */
    /* Method 2 Using this. keyword*/
    public void setRno(int rno) {
        this.rno = rno;
        //Left this.rno is for attribute
        //Right rno is for parameter that catches the pass by value
      }
    }
    /*
    public void setRno(int rno){
    rno = rno;
    }
    Yaha par hamara computer confuse ho jayega ki ye rno exactly hai kon sa
    Parameter wala ya fir attributes wala
    aur jab hum print karenge
    System.out.println(t.getRno());
    Tab hume ye 0 return karega chahe humne koi bhi value set ki ho;
    Ise avoid karne ke do methods hain:-
    1. Parameter ka naam attribute ke name se alag rakho
    2. Use this keyword for the name of attribute
    eg- this.rno  = rno;
    this.rno is for the name of the attribute and simple rno is for the name of parameter.
    */

