package OopsTesting;

import OOPS.thisKeyword;

public class TestingOfOopsthisKeyword {
    public static void main(String[] args) {
        thisKeyword t = new thisKeyword();
        t.name = "THIS";
        System.out.println(t.getRno());
        t.setRno(55);
        System.out.println(t.getRno());
    }
}