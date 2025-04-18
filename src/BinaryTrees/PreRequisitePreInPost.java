package BinaryTrees;

public class PreRequisitePreInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n+ " ");
        pip(n-1);
        System.out.print(n+ " ");
        pip(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
    pip(3);
    //3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
    }
}
