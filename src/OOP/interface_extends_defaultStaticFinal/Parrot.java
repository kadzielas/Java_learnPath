package OOP.interface_extends_defaultStaticFinal;

public class Parrot implements Bird{
    @Override
    public int getNumLegs() {
        return 2;
    }

    @Override
    public String getName() {
        return "Parrot";
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void searchForFood() {
        System.out.println("Parrot is looking for food");
    }
}
