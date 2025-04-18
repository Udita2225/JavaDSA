package OOPS;

public class AccessModifiersPrivate {
    public static class Children{
        public String name;
        private int rno;
        public double percent;
    }

    public static void main(String[] args) {
        Student c = new Student();
        c.name = "Ruhi";
//        c.rno = 8;
        c.percent = 9.6;
        //System.out.println(c.rno); Yaha par error aa jayega because when Student file me rno private int me store hai
        //Thus it is not accessible.
        //error: java: rno has private access in OOPS.Student


        Children k =  new Children();
        k.name = "Gola";
        k.rno = 3;
        k.percent = 99.8;
        System.out.println(k.rno);//No error even when rno is private
    }

}
