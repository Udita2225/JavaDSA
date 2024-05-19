package FunctionsAndMethodsInJava;
class Calculator
{
    int a, b, res;
    void add() {
        a = 10;
        b = 20;
        res = a + b;
        System.out.println(res);
    }}
public class Type1MethodLaunch {
    public static void main(String[] args) {
        Calculator calc = new Calculator();//new Calculator is the object for Calculator Class
        //calc is the reference for the object of Calculator;
        calc.add(); //In methods object is necessary

    }//OUTPUT:- 30
}
