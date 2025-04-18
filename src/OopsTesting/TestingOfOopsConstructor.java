package OopsTesting;
import OOPS.Constructor;
public class TestingOfOopsConstructor {
    public static void main(String[] args) {
        Constructor c = new Constructor("Udita",66,98);
        Constructor c2 = new Constructor();
        System.out.println(c.percent);
        c2.name = "Raghav";
        c.percent = 99;//We can also update the value
        System.out.println(c.name);
        System.out.println(c2.percent);
        System.out.println(c.percent);
        System.out.println(c2.name);
    }
}
