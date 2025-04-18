package BasicOfJava;
//this is a  single line comment, computer will not read this
/*THis is a multi line comment*/
//shortcut - select all >ctrl+forward slash/
public class IncrementDecrement {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x);
        x++; //x=x+1 same
        System.out.println(x);
        x--; // x=x-1;
        System.out.println(x);
        ++x; //x=x+1;
        System.out.println(x);
        --x; //x=x-1;
        System.out.println(x);
        System.out.println(x++);//print x and then increase the value by 1
        System.out.println(x);//then print the new value of x i.e, 6
        System.out.println(++x);//first increase the value by 1 and the print the value
        System.out.println(x);//print the updated value
        //x++ is "use x and then increment" POST INCREMENT
        //++x is "increment and then use" PRE INCREMENT
    }

}
