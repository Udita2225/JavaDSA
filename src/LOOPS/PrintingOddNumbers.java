package LOOPS;

public class PrintingOddNumbers {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){//yaha par loop 100 baar chal raha hai
                                    //jo ki ek wastage hai , print to 50 cheeze hi ho rahi hain

            if(i%2 !=0){
                System.out.println(i);
            }
        }
    }
}
