package OOP.interfaces;

public class interfaceExample {
    public static void main(String[] args) {

        Car car = new Car();
        car.move();
        car.getTopSpeed();

        Vehicle vehicle = new Car();
        Vehicle vehicle1 = car;
        Car someCar = (Car)vehicle1;

        vehicle.getTopSpeed();
        vehicle1.turn();
        someCar.stop();

        Plane plane = new Plane();
        Vehicle planeVehicle = plane;

        plane.move();
        System.out.println(planeVehicle.getTopSpeed());

        Vehicle vehicles[] = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = vehicle1;
        vehicles[2] = plane;

        vehicles[2].move();

        if (vehicles[2] instanceof Plane) {
            Plane somePlane = (Plane)vehicles[2];
            somePlane.turn();

            Flying flyingVehicle = somePlane;
            flyingVehicle.increaseHeight();
        }



    }
}
