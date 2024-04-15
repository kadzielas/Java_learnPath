package Inheritance.example1;


public class Inheritance {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.printInfo();

        Car car = new Car();
        car.printInfo();

        Car car2 = new Car("Toyota", 230.0f);
        car2.printInfo();

        Bicycle bicycle = new Bicycle();
        bicycle.printInfo();

        SuperCar supercar = new SuperCar();
        supercar.printInfo();

    }
}
