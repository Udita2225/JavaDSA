package OopsTesting;
import java.util.*;
import OOPS.GettersAndSetters;

public class TestingOfOopsGettersAndSetters {
    //Dot operator se hum ek attribute ko access kar sakte hain
    //Also Dot operator se hum function ko access kar sakte hain
    public static void main(String[] args) {
        GettersAndSetters gs = new GettersAndSetters();
        gs.name =  "Udita";
        gs.percent = 95.6;
        //gs.rno = 23;
        System.out.println(gs.getRno());//Accessing getRno Function
        //Output = 0 Default value as the value for roll no is not set
        gs.setRno(76);//humne rno ke andar 76 daal diya jabki wo private hai
        System.out.println(gs.getRno());

    }
}