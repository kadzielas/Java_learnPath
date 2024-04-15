package modifiers;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Romet", "Zapierdalacz");
        bike.printInfo();
        MotorBike motorBike = new MotorBike("Niger", "BlackUltra");
        motorBike.printInfo();
    }
}
