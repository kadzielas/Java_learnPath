package OOP.interfaces;

public class Car implements Vehicle{
    public void move(){
        System.out.println("Move");
    }
    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void turn() {
        System.out.println("Engine is ON");
    }

    @Override
    public float getTopSpeed() {
        return 200;
    }
}
