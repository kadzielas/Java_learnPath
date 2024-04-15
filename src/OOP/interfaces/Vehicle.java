package OOP.interfaces;

public interface Vehicle {

    // Wszystkie metody automatycznie są abstrakcyjne w interfejsach
    public void move();
    public void stop();
    public void turn();
    public float getTopSpeed();
}
