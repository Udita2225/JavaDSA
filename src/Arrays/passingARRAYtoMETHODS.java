package Arrays;

public class passingARRAYtoMETHODS {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr)
    //public static void change(int[] x)
    {
        arr[0] = 90;
    }
}

        //Arrays me values pass karne ke baad agar called method me
        // changes ho to wo calling function me bhi change hone lagte hain even if we change the name of the parameters
        //Arrays jab hum method me bhejte hain to ye pass by reference hota hai
        //x ya fir arr ek reference variable hai
        //Array to ek hi hai bas uske naam change ho rahe hain
        //When we pass an array as an argument to a method then address (Reference variable in java) of the array gets passed


