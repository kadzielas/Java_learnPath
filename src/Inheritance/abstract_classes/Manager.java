package Inheritance.abstract_classes;

public class Manager extends Employee{
    private String department;

    public Manager(String name, String surname, int age, String department) {
        super(name, surname, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
