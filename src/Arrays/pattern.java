package Arrays;

public class pattern {
    public static void main(String[] args) {

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print("*"+ " ");
            }
            for(int k=0; k<2; k++){
                System.out.print(" ");
            }
            for(int l=0; l<3; l++){
                System.out.print("*"+ " ");
            }
            for(int m=0; m<2; m++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<5; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
//        System.out.println("* * * * * *");
//        for(int i=0; i<5; i++){
//            for(int j=4; j>=i; j--){
//                System.out.print("*"+ " ");
//            }
//            System.out.println();
//        }
    }
}
