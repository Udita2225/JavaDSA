package OopsTesting;

import OOPS.AccessModifierPublic.Car;//This is the correct path

public class TestingOfOopsPublic {
    public static void main(String[] args) {
        Car t = new Car();
        //All these attributes are accessible because they are public in the class Car
        t.name = "WagonR";
        t.brand = "MARUTI SUZUKI";
        t.no = 5050;
        System.out.println(t.name);

    }
}
