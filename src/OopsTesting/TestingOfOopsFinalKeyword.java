package OopsTesting;

import OOPS.FinalKeyword;

public class TestingOfOopsFinalKeyword {
    public static void main(String[] args) {
        FinalKeyword  f = new FinalKeyword();
        f.name = "Udita";
        f.rno = 26;
        f.percent = 99;
        //f.schoolName  = "DPS";
        //ERROR : - cannot assign a value to final variable schoolName
        //No setter, no getter and no function can change the value of that
        //attribute which has final written before it but yes we can definitely use and access them
        System.out.println(f.schoolName);
        FinalKeyword f2 = new FinalKeyword();
        System.out.println(f2.schoolName);
    }
}
