package Inheritance.abstract_classes;

public class AbstractExample {
    public static void main(String[] args) {

        Employee worker1 = new Employee("Nigi", "Byczek", 27);
        worker1.printInfo();

        Manager manager = new Manager("Kuwejt", "Bibix", 37, "XES");
        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName());

//        Person person2 = new Person();     - nie można stworzyć obiektu z klasy abstract

    }
}
