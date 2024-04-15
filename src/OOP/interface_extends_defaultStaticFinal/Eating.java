package OOP.interface_extends_defaultStaticFinal;

public interface Eating {
    public void eat();
    public default void searchForFood(){
        System.out.println("Searching for food");
    }
}
