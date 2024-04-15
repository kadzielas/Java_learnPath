package OOP.interfaces;

public class Plane implements Vehicle, Flying{
    @Override
    public void move() {
        System.out.println("Plane is moving");
    }

    @Override
    public void stop() {
        System.out.println("Plane stop");
    }

    @Override
    public void turn() {
        System.out.println("Plane is turned ON");
    }

    @Override
    public float getTopSpeed() {
        return 900;
    }

    @Override
    public void increaseHeight() {
        System.out.println("Plane is increasing height");
    }

    @Override
    public void decreaseHeight() {
        System.out.println("Plane is decreasing height");
    }
}
