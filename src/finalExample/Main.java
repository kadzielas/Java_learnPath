package finalExample;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan", "Kowalski");
        Administrator administrator = new Administrator("Admin", "Zawodowiec", "PL900");
        Programmer programmer = new Programmer("Programmer", "Amator", "Java");


        administrator.printInfo();
        programmer.printInfo();
        employee.printInfo();
    }
}
