package Inheritance.example1;

public class Vehicle {
    public String type;
    public String manufacturer;
    public float topSpeed;

    Vehicle(){
//        super(); - dodane automatycznie
        type = "unknown";
        manufacturer = "unknown";
        topSpeed = 0;
    }
    public void printInfo(){
        System.out.println(type+ " " + manufacturer + " " + topSpeed);
    }
}
