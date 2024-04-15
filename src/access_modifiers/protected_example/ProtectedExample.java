package access_modifiers.protected_example;

import access_modifiers.protected_example.package1.Laptop;
import access_modifiers.protected_example.package2.Computer;

public class ProtectedExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setName("Dell");
        System.out.println(computer.getName());

        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());
    }
}
