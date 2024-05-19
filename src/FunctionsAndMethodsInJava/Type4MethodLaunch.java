package FunctionsAndMethodsInJava;
//Method with parameters and  a return value
class Calculator3{
    int res;
    int add(int x, int y){
        res = x+y;
        return res;//output 30;
    }
}
public class Type4MethodLaunch {
    public static void main(String[] args) {
        Calculator3 calc =new Calculator3();
        int a =10;
        int b=20;
        int sum = calc.add(a,b);
        System.out.println(sum);
        //When return statement is executed, immediately from the same point, the control
        //exits the method with the value being returned
        //just a single value can be returned;
    }
}
