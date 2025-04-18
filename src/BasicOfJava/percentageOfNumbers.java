package BasicOfJava;
//code for calculating percentage
public class percentageOfNumbers {
    public static void main(String[] args) {//meaningful names should be given o teh variables
        double x1=100;//maths
        double x2 =92;//chem
        double x3= 90;//eng
        double x4=89;//eco
        double x5=98;//bio;
        double p =(x1+x2+x3+x4+x5)/5;
        System.out.println(p);
        double maths =55;
        double eng = 45;
        double hindi = 56;
        double comp =34;
        double per = ((maths+eng+hindi+comp)/240)*100;
        System.out.println(per);
    }
}
