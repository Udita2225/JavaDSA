package Linked_List;
class Car{
    int price;
    String name;
    Car(){//Default Constructor

    }
    Car(int price, String name){//Parameterised  Constructor
        this.price = price;
        this.name  = name;
    }
}
public class ClassCreationEg{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Kia Sonet";
        c1.price = 120000;
        Car c2 = new Car(500000, "WaGonR");
        System.out.println(c2.price);
    }
}