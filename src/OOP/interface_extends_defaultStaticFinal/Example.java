package OOP.interface_extends_defaultStaticFinal;

public class Example {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.searchForFood();
        parrot.getDefaultWingspan();
        System.out.println(parrot.getDefaultWingspan());
        System.out.println("Default number of wings: " + Flying.getDefaultNumWings());
    }
}
