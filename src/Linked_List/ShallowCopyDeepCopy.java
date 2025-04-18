package Linked_List;

public class ShallowCopyDeepCopy {
    //Shallow Copy me hamare purane waale node ko bas ek naya naam de diya jaata hai
    //Yaha par koi dusri copy nahi banti hai
    public static void main(String[] args) {
        Node a = new Node(10);
        //SHALLOW COPY

        /*
        Shallow copy --> yaha par koi naya node nahi bana hai
        Shallow Copy me hum jo bhi changes karte hain wo original node me reflect hota hai
        Shallow Copy ki help se hum original node me changes bhi kar sakte hain
        Node temp =a;
        System.out.println(a.val);//10
        System.out.println(temp.val);//10
        System.out.println(a);//Linked_List.Node@5f184fc6
        System.out.println(temp);//Linked_List.Node@5f184fc6
        */

        //DEEP COPY
        /*
        Node temp = new Node(10); //Yaha par ek naya node bana hai  jiska address node 'a' se alag hai.
        System.out.println(a.val); //10
        System.out.println(temp.val);//10
        System.out.println(a);//Linked_List.Node@5f184fc6
        System.out.println(temp);//Linked_List.Node@3feba861
        //Here we can see that the addresses of a and temp are different.
        //"New" keyword makes an another object
        */
    }
}
