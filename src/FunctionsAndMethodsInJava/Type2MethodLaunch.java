package FunctionsAndMethodsInJava;
//Method with no parameter but with a return value
class Calculator1{//Called Method
    int a, b, res;
    int add(){
        a =10; b=20; res=a+b;
        return res;
    }}
public class Type2MethodLaunch {
    public static void main(String[] args) {//Calling Method
        Calculator1 calc= new Calculator1();
        int sum =calc.add();
        System.out.println(sum);}}
