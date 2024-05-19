package FunctionsAndMethodsInJava;
//Method with parameters and no return value
class Calculator2{
    int res;
    void add(int x, int y){//FORMAL PARAMETERS /PARAMETERS
      res =x+y;
        System.out.println(res);//output 30
    }}
public class Type3MethodLaunch {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        int a = 10;
        int b = 20;
        calc.add(a, b);//ACTUAL PARAMETERS/ARGUMENTS
    }
    }
