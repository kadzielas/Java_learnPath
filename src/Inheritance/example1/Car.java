package Inheritance.example1;

public class Car extends Vehicle {

    Car(){
        super();
        this.type = "Car";
        this.manufacturer = "Ford";
        topSpeed = 200;
    }

    Car(String manufacturer, float topSpeed){
        this();
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }


}
